package ar.edu.unq.po2.Sem2.Tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	Empleado rodolfo;
	LocalDate fechaNacimientoRodolfo = LocalDate.parse("09/10/1975",fmt);
	
	Empleado diegoCano;
	LocalDate fechaNacimientoDiegoCano = LocalDate.parse("10/01/1972",fmt);

	@BeforeEach
	void setUp() throws Exception {
		rodolfo = new EmpleadoPermanente("Rodolfo", "Los Hornos La Plata", false, fechaNacimientoRodolfo, 10000, 2, 3);
		// Rodolfo
			// no soltero -- fechaNacimiento 09-10-1975 -- sueldo Basico 10.000 -- hijos 2 -- antiguedad 3
		diegoCano = new EmpleadoPermanente("Rodolfo", "Los Hornos La Plata", true, fechaNacimientoDiegoCano, 25000, 0, 2);
		// Diego Cano
			// soltero -- fechaNacimiento 10-01-1972 -- sueldo Basico 25.000 -- hijos 0 -- antiguedad 2

	}

	@Test
	public void edadTest() {
		assertEquals(47,rodolfo.edad());
		assertEquals(51,diegoCano.edad());
		
	}
	@Test
	public void sueldoBrutoTest() {
		
		assertEquals(10550,rodolfo.sueldoBruto());
		assertEquals(25100,diegoCano.sueldoBruto());
		
	}
	@Test
	public void retencionesTest() {
		
		assertEquals(2677.5,rodolfo.retenciones());
		assertEquals(6275,diegoCano.retenciones());
		
	}
	@Test
	public void sueldoNetoTest() {
		
		assertEquals(7872.5,rodolfo.sueldoNeto());
		assertEquals(18825,diegoCano.sueldoNeto());
		
	}
	
}
