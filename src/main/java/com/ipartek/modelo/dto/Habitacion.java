package com.ipartek.modelo.dto;

public class Habitacion {

	private int idHabitacion;
	private int num_habitacion;
	private int metros;
	private double precio;
	private int num_camas;
	private boolean exterior;
	
	public Habitacion(int idHabitacion, int num_habitacion, int metros, double precio, int num_camas,
			boolean exterior) {
		super();
		this.idHabitacion = idHabitacion;
		this.num_habitacion = num_habitacion;
		this.metros = metros;
		this.precio = precio;
		this.num_camas = num_camas;
		this.exterior = exterior;
	}
	
	public Habitacion() {
		super();
		this.idHabitacion = 0;
		this.num_habitacion = 0;
		this.metros = 0;
		this.precio = 0.0;
		this.num_camas = 0;
		this.exterior = false;
	}

	public int getIdHabitacion() {
		return idHabitacion;
	}

	public void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}

	public int getNum_habitacion() {
		return num_habitacion;
	}

	public void setNum_habitacion(int num_habitacion) {
		this.num_habitacion = num_habitacion;
	}

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNum_camas() {
		return num_camas;
	}

	public void setNum_camas(int num_camas) {
		this.num_camas = num_camas;
	}

	public boolean isExterior() {
		return exterior;
	}

	public void setExterior(boolean exterior) {
		this.exterior = exterior;
	}

	@Override
	public String toString() {
		return "Habitacion [idHabitacion=" + idHabitacion + ", num_habitacion=" + num_habitacion + ", metros=" + metros
				+ ", precio=" + precio + ", num_camas=" + num_camas + ", exterior=" + exterior + "]";
	}
	
	
}
