package ar.edu.unq.po2.Sem2.ClaseDeStreams;

public class Plato {
	private String nombre;
	private double precio;
	
	public Plato(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
	
	public double precioConIva() {
		return this.getPrecio()*1.21;
	}

}
