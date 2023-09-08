package ar.edu.unq.po2.Sem2.Tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado{
	
	private int cantidadHijos;
	private int antiguedad;
	
	
	public EmpleadoPermanente(String nombreEmpleado, String direccionEmpleado, boolean estadoCivilSoltero,
			LocalDate fechaDeNac, double sueldoBasico, int cantidadHijos, int antiguedad ) {
		super(nombreEmpleado, direccionEmpleado, estadoCivilSoltero, fechaDeNac, sueldoBasico);
		this.cantidadHijos = cantidadHijos;
		this.antiguedad = antiguedad;
	}
	//  setters lo que se puede modificar en un futuro es 
		// - cantidadHijos
		// la antiguedad cambia por metodo no por setter, se necesitaria como atributo la fecha de ingreso, pero el ejercicio
		// no lo estipula. Se deja para mas adelante
	
	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
	
	// getters
	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}
	
	// Metodos
		
	@Override
	public double sueldoBruto() {
		
		return this.getSueldoBasico() + this.salarioFamiliar();
	}

	private double salarioFamiliar() {
		
		return this.asignacionPorHijo() + this.asignacionPorConyuge() + this.asignacionPorAntiguedad();
	}

	private int asignacionPorAntiguedad() {
		
		return 50 * this.getAntiguedad();
	}

	private int asignacionPorConyuge() {
		if (!this.isEstadoCivilSoltero()) {
			return 100;
		}
		else {
			return 0; 
		}		
	}

	private int asignacionPorHijo() {
		
		return 150 * this.getCantidadHijos();
	}

	@Override
	public double retenciones() {
		
		return this.retencionObraSocial() + this.retencionPorHijo() + this.retencionAporteJubilatorio();
	}
	
	
	public double retencionAporteJubilatorio() {

		return this.sueldoBruto() * 0.15;
	}

	private double retencionPorHijo() {
	
		return 20 * this.getCantidadHijos();
	}










	

}
