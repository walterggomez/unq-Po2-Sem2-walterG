package ar.edu.unq.po2.Sem2.Tp5MercadoCentral;

public class ProductoCooperativo extends ProductoTradicional{
	
	private double descuento;

	public ProductoCooperativo(String nombre, int cantidadEnStock, double precio, double descuento) {
		super(nombre, cantidadEnStock, precio);
		this.descuento = descuento;
	}

	private double porcentajeDeDescuento() {
		return this.descuento/100;
	}

	@Override
	public double getPrecio() {
		return super.getPrecio() * ( 1 - this.porcentajeDeDescuento());
	}

}
