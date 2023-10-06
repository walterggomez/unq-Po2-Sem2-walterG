package ar.edu.unq.po2.Sem2.Tp5PersonaYMascotaTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import ar.edu.unq.po2.Sem2.Tp5PersonaYMascota.Mascota;
import ar.edu.unq.po2.Sem2.Tp5PersonaYMascota.Nombrable;
import ar.edu.unq.po2.Sem2.Tp5PersonaYMascota.Persona;

class NombrableTest {
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	Persona matias;
	Persona raul;
	
	Mascota lula;
	Mascota luci;
	
	List<Nombrable> miLista =  new ArrayList<Nombrable>();

	@BeforeEach
	void setUp() throws Exception {
		LocalDate nacimientoM = LocalDate.parse("09/10/1975",fmt);
		Persona matias= new Persona("Matias Perez",nacimientoM);
		
		LocalDate nacimientoR = LocalDate.parse("15/02/1980",fmt);
		Persona raul= new Persona("Raul Lopez",nacimientoR);
		
		Mascota lula= new Mascota ("Lula","Mestiza");
		Mascota luci= new Mascota ("Luci","Pitbul");
		
		miLista.add(luci);
		miLista.add(lula);
		miLista.add(raul);
		miLista.add(matias);
	}

	@Test
	void cantidadDeElementoEnLaListaTest() {
		assertEquals(4,miLista.size());
	}
	@Test
	void listadoConLosNombresEnLaLista() {
		for (Nombrable nom: miLista) {
			System.out.println(nom.getNombre());
		}
	}
}
