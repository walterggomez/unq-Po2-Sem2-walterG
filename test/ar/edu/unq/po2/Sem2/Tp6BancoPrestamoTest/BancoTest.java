package ar.edu.unq.po2.Sem2.Tp6BancoPrestamoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.Tp6BancoPrestamo.Banco;
import ar.edu.unq.po2.Sem2.Tp6BancoPrestamo.Cliente;

class BancoTest {
	Banco rio;
	Cliente raul;
	

	@BeforeEach
	void setUp() throws Exception {
		rio = new Banco("Santander Rio", 5689);
		raul = new Cliente("Raul","Lopez","529 nro 3568 Berazategui",42,rio);
	}

	@Test
	void AgregarNuevosClientesTest() {
		rio.agregarNuevoCliente(raul);
		assertEquals(1,rio.getMisClientes().size());
	}

}
