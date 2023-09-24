package ar.edu.unq.po2.Sem2.Tp5MercadoCentralP2Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.TP5MercadoCentralP2.Arba;
import ar.edu.unq.po2.Sem2.TP5MercadoCentralP2.Caja;
import ar.edu.unq.po2.Sem2.TP5MercadoCentralP2.Edesur;
import ar.edu.unq.po2.Sem2.TP5MercadoCentralP2.Impuesto;
import ar.edu.unq.po2.Sem2.TP5MercadoCentralP2.Movistar;
import ar.edu.unq.po2.Sem2.TP5MercadoCentralP2.ProductoCooperativo;
import ar.edu.unq.po2.Sem2.TP5MercadoCentralP2.ProductoTradicional;
import ar.edu.unq.po2.Sem2.TP5MercadoCentralP2.Servicio;

class CajaTest {
	Caja cajaNro10;
	
	Arba arba;
	Edesur edesur;
	Movistar movistar;
	
	ProductoTradicional aceite;
	ProductoCooperativo yerbaTresMarias;
	ProductoTradicional azucar;
	
	Impuesto automotor;
	
	Servicio luz;
	Servicio internet;

	@BeforeEach
	void setUp() throws Exception {
		
		cajaNro10 = new Caja();
		arba      = new Arba();
		edesur    = new Edesur();
		movistar  = new Movistar();
	}
	@Test
	void montoACobrarPorCompraDeProductosTest() {
		aceite = new  ProductoTradicional ("Aceite Natura",20,300);
		yerbaTresMarias = new ProductoCooperativo ("Tres Marias",15,250,10);
	
		cajaNro10.agregarItem(yerbaTresMarias);
		cajaNro10.agregarItem(aceite);
		
		cajaNro10.procesarItem();
		assertEquals(525,cajaNro10.montoACobrar());
	}
	
	@Test
	void montoACobrarPorPagoDeImpuestosTest() {
		automotor    = new Impuesto("48971","Agosto 2023",arba,11650);
		
		cajaNro10.agregarItem(automotor);
		cajaNro10.procesarItem();
		
		assertEquals(11650,cajaNro10.montoACobrar());
	}
	@Test
	void montoACobrarPorPagoDeServiciosTest() {
		luz          = new Servicio ("36987","Septiembre 2023",edesur,300,25);
		internet     = new Servicio ("789654","Agosto 2023",movistar,1000,6);
		
		cajaNro10.agregarItem(luz);
		cajaNro10.agregarItem(internet);
		
		cajaNro10.procesarItem();
		
		assertEquals(13500,cajaNro10.montoACobrar());
	}
	@Test
	void montoACobrarPorPagoDeProductoConPocoStock() {
		azucar = new  ProductoTradicional ("Azucar Fugaz",2,750);
		
		cajaNro10.agregarItem(azucar);
		
		cajaNro10.procesarItem();
		
		assertEquals(750,cajaNro10.montoACobrar());
	}
}
