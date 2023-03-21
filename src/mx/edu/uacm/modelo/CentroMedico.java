package mx.edu.uacm.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CentroMedico {
	private List<Expediente> expedientes;
	private List<Medico> medicos;

	public CentroMedico(List<Expediente> expedientes, List<Medico> medicos) {
		this.expedientes = expedientes;
		this.medicos = medicos;
	}

	public List<Expediente> getExpedientes() {
		return Collections.unmodifiableList(expedientes);
	}
	
	public void agregarExpediente(Expediente expediente) {
		expedientes.add(expediente);
	}
	
	public Expediente buscarExpediente(String identificador) {
		Expediente expediente=null;
		for(Expediente e: expedientes) {
			
		}
		return expediente;
	}
}
