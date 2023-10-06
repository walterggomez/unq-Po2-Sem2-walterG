package ar.edu.unq.po2.Sem2.Tp5PersonaYMascota;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Nombrable{
	private String nombrePersona;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		super();
		this.nombrePersona = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombrePersona;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public int edad() {
		return this.calcularEdad();
	}

	private int calcularEdad() {
		LocalDate fechaHoy = LocalDate.now();
		Period periodo = Period.between(getFechaDeNacimiento(),fechaHoy);
		return periodo.getYears();
	}
	public boolean menorQue(Persona persona) {
		return this.getFechaDeNacimiento().isAfter(persona.getFechaDeNacimiento());
	}
	

}
