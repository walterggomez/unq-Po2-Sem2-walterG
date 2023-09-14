package ar.edu.unq.po2.Sem2.Tp3Ej11;

public class Persona {
	private String nombrePersona;
	private String apellido;
	private int edad;
	
	public Persona(String nombrePersona, String apellido, int edad) {
		super();
		this.nombrePersona = nombrePersona;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombrePersona;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	
	
	
	

}
