package com.ipartek.modelo;

public interface I_Constantes {

	// constantes de la BD
	String BD = "jsp_hotel_izar_gorena";
	String DRIVER = "com.mysql.cj.jdbc.Driver";
	String CONEXION = "jdbc:mysql://localhost:3306/"+BD;
	String USUARIO = "root";
	String PASS = "1234";
	
	//constantes de los JSP
	String JSP_INDEX = "index.jsp";
	String JSP_SERVICIOS = "servicios.jsp";
	String JSP_HABITACIONES = "habitaciones.jsp";
	
	String TABLA_HABITACIONES = "habitaciones";
	String HABITACION_ID = "idHabitacion";
	String HABITACION_NUM = "num_habitacion";
	String HABITACION_METROS = "metros";
	String HABITACION_PRECIO = "precio";
	String HABITACION_NUM_CAMAS = "num_camas";
	String HABITACION_EXTERIOR = "exterior";

	String ATR_LISTA_HABITACIONES = "listaHabitacioens";
	
	String SP_OBTENER_HABITACIONES = "call sp_obtener_habitaciones";
}
