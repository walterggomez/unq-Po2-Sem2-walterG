package ar.edu.unq.po2.Sem2.Tp4Ej3;

import java.util.List;
import java.util.ArrayList;

public class Trabajador {
	private String nombre;
	private String numeroDeLegajo;
	private List<Ingreso> ingresosPercibidosDelAnio;
	
	
			// Constructor
	
	 public Trabajador(String nombre, String numeroDeLegajo) {
		super();
		this.nombre = nombre;
		this.numeroDeLegajo = numeroDeLegajo;
		this.ingresosPercibidosDelAnio = new ArrayList<Ingreso>();
	}
	 
	 		// Getters
	public String getNombre() {
		return nombre;
	}

	public String getNumeroDeLegajo() {
		return numeroDeLegajo;
	}

	public List<Ingreso> getIngresosPercibidosDelAnio() {
		return ingresosPercibidosDelAnio;
	}
			// Protocolo
	public double getTotalPercibido() {
		 return 0;
	 }

}
