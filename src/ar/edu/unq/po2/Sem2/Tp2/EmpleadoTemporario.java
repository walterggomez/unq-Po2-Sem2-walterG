package ar.edu.unq.po2.Sem2.Tp2;

import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {
	
	private LocalDate fechaFinDesignacion;
	private int cantidadHorasExtras;	
	
	public EmpleadoTemporario(String nombreEmpleado, String direccionEmpleado, boolean estadoCivilSoltero,
			LocalDate fechaDeNac, double sueldoBasico,LocalDate fechaFinDesignacion,int cantidadHorasExtras) {
		super(nombreEmpleado, direccionEmpleado, estadoCivilSoltero, fechaDeNac, sueldoBasico);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.cantidadHorasExtras = cantidadHorasExtras;		
		
	}
	//  setters lo que se puede modificar en un futuro es 
		// - cantidadHorasExtras
	public void setCantidadHorasExtras(int cantidadHorasExtras) {
		this.cantidadHorasExtras = cantidadHorasExtras;
	}
	
	// getters	
	public int getCantidadHorasExtras() {
		return cantidadHorasExtras;
	}
	public LocalDate getFechaFinDesignacion() {
		return fechaFinDesignacion;
	}


	// Metodos

	@Override
	public double sueldoBruto() {
		
		return this.getSueldoBasico() + this.sueldoPorHorasExtras();
	}

	private double sueldoPorHorasExtras() {
		
		return 40 * this.getCantidadHorasExtras();
	}

	@Override
	public double retenciones() {
		
		return this.retencionObraSocial() + this.retencionPorMayorDe50Anios() +
			   this.retencionAporteJubilatorio() + this.retencionPorHorasExtras();
	}

	private double retencionPorHorasExtras() {
		
		return 5 * this.getCantidadHorasExtras();
	}

	private double retencionAporteJubilatorio() {
		
		return this.sueldoBruto() * 0.10;
	}

	private double retencionPorMayorDe50Anios() {
		if (this.isMayorDe50Anios()) {
			return 25;
		}
		else {
			return 0;
		}		
	}

	private boolean isMayorDe50Anios() {
		
		return this.edad() > 50;
	}





}
