package mx.edu.uacm.modelo;

import java.time.LocalDate;
import java.util.Date;

public class Empleado extends Persona{

    private int numeroEmpleado;
    private Double salarioEmpleado;
    private Date fechaContratacion;

    public Empleado(String nombrePersona, Integer edadPersona, String generoPersona, String direcciónPersona, int telefonoPersona, String correoPersona, String nacionalidadPersona, String estadoCivil, int numeroEmpleado, Double salarioEmpleado, Date fechaContratacion) {
        super(nombrePersona, edadPersona, generoPersona, direcciónPersona, telefonoPersona, correoPersona, nacionalidadPersona, estadoCivil);
        this.numeroEmpleado = numeroEmpleado;
        this.salarioEmpleado = salarioEmpleado;
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numeroEmpleado=" + numeroEmpleado +
                ", salarioEmpleado=" + salarioEmpleado +
                ", fechaContratacion=" + fechaContratacion +
                '}';
    }
}
