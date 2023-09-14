package ar.edu.unq.po2.Sem2.Tp4Ej1;

public class ProductoPrimeraNecesidad  extends Producto  {
	
	// Constructores 

	public ProductoPrimeraNecesidad(String nombreProducto, double precioProducto, boolean esPrecioCuidado) {
		super(nombreProducto, precioProducto, esPrecioCuidado);
	}

	public ProductoPrimeraNecesidad(String nombreProducto, double precioBaseDelProducto) {
		super(nombreProducto, precioBaseDelProducto);
	}

	@Override
	public double getPrecio() {
		return super.getPrecio() * 0.9;
	}





}
