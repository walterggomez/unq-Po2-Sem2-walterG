package ar.edu.unq.po2.Sem2.Tp4Ej1;

public class Producto {
	private String nombreProducto;
	private double precioBaseDelProducto;
	private boolean esPrecioCuidado;
	
		// Constructor
	
	public Producto(String nombreProducto, double precioBaseDelProducto) {
		super();
		this.nombreProducto = nombreProducto;
		this.precioBaseDelProducto = precioBaseDelProducto;
		this.esPrecioCuidado = false;
	}
	
	public Producto(String nombreProducto, double precioProducto, boolean esPrecioCuidado) {
		super();
		this.nombreProducto = nombreProducto;
		this.precioBaseDelProducto = precioProducto;
		this.esPrecioCuidado = esPrecioCuidado;
	}

		// Getters

	public String getNombre() {
		return nombreProducto;
	}

	public double getPrecio() {
		return precioBaseDelProducto;
	}

	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
		// Setters

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public void setPrecioProducto(double precioBaseDelProducto) {
		this.precioBaseDelProducto = precioBaseDelProducto;
	}

	public void setPertenecaAPreciosCuidados(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
			// Metodo para aumentar el precio de un producto
	public void aumentarPrecio(double d) {
		double nuevoPrecio = this.getPrecio() + d;
		this.setPrecioProducto(nuevoPrecio);		
		
	}
	
	
	
	
	
}
