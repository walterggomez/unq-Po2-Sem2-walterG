package ar.edu.unq.po2.Sem2.Tp3Ej11Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.Tp3Ej11.Persona;

class PersonaTest {
	Persona pablo;
	Persona juan;
	Persona candela;
	Persona tobias;
	Persona sol;

	@BeforeEach
	void setUp() throws Exception {
		pablo    = new Persona("Pablo","Lopez", 20);
		juan     = new Persona("Juan","Medina", 35);
		candela  = new Persona("Candela","Francisco", 33);
		tobias   = new Persona("Tobias","Fuentes", 40);
	    sol      = new Persona("Soledad","Pucheta", 43);
	}

	@Test
	void getNombreTest() {
		assertEquals("Pablo",pablo.getNombre());
		assertEquals("Juan",juan.getNombre());
		assertEquals("Candela",candela.getNombre());
		assertEquals("Tobias",tobias.getNombre());
		assertEquals("Soledad",sol.getNombre());
	}
	@Test
	void getApellidoTest() {
		assertEquals("Lopez",pablo.getApellido());
		assertEquals("Medina",juan.getApellido());
		assertEquals("Francisco",candela.getApellido());
		assertEquals("Fuentes",tobias.getApellido());
		assertEquals("Pucheta",sol.getApellido());
	}
	@Test
	void getEdadTest() {
		assertEquals(20,pablo.getEdad());
		assertEquals(35,juan.getEdad());
		assertEquals(33,candela.getEdad());
		assertEquals(40,tobias.getEdad());
		assertEquals(43,sol.getEdad());
	}
}
