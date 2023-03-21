package mx.edu.uacm.modelo;

import java.util.Date;
import java.util.Map;

public class Medico extends Empleado{

    private Map<String, Consulta> listaConsultas;

    public Medico(String nombrePersona, Integer edadPersona, String generoPersona, String direcciónPersona, int telefonoPersona, String correoPersona, String nacionalidadPersona, String estadoCivil, int numeroEmpleado, Double salarioEmpleado, Date fechaContratacion) {
        super(nombrePersona, edadPersona, generoPersona, direcciónPersona, telefonoPersona, correoPersona, nacionalidadPersona, estadoCivil, numeroEmpleado, salarioEmpleado, fechaContratacion);
    }
}
