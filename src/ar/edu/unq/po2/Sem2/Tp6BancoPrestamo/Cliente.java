package ar.edu.unq.po2.Sem2.Tp6BancoPrestamo;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private List<SueldoMensual> misSueldosMesuales;
	private Banco bco;
	
	public Cliente(String nombre, String apellido, String direccion, int edad,Banco bco) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.misSueldosMesuales = new ArrayList<SueldoMensual>();
		this.bco=bco;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	public List<SueldoMensual> getMisSueldosMesuales() {
		return misSueldosMesuales;
	}
	public String getDireccion() {
		return direccion;
	}
	public Banco getBco() {
		return bco;
	}
	public void agregarSueldoMensual(SueldoMensual sueldo) {
		this.misSueldosMesuales.add(sueldo);		
	}
	public double sueldoNetoAnual() {
		return misSueldosMesuales.stream().mapToDouble(s->s.getNetoMensual()).sum();
	}
	public void solicitarCredito(SolicitudDeCredito solicitud) {
		this.bco.agregarSolicitudDeCredito(solicitud);
	}
	public void mensajeDeRecepcion() {
		System.out.println("Se recibio su solicitud de Credito");
	}
	
}
