package ar.edu.unq.po2.Sem2.Tp5MercadoCentral;

public abstract class Producto {
	
	private String nombre;
	private int cantidadEnStock;
	
	public Producto(String nombre, int cantidadEnStock) {
		super();
		this.nombre = nombre;
		this.cantidadEnStock = cantidadEnStock;
	}
	
	public abstract double getPrecio();
	
	public String getNombre() {
		return nombre;
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
