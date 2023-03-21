package mx.edu.uacm.modelo;

import java.util.*;

public class CentroMedico implements Iterable<Medico>{
	private List<Expediente> expedientes;
	private List<Medico> medicos;

	private  Map<String, Medico> serviciosMedicos;

	public CentroMedico(List<Expediente> expedientes, List<Medico> medicos) {
		this.expedientes = expedientes;
		this.medicos = medicos;
		serviciosMedicos = new HashMap<String, Medico>();
	}

	public List<Expediente> getExpedientes() {

		return Collections.unmodifiableList(expedientes);

	}

	public List<Medico> getMedicos() {
		return List.copyOf(medicos);
	}

	public void agregarExpediente(Expediente expediente) {

		expedientes.add(expediente);
	}

	public void agregarMedico(Medico m){
		this.serviciosMedicos.put(m.getNombrePersona(), m);
	}

	public Map<String, Medico> getServiciosMedicos() {
		return Map.copyOf(serviciosMedicos);
	}

	public Expediente buscarExpediente(String identificador) {
		Expediente expediente=null;
		for(Expediente e: expedientes) {
			if (e.equals(identificador)) {
				expediente = e;
			}
		}
		return expediente;
	}


	@Override
	public Iterator<Medico> iterator() {
		return serviciosMedicos.values().iterator();
	}

	public Medico find(String nombreMedico){
		return serviciosMedicos.get(nombreMedico);
	}
}
