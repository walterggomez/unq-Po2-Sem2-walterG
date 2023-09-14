package ar.edu.unq.po2.Sem2.Tp4Ej2;



public class ProductoPrimeraNecesidad extends Producto  {
	
	private double descuento;

	// Constructores 
	public ProductoPrimeraNecesidad(String nombreProducto, double precioBaseDelProducto, boolean esPrecioCuidado, int descuento) {
		super(nombreProducto, precioBaseDelProducto, esPrecioCuidado);
		this.descuento = descuento;
	}
	public ProductoPrimeraNecesidad(String nombreProducto, double precioBaseDelProducto,int descuento) {
		super(nombreProducto, precioBaseDelProducto);
		this.descuento = descuento;
	}


	// Getters
	public double getDescuento() {
		return (this.descuento / 100);
	}


	@Override
	public double getPrecio() {
		return super.getPrecio() * (1 - this.getDescuento());
	}





}
