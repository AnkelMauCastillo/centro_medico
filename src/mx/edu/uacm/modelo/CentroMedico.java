package mx.edu.uacm.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CentroMedico {
	List<Expediente> expedientes = new ArrayList<Expediente>();

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
