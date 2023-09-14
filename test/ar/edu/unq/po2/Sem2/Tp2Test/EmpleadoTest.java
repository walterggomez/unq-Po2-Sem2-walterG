package ar.edu.unq.po2.Sem2.Tp2Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.Tp2.Empleado;
import ar.edu.unq.po2.Sem2.Tp2.EmpleadoPermanente;
import ar.edu.unq.po2.Sem2.Tp2.EmpleadoTemporario;

class EmpleadoTest {
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	Empleado rodolfo;
	LocalDate nacimientoRodolfo = LocalDate.parse("09/10/1975",fmt);
	
	Empleado diegoCano;
	LocalDate nacimientoDiegoCano = LocalDate.parse("10/01/1972",fmt);

	Empleado diegoTorres;
	LocalDate nacimientoDiegoTorres = LocalDate.parse("25/05/1979",fmt);
	LocalDate asignacionDiegoTorres = LocalDate.parse("01/03/2001",fmt);
	
	Empleado fabricio;
	LocalDate nacimientoFabricio = LocalDate.parse("26/03/1980",fmt);
	LocalDate asignacionFabricio = LocalDate.parse("01/03/2009",fmt);


	
	@BeforeEach
	void setUp() throws Exception {
		// Rodolfo
		// no soltero (con conyuge) -fechaNacimiento 09-10-1975 -sueldo Basico 10.000 -hijos 2 -antiguedad 3
		rodolfo = new EmpleadoPermanente("Rodolfo Suarez", "calle 40 y 137 La Plata", false, nacimientoRodolfo, 10000, 2, 3);
		
		// Diego Cano
		// soltero -fechaNacimiento 10-01-1972 -sueldo Basico 25.000 -hijos 0 -antiguedad 2
		diegoCano = new EmpleadoPermanente("Diego Cano", "calle 44 y 7 La Plata", true, nacimientoDiegoCano, 25000, 0, 2);
		
		// Diego Torres
		// no soltero (con conyuge) -fechaNacimiento 25-05-1979 -sueldo basico 15.000 -fecha de asignacion 01-03-2001 -horas extras 5 
		diegoTorres = new EmpleadoTemporario("Diego Torres", "calle 13 y 37 La Plata", false, nacimientoDiegoTorres, 15000, asignacionDiegoTorres,5);
		// Fabricio Lopez
		// soltero - fechaNacimiento 26-03-1980 -sueldo basico 20.000 -fecha de asignacion 01-03-2009 - horas extras 0
		fabricio = new EmpleadoTemporario("Fabricio Lopez", "calle 1 y 48 La Plata", true, nacimientoFabricio, 20000, asignacionFabricio,0);
		
		
	}

	@Test
	public void edadTest() {
		assertEquals(47,rodolfo.edad());
		assertEquals(51,diegoCano.edad());
		assertEquals(44,diegoTorres.edad());
		assertEquals(43,fabricio.edad());
		
	}
	@Test
	public void sueldoBrutoTest() {
		// Empleados Permanentes
		assertEquals(10550,rodolfo.sueldoBruto());
		assertEquals(25100,diegoCano.sueldoBruto());
		// Empleados Temporarios
		assertEquals(15200,diegoTorres.sueldoBruto());
		assertEquals(20000,fabricio.sueldoBruto());
		
	}
	@Test
	public void retencionesTest() {
		// Empleados Permanentes
		assertEquals(2677.5,rodolfo.retenciones());
		assertEquals(6275,diegoCano.retenciones());
		// Empleados Temporarios
		assertEquals(3065,diegoTorres.retenciones());
		assertEquals(4000,fabricio.retenciones());
		
	}
	@Test
	public void sueldoNetoTest() {
		// Empleados Permanentes
		assertEquals(7872.5,rodolfo.sueldoNeto());
		assertEquals(18825,diegoCano.sueldoNeto());
		// Empleados Temporarios
		assertEquals(12135,diegoTorres.sueldoNeto());
		assertEquals(16000,fabricio.sueldoNeto());
		
	}
	
}
