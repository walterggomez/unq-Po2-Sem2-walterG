package ar.edu.unq.po2.Sem2.Tp3Ej10;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	


	private String nombre;
	private LocalDate fechaDeNacimiento;
	
					// Constructor
	public Persona (String nombre, LocalDate fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
					// Método para obtener el nombre
	public String getNombre() {
		return nombre;
	}
	
					// Método para obtener la fecha de nacimiento
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
					// Método para calcular la edad
	public int edad() {
		return this.calcularEdad();
	}

	private int calcularEdad() {
		LocalDate fechaHoy = LocalDate.now();
		Period periodo = Period.between(getFechaDeNacimiento(),fechaHoy);
		return periodo.getYears();
	}
	
	// 1. Si un objeto cualquiera que le pide la edad a una Persona:
	// ¿Conoce cómo ésta calcula u	obtiene tal valor? 
	// que el metodo sea public no quiere decir que desde afuera pueda acceder a su codificacion interna
	// ¿Cómo se llama el mecanismo de abstracción que permite esto?
	// el mecanismo es el encapsulamiento
	
					// Método para comparar edades
	/*
	 * esta solucion solo sirve para personas que nacieron en años distintos
	 * */
	//		public boolean menorQue(Persona persona) {
	//			return this.edad() < persona.edad();
	//		}
	/*
	 * la siguiente solucion sirve para todos los casos
	 * */
	public boolean menorQue(Persona persona) {
		return this.getFechaDeNacimiento().isAfter(persona.getFechaDeNacimiento());
	}

					// Método estático de creación de Persona
	public static Persona crearPersona(String nombre,LocalDate fechaDeNacimiento) {
		return new Persona(nombre,fechaDeNacimiento);
	}
}
