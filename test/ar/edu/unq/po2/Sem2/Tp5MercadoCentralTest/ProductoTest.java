package ar.edu.unq.po2.Sem2.Tp5MercadoCentralTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.Tp5MercadoCentral.ProductoCooperativo;
import ar.edu.unq.po2.Sem2.Tp5MercadoCentral.ProductoTradicional;

class ProductoTest {
	ProductoTradicional aceiteNatura;
	ProductoCooperativo yerbaTresPatos;

	@BeforeEach
	void setUp() throws Exception {
		aceiteNatura = new  ProductoTradicional ("Aceite Natura",20,300);
		yerbaTresPatos = new ProductoCooperativo ("Tres Patos",15,250,10);
	}

	@Test
	void getNombreTest() {
		assertEquals ("Aceite Natura",aceiteNatura.getNombre());
		assertEquals ("Tres Patos",yerbaTresPatos.getNombre());
	}
	@Test
	void getCantidadEnStockTest() {
		assertEquals (20,aceiteNatura.getCantidadEnStock());
		assertEquals (15,yerbaTresPatos.getCantidadEnStock());
	}
	@Test
	void decrementarStockTest() {
		aceiteNatura.decrementarStock();
		yerbaTresPatos.decrementarStock();
		aceiteNatura.decrementarStock();
		
		assertEquals (18,aceiteNatura.getCantidadEnStock());
		assertEquals (14,yerbaTresPatos.getCantidadEnStock());
	}
	@Test
	void getPrecioTest() {
		assertEquals (300,aceiteNatura.getPrecio());
		assertEquals (225,yerbaTresPatos.getPrecio());
	}
}
