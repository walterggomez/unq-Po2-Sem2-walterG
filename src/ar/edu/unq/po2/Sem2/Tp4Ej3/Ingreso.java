package ar.edu.unq.po2.Sem2.Tp4Ej3;

public class Ingreso {
	private String mesDePercepcion;
	private String concepto;
	private double montoPercibido;
	
			// Constructor
	public Ingreso(String mesDePercepcion, String concepto, double montoPercibido) {
		super();
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
			// Getters
	public String getMesDePercepcion() {
		return mesDePercepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	public double getMontoPercibido() {
		return montoPercibido;
	}
	
	public double montoImponibleAlImpuesto() {
		return this.getMontoPercibido();
	}	
	
	
	
	

}
