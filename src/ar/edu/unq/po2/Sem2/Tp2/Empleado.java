package ar.edu.unq.po2.Sem2.Tp2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado { 
	// como la clase es abstracta no se puede instanciar pero si se puede tipar con ella
	
	private String nombreEmpleado;
	private String direccionEmpleado;
	private boolean estadoCivilSoltero;
	private LocalDate fechaDeNac;
	private double sueldoBasico;
	
	public Empleado(String nombreEmpleado, String direccionEmpleado, boolean estadoCivilSoltero, LocalDate fechaDeNac,
			double sueldoBasico) {
		super();
		this.nombreEmpleado = nombreEmpleado;
		this.direccionEmpleado = direccionEmpleado;
		this.estadoCivilSoltero = estadoCivilSoltero;
		this.fechaDeNac = fechaDeNac;
		this.sueldoBasico = sueldoBasico;
	}
	//  setters lo que se puede modificar en un futuro es 
		// - direccionEmpleado
		// - estadoCivilSoltero
		// - sueldoBasico
	
	public void setDireccionEmpleado(String direccionEmpleado) {
		this.direccionEmpleado = direccionEmpleado;
	}
	public void setEstadoCivilSoltero(boolean estadoCivilSoltero) {
		this.estadoCivilSoltero = estadoCivilSoltero;
	}
	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	// getters 
	
	public double getSueldoBasico() {
		return sueldoBasico;
	}
	public boolean isEstadoCivilSoltero() {
		return estadoCivilSoltero;
	}
	
	public LocalDate getFechaDeNac() {
		return fechaDeNac;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public String getDireccionEmpleado() {
		return direccionEmpleado;
	}
	
	// Metodos 

	public int edad() {
		LocalDate fechaHoy = LocalDate.now();
		Period periodo = Period.between(getFechaDeNac(),fechaHoy);
		return periodo.getYears();
	}
	
	public abstract double sueldoBruto();
	
	public abstract double retenciones();
	
	public double sueldoNeto() {
		return this.sueldoBruto()-this.retenciones();
	}

	// Hago el supuesto que la obra social es la misma para todo empleado de la empresa
	public double retencionObraSocial() { 
		return this.sueldoBruto() * 0.10;
	}




























	
	
	
	

}
