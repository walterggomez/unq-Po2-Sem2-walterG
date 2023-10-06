package ar.edu.po2.Sem2.ClaseDeStreamsTest;



//import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.ClaseDeStreams.Plato;
import ar.edu.unq.po2.Sem2.ClaseDeStreams.Restaurante;

class RestauranteTest {
	Restaurante tito;
	
	Plato milanesa;
	Plato pure;
	
	//List<Plato> platosBaratos; 

	@BeforeEach
	void setUp() throws Exception {
		tito = new Restaurante("Lo de Tito");
		milanesa = new Plato("Milanesa",80);
		pure = new Plato("Pure",50);
		
		tito.arregarPlato(milanesa);
		tito.arregarPlato(pure);
		
		
		
		//List<Plato> platosBaratos = tito.platosBaratos();
	}

	@Test
	void mostrarPlatosBaratosTest() {
		tito.imprimrPlatos(tito.platosBaratos());
		//this.tito.platosBaratos().stream().forEach(p->System.out.println(p.getNombre());
		//this.platosBaratos.stream().forEach(p->System.out.println(p.getNombre()));
		for (Plato p : tito.platosBaratos()) {
				System.out.println(p.getNombre());
		}
	}

}
