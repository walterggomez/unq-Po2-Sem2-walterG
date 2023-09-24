package ar.edu.unq.po2.Sem2.TP5MercadoCentralP2;

public class ProductoTradicional implements Pagable {
	
	private String nombre;
	private int cantidadEnStock;
	private double precio;
	

	public ProductoTradicional(String nombre, int cantidadEnStock, double precio) {
		super();
		this.nombre = nombre;
		this.cantidadEnStock = cantidadEnStock;
		this.precio = precio;
	}
	
	public String nombre() {
		return nombre;
	}
	public double montoAPagar() {
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
	
	public void leerCodigoDeBarras(Caja caja) {
		this.decrementarStock();
		if (this.estoyEnMinimoStock()) {
			caja.avisarQueHayStockMinimo(this);
			
		}
	}

	private boolean estoyEnMinimoStock() {
		return this.getCantidadEnStock() == 1;
	}
	
}
