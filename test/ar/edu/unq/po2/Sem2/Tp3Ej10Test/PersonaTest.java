package ar.edu.unq.po2.Sem2.Tp3Ej10Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.Tp3Ej10.Persona;

class PersonaTest {
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	Persona pablo;
	LocalDate nacimientoPablo = LocalDate.parse("09/10/1975",fmt);
	
	Persona juan;
	LocalDate nacimientoJuan = LocalDate.parse("15/03/1980",fmt);
	
	Persona candela;
	LocalDate nacimientoCandela = LocalDate.parse("10/02/2001",fmt);

	Persona tobias;
	LocalDate nacimientoTobias = LocalDate.parse("17/07/2001",fmt);
	

	@BeforeEach
	void setUp() throws Exception {
			// Instancio 4 personas 
		pablo = new Persona("Pablo",nacimientoPablo);
		juan = new Persona("Juan",nacimientoJuan);
		candela = new Persona("Candela",nacimientoCandela);
		tobias = new Persona("Tobias",nacimientoTobias);
	}
	@Test
	void nombreTest() {
		assertEquals("Pablo",pablo.getNombre());
		assertEquals("Juan",juan.getNombre());
		assertEquals("Candela",candela.getNombre());
		assertEquals("Tobias",tobias.getNombre());
	
	}
	@Test
	void fechaDeNacimientoTest() {
		assertEquals(nacimientoPablo,pablo.getFechaDeNacimiento());
		assertEquals(nacimientoJuan,juan.getFechaDeNacimiento());
		assertEquals(nacimientoCandela,candela.getFechaDeNacimiento());
		assertEquals(nacimientoTobias,tobias.getFechaDeNacimiento());
	}

	@Test
	void edadTest() {
		assertEquals(47,pablo.edad());
		assertEquals(43,juan.edad());
		assertEquals(22,candela.edad());
		assertEquals(22,tobias.edad());
	}
	@Test
	void menorQueTestTrue() {
		assertTrue(juan.menorQue(pablo));
		assertTrue(tobias.menorQue(candela));
		
	}
	@Test
	void menorQueTestFalse() {
		assertFalse(pablo.menorQue(juan));
		assertFalse(candela.menorQue(tobias));
		
	}

}
