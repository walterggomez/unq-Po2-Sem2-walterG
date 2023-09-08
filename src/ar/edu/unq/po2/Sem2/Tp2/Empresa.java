package ar.edu.unq.po2.Sem2.Tp2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nombreEmpresa;
	private String cuitEmpresa;
	private List <Empleado> trabajadores;
	
	public Empresa(String nombreEmpresa, String cuitEmpresa) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.cuitEmpresa = cuitEmpresa;
		this.trabajadores = new ArrayList<Empleado>();
	}
	
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
	
	public void contratarNuevoEmpleado(Empleado empleado) {
		this.trabajadores.add(empleado);
		
	}
	public double pagoDeSueldos() { // total de sueldos netos de todos los empleados
		double totalAPagar = 0;
		for (Empleado empleado : trabajadores) {
			totalAPagar += empleado.sueldoNeto();
		}
		return totalAPagar;
		
	}
	public double montoTotalDeSueldosBrutos() {
		double totalSueldosBrutos = 0;
		for (Empleado empleado : trabajadores) {
			totalSueldosBrutos += empleado.sueldoBruto();
		}
		return totalSueldosBrutos;
	}
	public double montoTotalDeRetenciones() {
		double totalRetenciones = 0;
		for (Empleado empleado : trabajadores) {
			totalRetenciones +=  empleado.retenciones();
		}
		return totalRetenciones;
		}


}
