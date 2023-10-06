package ar.edu.unq.po2.Sem2.Tp6BancoPrestamo;

public abstract  class SolicitudDeCredito {
	private Cliente cliente;
	private double montoSolicitado;
	private int plazo;
	
	public SolicitudDeCredito(Cliente cliente, double montoSolicitado, int plazo) {
		super();
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazo = plazo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public int getPlazo() {
		return plazo;
	}
	
	public double calcularCuotaMensual() {
		return this.getMontoSolicitado() / this.getPlazo();
	}
	
	
	 public abstract boolean esAceptable();

}
