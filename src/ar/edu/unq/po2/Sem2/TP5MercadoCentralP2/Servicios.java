package ar.edu.unq.po2.Sem2.TP5MercadoCentralP2;

public class Servicios {
	
	private String periodoFacturado;
	private double costoPorUnidad;
	private double unidadesConsumidas;
	
	public Servicios(String periodoFacturado, double costoPorUnidad, double unidadesConsumidas) {
		super();
		this.periodoFacturado = periodoFacturado;
		this.costoPorUnidad = costoPorUnidad;
		this.unidadesConsumidas = unidadesConsumidas;
	}

	public double getMontoAPagar() {
		return this.costoPorUnidad * this.unidadesConsumidas;
	}

	public String getPeriodoFacturado() {
		return periodoFacturado;
	}

	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public double getUnidadesConsumidas() {
		return unidadesConsumidas;
	}
	
	

}
