package mx.edu.uacm.modelo;

import java.util.Date;

public class MedicoCoordinador extends Medico{

    public MedicoCoordinador(String nombrePersona, Integer edadPersona, String generoPersona, String direcciónPersona, int telefonoPersona, String correoPersona, String nacionalidadPersona, String estadoCivil, int numeroEmpleado, Double salarioEmpleado, Date fechaContratacion) {
        super(nombrePersona, edadPersona, generoPersona, direcciónPersona, telefonoPersona, correoPersona, nacionalidadPersona, estadoCivil, numeroEmpleado, salarioEmpleado, fechaContratacion);
    }
}
