package ar.edu.unq.po2.Sem2.TP5MercadoCentralP2;

public class Impuesto extends Factura {
	private double tasaDelImpuesto;

	public Impuesto(String nroFactura, String periodoFacturado, Agencia organismoRecaudador, double tasaDelImpuesto) {
		super(nroFactura, periodoFacturado, organismoRecaudador);
		this.tasaDelImpuesto = tasaDelImpuesto;
	}

	@Override
	public double montoAPagar() {
		return this.tasaDelImpuesto;
	}
	

}
