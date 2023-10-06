package ar.edu.unq.po2.Sem2.Tp6BancoPrestamoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.Tp6BancoPrestamo.SueldoMensual;

class SueldoMensualTest {
	
	SueldoMensual enero;

	@BeforeEach
	void setUp() throws Exception {
		enero = new SueldoMensual("Enero",33450);
	}

	@Test
	void nombreMesTest() {
		assertEquals("Enero",enero.getNombreMes());
	}
	@Test
	void netoMensualTest() {
		assertEquals(33450,enero.getNetoMensual());
	}

}
