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
	
			
	
	
	

}
