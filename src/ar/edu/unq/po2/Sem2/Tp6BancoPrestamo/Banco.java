package ar.edu.unq.po2.Sem2.Tp6BancoPrestamo;

import java.util.List;
import java.util.ArrayList;

public class Banco {
	private String nombre;
	private int numeroSucursal;
	private List<Cliente> misClientes;
	private List<SolicitudDeCredito> misSolicitudes;

	public Banco(String nombre, int numeroSucursal) {
		super();
		this.nombre = nombre;
		this.numeroSucursal = numeroSucursal;
		this.misClientes = new ArrayList<Cliente>();
		this.misSolicitudes = new ArrayList<SolicitudDeCredito>(); 
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumeroSucursal() {
		return numeroSucursal;
	}
	
	public List<Cliente> getMisClientes() {
		return misClientes;
	}
	public List<SolicitudDeCredito> getMisSolicitudes() {
		return misSolicitudes;
	}

	public void agregarNuevoCliente(Cliente cliente) {
		this.misClientes.add(cliente);
	}

	public void agregarSolicitudDeCredito(SolicitudDeCredito solicitud) {
		this.misSolicitudes.add(solicitud);
		solicitud.getCliente().mensajeDeRecepcion();
	}

}
