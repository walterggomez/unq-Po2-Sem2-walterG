package ar.edu.unq.po2.Sem2.Tp3Ej11Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.Tp3Ej11.EquipoTrabajo;
import ar.edu.unq.po2.Sem2.Tp3Ej11.Persona;

class EquipoTrabajoTest {

	Persona pablo;
	Persona juan;
	Persona candela;
	Persona tobias;
	Persona sol;
	
	EquipoTrabajo unqLab;

	@BeforeEach
	void setUp() throws Exception {
		pablo    = new Persona("Pablo","Lopez", 20);
		juan     = new Persona("Juan","Medina", 35);
		candela  = new Persona("Candela","Francisco", 33);
		tobias   = new Persona("Tobias","Fuentes", 40);
	    sol      = new Persona("Soledad","Pucheta", 43);
	    
	    unqLab =new EquipoTrabajo("Laboratorio LEMCI");
	    
	    // Agergo los integrantes a la lista uso el metodo creado
	    unqLab.agregarIntegrante(pablo);
	    unqLab.agregarIntegrante(juan);
	    unqLab.agregarIntegrante(candela);
	    unqLab.agregarIntegrante(tobias);
	    unqLab.agregarIntegrante(sol);
	    
	    
	}

	@Test
	void getNombreDeEquipoTest() {
		assertEquals("Laboratorio LEMCI",unqLab.getNombreDeEquipo());
	}
	@Test
	void cantidadDeIntegrantesTest() {
		assertEquals(5,unqLab.getCantidadDeIntegrantes());
	}
		// Verifico si la ubicacion de los integrantes es la correcta
	@Test
	void ubicacionEnLaListaTest() {
		assertEquals(pablo,unqLab.getIntegrantes().get(0));  // verifica si la referencia es la heap es la misma
		assertEquals(candela,unqLab.getIntegrantes().get(2));
		assertEquals(sol,unqLab.getIntegrantes().get(4));   // el index en las listas comienza con el cero 
	}
	@Test
	void sumaDeEdadesTest() {
		assertEquals(171,unqLab.getSumaDeEdades());
	}
		// Verifico promedio de edades y lo muestro por consola
	@Test
	void promedioDeEdadesTest() {
		assertEquals(34.2,unqLab.promedioDeEdades());
		System.out.println("El promedio de las edades del grupo es: " + unqLab.promedioDeEdades());
	}
	


}
