package ar.edu.unq.po2.Sem2.TP5MercadoCentralP2;

public class ProductoTradicional extends Producto {
	
	private double precio;
	
	public ProductoTradicional(String nombre, int cantidadEnStock, double precio) {
		super(nombre, cantidadEnStock);
		this.precio = precio;
	}

	@Override
	public double getMontoAPagar() {
		return precio;
	}
}
