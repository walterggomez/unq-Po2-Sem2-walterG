package ar.edu.unq.po2.Sem2.Tp2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
	private String nombreEmpleado;
	private String direccionEmpleado;
	private String estadoCivil;
	private LocalDate fechaDeNac;
	private double sueldoBasico;
	
	
	
	
	
	
	
	public LocalDate getFechaDeNac() {
		return fechaDeNac;
	}

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
	
	
	

}
