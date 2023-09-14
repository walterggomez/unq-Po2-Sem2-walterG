package ar.edu.unq.po2.Sem2.Tp2Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.Tp2.Empleado;
import ar.edu.unq.po2.Sem2.Tp2.EmpleadoPermanente;
import ar.edu.unq.po2.Sem2.Tp2.EmpleadoTemporario;
import ar.edu.unq.po2.Sem2.Tp2.Empresa;

class EmpresaTest {
	Empresa nutrisur;
	
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
		nutrisur = new Empresa("Nutrisur SRL", "30-15051628-7");
		
		rodolfo = new EmpleadoPermanente("Rodolfo Suarez", "calle 40 y 137 La Plata", false, nacimientoRodolfo, 10000, 2, 3);
		diegoCano = new EmpleadoPermanente("Diego Cano", "calle 44 y 7 La Plata", true, nacimientoDiegoCano, 25000, 0, 2);
		diegoTorres = new EmpleadoTemporario("Diego Torres", "calle 13 y 37 La Plata", false, nacimientoDiegoTorres, 15000, asignacionDiegoTorres,5);
		fabricio = new EmpleadoTemporario("Fabricio Lopez", "calle 1 y 48 La Plata", true, nacimientoFabricio, 20000, asignacionFabricio,0);
		
		nutrisur.contratarNuevoEmpleado(rodolfo);
		nutrisur.contratarNuevoEmpleado(diegoCano);
		nutrisur.contratarNuevoEmpleado(diegoTorres);
		nutrisur.contratarNuevoEmpleado(fabricio);
		
		
	}

	@Test
	public void cantidadDeEmpleadosEnLaEmpresaTest() {
		assertEquals(4,nutrisur.getTrabajadores().size());
		
	}
	@Test
	public void pagoDeSueldosTest() {
		assertEquals(54832.5,nutrisur.pagoDeSueldos());
		
	}
	@Test
	public void montoTotalDeSueldosBrutosTest() {
		assertEquals(70850,nutrisur.montoTotalDeSueldosBrutos());
		
	}
	@Test
	public void montoTotalDeRetencionesTest() {
		assertEquals(16017.5,nutrisur.montoTotalDeRetenciones());
		
	}
}
