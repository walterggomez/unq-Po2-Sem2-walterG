package ar.edu.unq.po2.Sem2.Tp5MercadoCentralTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.Tp5MercadoCentral.ProductoCooperativo;
import ar.edu.unq.po2.Sem2.Tp5MercadoCentral.ProductoTradicional;

class ProductoTest {
	ProductoTradicional aceite;
	ProductoCooperativo yerbaAm;

	@BeforeEach
	void setUp() throws Exception {
		aceite = new  ProductoTradicional ("Aceite Natura",20,300);
		yerbaAm = new ProductoCooperativo ("Ambohe",15,250);
	}

	@Test
	void getNombreTest() {
		assertEquals ("Aceite Natura",aceite.getNombre());
		assertEquals ("Ambohe",yerbaAm.getNombre());
	}
	@Test
	void getCantidadEnStockTest() {
		assertEquals (20,aceite.getCantidadEnStock());
		assertEquals (15,yerbaAm.getCantidadEnStock());
	}
	@Test
	void decrementarStockTest() {
		aceite.decrementarStock();
		yerbaAm.decrementarStock();
		aceite.decrementarStock();
		
		assertEquals (18,aceite.getCantidadEnStock());
		assertEquals (14,yerbaAm.getCantidadEnStock());
	}
	@Test
	void getPrecioTest() {
		assertEquals (300,aceite.getPrecio());
		assertEquals (225,yerbaAm.getPrecio());
	}
}
