package ar.edu.unq.po2.Sem2.Tp6BancoPrestamo;

public class SueldoMensual {
	private String mes;
	private double importeNeto;

	public SueldoMensual(String mes, int importeNeto) {
		super();
		this.mes = mes;
		this.importeNeto = importeNeto;
	}

	public String getNombreMes() {
		return mes;
	}

	public double getNetoMensual() {
		return importeNeto;
	}



}
