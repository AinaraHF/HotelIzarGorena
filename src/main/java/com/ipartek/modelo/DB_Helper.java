package com.ipartek.modelo;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.modelo.dto.Habitacion;


public class DB_Helper implements I_Constantes{
	
	
	public Connection conectar() {
		Connection con = null;

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(CONEXION, USUARIO, PASS);
			System.out.println("BASE DE DATOS CONECTADA");
		} catch (ClassNotFoundException e) {
			System.out.println("NO SE ENCONTRO EL DRIVER");
		} catch (SQLException e) {
			System.out.println("ERROR AL CONECTAR A LA BD");
		}
		
		return con;
	}

	public void desconectar(Connection con) {
		try {
			con.close();
			System.out.println("BASE DE DATOS DESCONECTADA");
		} catch (SQLException e) {
			System.out.println("NO SE PUDO DESCONECTAR");
		}
	}

	public List<Habitacion> obtenerHabitaciones(Connection con) {

		try {
			
			List<Habitacion> lista = new ArrayList<Habitacion>();
			
			CallableStatement cstmt = con.prepareCall(SP_OBTENER_HABITACIONES);
			
			cstmt.execute();
			
			ResultSet rs = cstmt.getResultSet();
			
			while(rs.next()) {
				
				Habitacion hab = new Habitacion();
				
				hab.setIdHabitacion(rs.getInt(HABITACION_ID));
				hab.setNum_habitacion(rs.getInt(HABITACION_NUM));
				hab.setMetros(rs.getInt(HABITACION_METROS));
				hab.setPrecio(rs.getDouble(HABITACION_PRECIO));
				hab.setNum_camas(rs.getInt(HABITACION_NUM_CAMAS));
				hab.setExterior(rs.getBoolean(HABITACION_EXTERIOR));
				
				lista.add(hab);
			}
			
			return lista;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
