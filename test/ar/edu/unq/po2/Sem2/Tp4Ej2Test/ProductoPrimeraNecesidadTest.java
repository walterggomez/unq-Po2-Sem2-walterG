package ar.edu.unq.po2.Sem2.Tp4Ej2Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.Tp4Ej2.ProductoPrimeraNecesidad;


class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 11);
		arroz = new ProductoPrimeraNecesidad("Arroz", 8d, false, 8);
	}

	@Test
	public void testPorcentajeDeDescuento() {
		assertEquals(0.11, leche.getDescuento());
		assertEquals(0.08, arroz.getDescuento());
	}
	@Test
	public void testCalcularPrecioConPorcentajeVariable() {
		assertEquals(7.12, leche.getPrecio());
		assertEquals(7.36, arroz.getPrecio());
	}


}
