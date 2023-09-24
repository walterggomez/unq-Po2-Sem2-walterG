package ar.edu.unq.po2.Sem2.TP5MercadoCentralP2;

import java.util.ArrayList;
import java.util.List;


public class Caja  {
	
	private double montoACobrar = 0 ;
	private List<Pagable> listItem = new ArrayList<Pagable>();
	
	public Caja() {
		super();
	}
	
	public double montoACobrar() {
		return montoACobrar;
	}
	
	public void agregarItem(Pagable pagable) {
		this.listItem.add(pagable);
		
	}
	public void procesarItem() {
		for (Pagable pagable: listItem) {
			this.registrarItem(pagable);
		}
	}
	public void registrarItem(Pagable pagable) {
		montoACobrar += pagable.montoAPagar();
		pagable.leerCodigoDeBarras(this);		
		
	}
	public void avisarQueHayStockMinimo(ProductoTradicional producto) {
		System.out.println("Hay poco Stock del producto " + producto.nombre()); 
	}
	public void avisarALaAgenciaRecaudadora(Factura factura) {
		factura.agenciaRecaudadora().registarPago(factura);
		
	}
}
