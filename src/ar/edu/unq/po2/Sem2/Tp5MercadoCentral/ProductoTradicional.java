package ar.edu.unq.po2.Sem2.Tp5MercadoCentral;

public class ProductoTradicional  {
	
	private String nombre;
	private int cantidadEnStock;
	private double precio;
	


	public ProductoTradicional(String nombre, int cantidadEnStock, double precio) {
		super();
		this.nombre = nombre;
		this.cantidadEnStock = cantidadEnStock;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}

	public int getCantidadEnStock() {
		return cantidadEnStock;
	}
	/* Metodo que decrementa el Stock del producto considero que hay suficiente Stock de
	   del mismo por eso lo manejo con una variable de clase*/
	public void decrementarStock() {
		cantidadEnStock -= 1;		
	}
	
}
