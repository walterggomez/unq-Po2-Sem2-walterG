package ar.edu.unq.po2.Sem2.Tp4Ej3Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.Tp4Ej3.IngresoPorHorasExtras;

class IngresoPorHorasExtrasTest {
	
	IngresoPorHorasExtras eneroEXtra;

	@BeforeEach
	void setUp() throws Exception {
		eneroEXtra = new IngresoPorHorasExtras("Enero 2023","Sueldo x Hs Extras",15000,10);
	}

	@Test
	void getMesDePercepcionTest() {
		assertEquals("Enero 2023",eneroEXtra.getMesDePercepcion());
	}
	@Test
	void getConceptoTest() {
		assertEquals("Sueldo x Hs Extras",eneroEXtra.getConcepto());
	}
	@Test
	void getMontoPercibidoTest() {
		assertEquals(15000,eneroEXtra.getMontoPercibido());
	}
	@Test
	void getCantidadDeHorasExtrasTest() {
		assertEquals(10,eneroEXtra.getCantidadDeHorasExtras());
	}
	@Test
	void montoImponibleAlImpuestoTest() {
		assertEquals(0,eneroEXtra.montoImponibleAlImpuesto());
	}
}
