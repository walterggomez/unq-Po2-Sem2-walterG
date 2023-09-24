package ar.edu.unq.po2.Sem2.TP5MercadoCentralP2;

public abstract  class Factura implements Pagable {

	private String nroFactura;
	private String periodoFacturado;
	private Agencia agenciaRecaudadora;
	


	public Factura(String nroFactura, String periodoFacturado, Agencia organismoRecaudador) {
		super();
		this.nroFactura = nroFactura;
		this.periodoFacturado = periodoFacturado;
		this.agenciaRecaudadora = organismoRecaudador;
	}
	
	public String nroFactura() {
		return nroFactura;
	}

	public String periodoFacturado() {
		return periodoFacturado;
	}

	public Agencia agenciaRecaudadora() {
		return agenciaRecaudadora;
	}

	public abstract double montoAPagar();
	
	public void leerCodigoDeBarras(Caja caja) {
		caja.avisarALaAgenciaRecaudadora(this);
	}
	

}
