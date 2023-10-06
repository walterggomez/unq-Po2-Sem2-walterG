package ar.edu.unq.po2.Sem2.Tp6BancoPrestamo;

public class CreditoPersonal extends SolicitudDeCredito{

	public CreditoPersonal(Cliente cliente, double montoSolicitado, int plazo) {
		super(cliente, montoSolicitado, plazo);
		
	}

	@Override
	public boolean esAceptable() {
		return this.ingresosAnualesPorAlMenos15000(); // && this.montoDeLaCuotaNoSupereEl70();
		
	}

//	private boolean montoDeLaCuotaNoSupereEl70() {
		
//		return this.calcularCuotaMensual() < this.getCliente();
//	}

	private boolean ingresosAnualesPorAlMenos15000() {
		return this.getCliente().sueldoNetoAnual() >= 15000;
	}
	

}
