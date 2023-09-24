package ar.edu.unq.po2.Sem2.TP5MercadoCentralP2;

public class Arba implements Agencia{
	

	@Override
	public void registarPago(Factura factura) {
		System.out.println("Se Pago la Factura Nro " + factura.nroFactura()); 
	}

}
