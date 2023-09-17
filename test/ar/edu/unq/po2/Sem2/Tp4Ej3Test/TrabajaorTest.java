package ar.edu.unq.po2.Sem2.Tp4Ej3Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.Tp4Ej3.Ingreso;
import ar.edu.unq.po2.Sem2.Tp4Ej3.IngresoPorHorasExtras;
import ar.edu.unq.po2.Sem2.Tp4Ej3.Trabajador;

class TrabajaorTest {
	Trabajador marce;
	
	Ingreso enero2023;
	IngresoPorHorasExtras eneroEXtra;

	@BeforeEach
	void setUp() throws Exception {
		marce = new Trabajador("Marcelo",48607);
		
		enero2023 = new Ingreso ("Enero 2023","Sueldo Mensual",25000);
		eneroEXtra = new IngresoPorHorasExtras("Enero 2023","Sueldo x Hs Extras",15000,10);
		
		marce.agregarIngresos(enero2023);
		marce.agregarIngresos(eneroEXtra);
	}

	@Test
	void getTotalPercibidoTest() {
		assertEquals(40000,marce.getTotalPercibido());
	}
	
	@Test
	void getMontoImponibleTest() {
		assertEquals(25000,marce.getMontoImponible());
	}
	
	@Test
	void getImpuestoAPagarTest() {
		assertEquals(5000,marce.getImpuestoAPagar());
	}
	
}
