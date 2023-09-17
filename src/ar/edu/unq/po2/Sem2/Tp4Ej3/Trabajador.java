package ar.edu.unq.po2.Sem2.Tp4Ej3;

import java.util.List;
import java.util.ArrayList;

public class Trabajador {
	private String nombre;
	private int numeroDeLegajo;
	private List<Ingreso> ingresosDelAnio;
	
	
			// Constructor
	
	 public Trabajador(String nombre, int numeroDeLegajo) {
		super();
		this.nombre = nombre;
		this.numeroDeLegajo = numeroDeLegajo;
		this.ingresosDelAnio = new ArrayList<Ingreso>();
	}
	 
	 		// Getters
	public String getNombre() {
		return nombre;
	}

	public int getNumeroDeLegajo() {
		return numeroDeLegajo;
	}

	public List<Ingreso> getIngresosDelAnio() {
		return ingresosDelAnio;
	}
	
			// Metodo para agregar ingresos al trabajador
	public void agregarIngresos(Ingreso ingreso) {
		this.getIngresosDelAnio().add(ingreso);
		
	}
	
			// Protocolo
	public double getTotalPercibido() {
		 return this.getIngresosDelAnio().stream().mapToDouble(i->i.getMontoPercibido()).sum();
	 }
	
	public double getMontoImponible() {
		return this.getIngresosDelAnio().stream().mapToDouble(i->i.montoImponibleAlImpuesto()).sum();
	}
	public double getImpuestoAPagar() {
		return this.getMontoImponible()* 0.2;
	}

}
