package ar.edu.unq.po2.Sem2.Tp5MercadoCentral;

public class ProductoCooperativo extends Producto{
	
	private double precio;

	public ProductoCooperativo(String nombre, int cantidadEnStock, double precio) {
		super(nombre, cantidadEnStock);
		this.precio = precio;
	}

	@Override
	public double getPrecio() {
		return precio*0.9;
	}

}
