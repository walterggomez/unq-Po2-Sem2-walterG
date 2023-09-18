package ar.edu.unq.po2.Sem2.Tp5MercadoCentralTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.Tp5MercadoCentral.Caja;
import ar.edu.unq.po2.Sem2.Tp5MercadoCentral.ProductoCooperativo;
import ar.edu.unq.po2.Sem2.Tp5MercadoCentral.ProductoTradicional;

class CajaTest {
	
	Caja cajaPrincipal;
	
	ProductoTradicional aceite;
	ProductoCooperativo yerbaAm;
	
	@BeforeEach
	void setUp() throws Exception {
		cajaPrincipal = new Caja();
		
		aceite = new  ProductoTradicional ("Aceite Natura",20,300);
		yerbaAm = new ProductoCooperativo ("Ambohe",15,250);
		
		cajaPrincipal.registrarProducto(aceite);
		cajaPrincipal.registrarProducto(yerbaAm);
	}
	@Test
	void getMontoACobrarTest() {
		assertEquals(525,cajaPrincipal.getMontoACobrar());
	}
	@Test
	void stockDeProductoTest() {
		assertEquals(19,aceite.getCantidadEnStock());
		assertEquals(14,yerbaAm.getCantidadEnStock());
	}

}
