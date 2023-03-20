package mx.edu.uacm.modelo;

import java.util.Date;

public class Estudiante extends Persona{

    private String matricula;
    private String carrera;
    private Double promedio;
    private Long creditosCursados;
    private Date fechaIngreso;

    public Estudiante(String nombrePersona, Integer edadPersona, String generoPersona, String direcciónPersona, int telefonoPersona, String correoPersona, String nacionalidadPersona, String estadoCivil, String matricula, String carrera, Double promedio, Long creditosCursados, Date fechaIngreso) {
        super(nombrePersona, edadPersona, generoPersona, direcciónPersona, telefonoPersona, correoPersona, nacionalidadPersona, estadoCivil);
        this.matricula = matricula;
        this.carrera = carrera;
        this.promedio = promedio;
        this.creditosCursados = creditosCursados;
        this.fechaIngreso = fechaIngreso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public Double getPromedio() {
        return promedio;
    }

    public Long getCreditosCursados() {
        return creditosCursados;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "matricula='" + matricula + '\'' +
                ", carrera='" + carrera + '\'' +
                ", promedio=" + promedio +
                ", creditosCursados=" + creditosCursados +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }
}
