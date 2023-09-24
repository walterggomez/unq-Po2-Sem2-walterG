package ar.edu.unq.po2.Sem2.Tp5MercadoCentralP2Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.TP5MercadoCentralP2.Arba;
import ar.edu.unq.po2.Sem2.TP5MercadoCentralP2.Agencia;
import ar.edu.unq.po2.Sem2.TP5MercadoCentralP2.Impuesto;
import ar.edu.unq.po2.Sem2.TP5MercadoCentralP2.Servicio;

class FacturaTest {
	
	
	Agencia arba;
	Agencia edesur;
	Agencia movistar;
	
	Impuesto inmobiliario;
	Impuesto automotor;
	
	Servicio luz;
	Servicio internet;
	

	@BeforeEach
	void setUp() throws Exception {
		arba = new Arba();
		
		inmobiliario = new Impuesto("25639","Septiembre 2023",arba,3500);
		automotor    = new Impuesto("48971","Agosto 2023",arba,11650);
		
		luz          = new Servicio ("36987","Septiembre 2023",edesur,300,25);
		internet     = new Servicio ("789654","Agosto 2023",movistar,1000,6);
	}
	
	@Test
	void nroFacturaTest() {
		assertEquals("25639",inmobiliario.nroFactura());
		assertEquals("48971",automotor.nroFactura());
		assertEquals("36987",luz.nroFactura());
		assertEquals("789654",internet.nroFactura());
	}
	@Test
	void periodoFacturadoTest() {
		assertEquals("Septiembre 2023",inmobiliario.periodoFacturado());
		assertEquals("Agosto 2023",automotor.periodoFacturado());
		assertEquals("Septiembre 2023",luz.periodoFacturado());
		assertEquals("Agosto 2023",internet.periodoFacturado());
	}
	@Test
	void montoAPagarTest() {
		assertEquals(3500,inmobiliario.montoAPagar());
		assertEquals(11650,automotor.montoAPagar());
		assertEquals(7500,luz.montoAPagar());
		assertEquals(6000,internet.montoAPagar());
	}
}



