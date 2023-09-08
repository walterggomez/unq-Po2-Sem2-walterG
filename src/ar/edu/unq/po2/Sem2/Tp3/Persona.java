package ar.edu.unq.po2.Sem2.Tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String nombre;
	private LocalDate fechaDeNacimiento;
	


	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public int edad() {
		int edad = this.calcularEdad();		
		return edad;
	}

	private int calcularEdad() {
		LocalDate fechaHoy = LocalDate.now();
		Period periodo = Period.between(getFechaDeNacimiento(),fechaHoy);
		return periodo.getYears();
	}
	
	// 1. Si un objeto cualquiera que le pide la edad a una Persona:
	// ¿Conoce cómo ésta calcula u	obtiene tal valor? 
	//  

}
