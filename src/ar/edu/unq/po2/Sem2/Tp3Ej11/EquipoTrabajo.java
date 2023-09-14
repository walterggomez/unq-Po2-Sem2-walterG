package ar.edu.unq.po2.Sem2.Tp3Ej11;

import java.util.ArrayList;
import java.util.List;

public class EquipoTrabajo {
	private String nombreDeEquipo;
	private List <Persona> integrantes;
	
				// Constructor
	public EquipoTrabajo(String nombreDeEquipo) {
		super();
		this.nombreDeEquipo = nombreDeEquipo;
		this.integrantes = new ArrayList <Persona>();	
		
	} 
	
	 			// Getters
	public String getNombreDeEquipo() {
		return nombreDeEquipo;
	}

	public List<Persona> getIntegrantes() {
		return integrantes;
	}
	public double getCantidadDeIntegrantes() {
		return this.totalDeIntegrantes();
	}
	
	public double getSumaDeEdades() {
		return this.sumaDeEdades();
	}
				// Metodos para agregar y remover un integrantes
	public void agregarIntegrante(Persona persona) {
		this.integrantes.add(persona);
	}
	
	public void removerIntegrante(Persona persona) {
		this.integrantes.remove(persona);
	}
	
				// Metodo que retorna el promedio de edades
	public double promedioDeEdades() {
		return this.sumaDeEdades() / this.totalDeIntegrantes();
	}

				// Metodo que me calcula la suma de edades
	private double sumaDeEdades() {
		/* este metodo se puede hacer con Stream ver apartado (1)*/
		double resultadoSuma= 0;
		for (Persona integrante : integrantes) {
			resultadoSuma += integrante.getEdad();
		}
		return resultadoSuma;
	}
	
	private double totalDeIntegrantes() {
		return this.integrantes.size();
	}
	
	/* Anexo (1) */
	/*
	* return this.getIntegrantes().stream().mapToDouble(i->i.getEdad()).sum();
	*/
	
	

}
