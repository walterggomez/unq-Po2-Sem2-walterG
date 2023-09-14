package ar.edu.unq.po2.Sem2.Tp4Ej1;

import java.util.List;
import java.util.ArrayList;

public class Supermercado {
	private String nombreSupermercado;
	private String direccion;
	private List<Producto> misProductos;
	
			// Constructor
	public Supermercado(String nombreSupermercado, String direccion) {
		super();
		this.nombreSupermercado = nombreSupermercado;
		this.direccion = direccion;
		this.misProductos = new ArrayList<Producto>();
	}
	
		//	Getters
	public String getNombreSupermercado() {
		return nombreSupermercado;
	}
	public String getDireccion() {
		return direccion;
	}
	public List<Producto> getMisProductos() {
		return misProductos;
	}

		// Metodo para agregar productos al stock del supermercado
	public void agregarProducto(Producto producto) {
		this.misProductos.add(producto);
	}

		// Metodo para calcular la cantidad de Productos
	public Integer getCantidadDeProductos() {
		
		return this.getMisProductos().size();
	}

		// Metodo para calcular el total de precios
	public Double getPrecioTotal() {
		return this.getMisProductos().stream().mapToDouble(p-> p.getPrecio()).sum();
	}
	
			
	
	
	

}
