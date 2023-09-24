package ar.edu.unq.po2.Sem2.Tp5MercadoCentral;

import java.util.List;
import java.util.ArrayList;

public class Caja {
	
	private double montoACobrar = 0 ;
	private List<ProductoTradicional> compra = new ArrayList<ProductoTradicional>();
		
	// Constructor de Caja
	public Caja() {
		super();
	}
	
	
	// Metodo para agrgar productos a la compra del cliente
	public void agregarProductoACompra(ProductoTradicional producto) {
		this.compra.add(producto);
		
	}
	
	public double informarMontoACobrar() {
		this.compra.clear();
		return montoACobrar;
	}

	// Metodo que procesa la compra
	public void procesarCompra() {
		for (ProductoTradicional producto : compra) {
			this.registrarProducto(producto);
		}
	}
	
	private void registrarProducto(ProductoTradicional producto) {
		montoACobrar += producto.getPrecio();
		producto.decrementarStock();
	}


	public List<ProductoTradicional> getCompra() {
		return compra;
	}

	


}

