package mx.edu.uacm.modelo;

import java.util.Date;

public class Profesor extends Empleado{


    public Profesor(String nombrePersona, Integer edadPersona, String generoPersona, String direcciónPersona, int telefonoPersona, String correoPersona, String nacionalidadPersona, String estadoCivil, int numeroEmpleado, Double salarioEmpleado, Date fechaContratacion) {
        super(nombrePersona, edadPersona, generoPersona, direcciónPersona, telefonoPersona, correoPersona, nacionalidadPersona, estadoCivil, numeroEmpleado, salarioEmpleado, fechaContratacion);
    }
}
