package ar.edu.unq.po2.Sem2.Tp2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nombreEmpresa;
	private String cuitEmpresa;
	private List <Empleado> trabajadores = new ArrayList<Empleado>();
	
	
	
	// getters
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public List<Empleado> getTrabajadores() {
		return trabajadores;
	}
	public String getCuitEmpresa() {
		return cuitEmpresa;
	}
	
	
	
	
	// Metodos
	public double pagoDeSueldos() { // total de sueldos netos de todos los empleados
		double totalAPagar = 0;
		for (Empleado empleado : trabajadores) {
			totalAPagar = + empleado.sueldoNeto();
		}
		return totalAPagar;
		
	}
	public double montoTotalDeSueldosBrutos() {
		return 0;
	}
	public double montoTotalDeRetenciones() {
		return 0;
	}

















}
