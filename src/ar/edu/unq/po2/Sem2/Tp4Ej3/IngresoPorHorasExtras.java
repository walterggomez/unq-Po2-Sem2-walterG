package ar.edu.unq.po2.Sem2.Tp4Ej3;

public class IngresoPorHorasExtras extends Ingreso {
	
	private int cantidadDeHorasExtras;
	
			// Constructor
	public IngresoPorHorasExtras(String mesDePercepcion, String concepto, double montoPercibido,int cantidadDeHorasExtras) {
		super(mesDePercepcion, concepto, montoPercibido);
		this.cantidadDeHorasExtras=cantidadDeHorasExtras;
	}

	public int getCantidadDeHorasExtras() {
		return cantidadDeHorasExtras;
	}
	
	@Override
	public double montoImponibleAlImpuesto() {
		return 0;
	}
	

	
	
	

}
