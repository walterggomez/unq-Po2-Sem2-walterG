package ar.edu.unq.po2.Sem2.Tp5MercadoCentralP2Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.TP5MercadoCentralP2.ProductoCooperativo;
import ar.edu.unq.po2.Sem2.TP5MercadoCentralP2.ProductoTradicional;

class ProductoTest {

	ProductoTradicional aceite;
	ProductoCooperativo yerbaTresMarias;

	@BeforeEach
	void setUp() throws Exception {
		aceite = new  ProductoTradicional ("Aceite Natura",20,300);
		yerbaTresMarias = new ProductoCooperativo ("Tres Marias",15,250,10);
	}

	@Test
	void getNombreTest() {
		assertEquals ("Aceite Natura",aceite.nombre());
		assertEquals ("Tres Marias",yerbaTresMarias.nombre());
	}
	@Test
	void getCantidadEnStockTest() {
		assertEquals (20,aceite.getCantidadEnStock());
		assertEquals (15,yerbaTresMarias.getCantidadEnStock());
	}
	@Test
	void decrementarStockTest() {
		aceite.decrementarStock();
		yerbaTresMarias.decrementarStock();
		aceite.decrementarStock();
		
		assertEquals (18,aceite.getCantidadEnStock());
		assertEquals (14,yerbaTresMarias.getCantidadEnStock());
	}
	@Test
	void getPrecioTest() {
		assertEquals (300,aceite.montoAPagar());
		assertEquals (225,yerbaTresMarias.montoAPagar());
	}
}
