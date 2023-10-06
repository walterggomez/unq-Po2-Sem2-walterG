package ar.edu.unq.po2.Sem2.ClaseDeStreams;

import java.util.List;
import java.util.ArrayList;

public class Restaurante {

	private List<Plato> misPlatos;
	private String nombre;
	
	
	public Restaurante(String nombre) {
		super();
		this.nombre = nombre;
		this.misPlatos = new ArrayList<Plato>();
	}
	public List<Plato> getMisPlatos() {
		return misPlatos;
	}
	public String getNombre() {
		return nombre;
	}
	public List<Plato> platosBaratos() {
		return this.misPlatos.stream().filter(p->p.precioConIva() < 2000).toList();		
	}
	public void arregarPlato(Plato plato) {
		this.misPlatos.add(plato);
	}
	
	public void imprimrPlatos(List<Plato> platos){
		platos.forEach(p -> System.out.println(p.getNombre()));
	}
	// ver comparable to
	
}
