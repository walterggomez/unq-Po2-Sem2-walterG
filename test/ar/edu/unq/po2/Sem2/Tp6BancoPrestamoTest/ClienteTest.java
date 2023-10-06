package ar.edu.unq.po2.Sem2.Tp6BancoPrestamoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.Tp6BancoPrestamo.Banco;
import ar.edu.unq.po2.Sem2.Tp6BancoPrestamo.Cliente;
import ar.edu.unq.po2.Sem2.Tp6BancoPrestamo.CreditoPersonal;
import ar.edu.unq.po2.Sem2.Tp6BancoPrestamo.SueldoMensual;

class ClienteTest {
	Cliente raul;
	Banco rio;
	
	SueldoMensual sueldoEnero;
	SueldoMensual sueldoFebrero;
	
	CreditoPersonal credito60_40;
	
	

	@BeforeEach
	void setUp() throws Exception {
		rio = new Banco("Santander Rio", 5689);
		
		raul = new Cliente("Raul","Lopez","529 nro 3568 Berazategui",42,rio);
		sueldoEnero = new SueldoMensual("Enero",33640);
		sueldoFebrero = new SueldoMensual("Febrero",33640);
		
		
		
		raul.agregarSueldoMensual(sueldoEnero);
		raul.agregarSueldoMensual(sueldoFebrero);
		
		credito60_40 = new CreditoPersonal(raul,100000,12);
	}

	@Test
	void nombreTest() {
		assertEquals("Raul",raul.getNombre());
	}
	@Test
	void apellidoTest() {
		assertEquals("Lopez",raul.getApellido());
	}
	@Test
	void direccionTest() {
		assertEquals("529 nro 3568 Berazategui",raul.getDireccion());
	}
	@Test
	void edadTest() {
		assertEquals(42,raul.getEdad());
	}
	@Test
	void sueldoNetoMensual() {
		assertEquals(sueldoEnero,raul.getMisSueldosMesuales().get(0));
		assertEquals(sueldoFebrero,raul.getMisSueldosMesuales().get(1));
	}
	@Test
	void agregarSueldoMensualTest() {
		assertEquals(2,raul.getMisSueldosMesuales().size());
	}
	@Test
	void sueldoNetoAnualTest() {
		assertEquals(67280,raul.sueldoNetoAnual());
	}
	@Test
	void solicitarCreditoTest() {
		raul.solicitarCredito(credito60_40);	
	}
}
