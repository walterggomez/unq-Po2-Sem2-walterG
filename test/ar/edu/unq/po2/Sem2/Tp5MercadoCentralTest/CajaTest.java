package ar.edu.unq.po2.Sem2.Tp5MercadoCentralTest;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.Tp5MercadoCentral.Caja;
import ar.edu.unq.po2.Sem2.Tp5MercadoCentral.ProductoCooperativo;
import ar.edu.unq.po2.Sem2.Tp5MercadoCentral.ProductoTradicional;

class CajaTest {
	
	Caja cajaPrincipal;
	
	List<ProductoTradicional> compraDelHoy;
	
	ProductoTradicional aceiteNatura;
	ProductoCooperativo yerbaTresPatos;
	
	@BeforeEach
	void setUp() throws Exception {
		cajaPrincipal = new Caja();
		
		aceiteNatura = new  ProductoTradicional ("Aceite Natura",20,300);
		yerbaTresPatos = new ProductoCooperativo ("Tres Patos",15,250,10);
		
		cajaPrincipal.agregarProductoACompra(aceiteNatura);
		cajaPrincipal.agregarProductoACompra(yerbaTresPatos);
		cajaPrincipal.agregarProductoACompra(yerbaTresPatos);

		cajaPrincipal.procesarCompra();
		
	}
	@Test
	void cantidadDeProductosEnLaCompraTest() {
		assertEquals(3,cajaPrincipal.getCompra().size());
	}	
	
	@Test
	void montoACobrarTest() {
		assertEquals(750,cajaPrincipal.informarMontoACobrar());
		assertEquals(0,cajaPrincipal.getCompra().size());
		
	}
	// test para controlar el stock despues de la compra
	@Test
	void controlDeStockTest() {
		assertEquals(19,aceiteNatura.getCantidadEnStock());
		assertEquals(13,yerbaTresPatos.getCantidadEnStock());
	}

}
