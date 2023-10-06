package ar.edu.unq.po2.Sem2.ClaseDeStreams;

import java.util.List;
import java.util.ArrayList;

public class Stream {

	private List<String> lista = new ArrayList<String>();
	
	public List<String> todosConPrefijo(String prefijo){
		List<String> listaResultado = new ArrayList<String>();
		for(String elemento : this.lista) {
			if (elemento.startsWith(prefijo)) {
				listaResultado.add(elemento);				
			}
		}
		return listaResultado;
	}
	public boolean algunoCumple(String prefijo) {
		boolean encontre = false; // true
		int i = 0;
		while (!encontre && i < this.lista.size() ) { // encontre
			encontre = this.lista.get(i).startsWith(prefijo);
			i++;
		}
		return encontre;	
	}
	
}
