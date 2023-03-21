package mx.edu.uacm.modelo;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Medico extends Empleado{

    private Map<String, Consulta> listaConsultas;

    public Medico(String nombrePersona, Integer edadPersona, String generoPersona, String direcciónPersona, int telefonoPersona, String correoPersona, String nacionalidadPersona, String estadoCivil, int numeroEmpleado, Double salarioEmpleado, Date fechaContratacion) {
        super(nombrePersona, edadPersona, generoPersona, direcciónPersona, telefonoPersona, correoPersona, nacionalidadPersona, estadoCivil, numeroEmpleado, salarioEmpleado, fechaContratacion);
        this.listaConsultas = new HashMap<String, Consulta>();
    }

    public Map<String, Consulta> getListaConsultas() {
        return new HashMap<String, Consulta>(this.listaConsultas);
    }

    public void agregarConsulta( Consulta c){
        this.listaConsultas.put(String.valueOf(c.getFechaConsulta()), c);
    }


}
