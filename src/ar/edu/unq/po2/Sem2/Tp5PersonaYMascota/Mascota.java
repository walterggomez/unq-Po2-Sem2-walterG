package ar.edu.unq.po2.Sem2.Tp5PersonaYMascota;

public class Mascota implements Nombrable{
	private String nombreMascota;
	private String raza;
	
	public Mascota(String nombreMascota, String raza) {
		super();
		this.nombreMascota = nombreMascota;
		this.raza = raza;
	}

	public String getNombre() {
		return nombreMascota;
	}

	public String getRaza() {
		return raza;
	}
	

}
