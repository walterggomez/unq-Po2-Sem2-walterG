package ar.edu.unq.po2.Sem2.TP5MercadoCentralP2;

public class Servicio extends Factura {

	private double costoPorUnidad;
	private double unidadesConsumidas;
	
	public Servicio(String nroFactura, String periodoFacturado, Agencia organismoRecaudador, double costoPorUnidad,
			double unidadesConsumidas) {
		super(nroFactura, periodoFacturado, organismoRecaudador);
		this.costoPorUnidad = costoPorUnidad;
		this.unidadesConsumidas = unidadesConsumidas;
	}
	
	@Override
	public double montoAPagar() {
		return this.costoPorUnidad * this.unidadesConsumidas;
	}




	

}
