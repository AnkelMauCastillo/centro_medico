package mx.edu.uacm.modelo;

import java.util.*;

public class Expediente  implements Iterable<Consulta> {

	//private IPaciente paciente;
	private Map<String, Consulta> expedientes;


	public Expediente() {
		this.expedientes = new HashMap<String, Consulta>();
	}

	/*
	public Map<String, Consulta> getExpedientes() {
		return this.expedientes;
	}

	 */



	public void agregarConsulta(Consulta c){
		this.expedientes.put(String.valueOf(c.getFechaConsulta()), c);
	}

	@Override
	public Iterator<Consulta> iterator() {
		return expedientes.values().iterator();
	}
}
