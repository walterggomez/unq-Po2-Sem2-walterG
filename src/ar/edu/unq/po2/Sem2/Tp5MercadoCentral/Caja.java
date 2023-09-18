package ar.edu.unq.po2.Sem2.Tp5MercadoCentral;


public class Caja {
	
	private double montoACobrar = 0 ;
		
	public Caja() {
		super();
	}
	
	public double getMontoACobrar() {
		return montoACobrar;
	}
	
		// Metodo para registrar un producto que se compra
	public void registrarProducto(Producto producto) {
		this.actualizarMontoACobrar(producto);
		producto.decrementarStock();
		
	}
	
	private void actualizarMontoACobrar(Producto producto) {
		montoACobrar += producto.getPrecio();
	}
	
	public double informarMontoAlCliente() {
		return this.getMontoACobrar();	
	}
	

}

