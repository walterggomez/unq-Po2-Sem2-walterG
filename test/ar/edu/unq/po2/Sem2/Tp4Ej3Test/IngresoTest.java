package ar.edu.unq.po2.Sem2.Tp4Ej3Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.Tp4Ej3.Ingreso;

class IngresoTest {
	
	Ingreso enero2023;

	@BeforeEach
	void setUp() throws Exception {
		enero2023 = new Ingreso ("Enero 2023","Sueldo Mensual",25000);
	}

	@Test
	void getMesDePercepcionTest() {
		assertEquals("Enero 2023",enero2023.getMesDePercepcion());
	}
	@Test
	void getConceptoTest() {
		assertEquals("Sueldo Mensual",enero2023.getConcepto());
	}
	@Test
	void getMontoPercibidoTest() {
		assertEquals(25000,enero2023.getMontoPercibido());
	}
	@Test
	void montoImponibleAlImpuestoTest() {
		assertEquals(25000,enero2023.montoImponibleAlImpuesto());
	}


}
