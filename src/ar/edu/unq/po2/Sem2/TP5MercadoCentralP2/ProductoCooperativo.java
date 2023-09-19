package ar.edu.unq.po2.Sem2.TP5MercadoCentralP2;

public class ProductoCooperativo extends Producto  {
	
	private double precio;

	public ProductoCooperativo(String nombre, int cantidadEnStock, double precio) {
		super(nombre, cantidadEnStock);
		this.precio = precio;
	}

	@Override
	public double getMontoAPagar() {
		return precio*0.9;
	}


}
