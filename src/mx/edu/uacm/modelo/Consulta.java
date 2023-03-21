package mx.edu.uacm.modelo;

import java.util.Date;

public class Consulta {
    private Date fechaConsulta;
    private Medico medico;
    private IPaciente iPaciente;

    public Consulta(Date fechaConsulta, Medico medico) {
        this.medico = medico;
        this.fechaConsulta = fechaConsulta;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    @Override
    public String  toString() {
        return "Consulta{" +
                "fechaConsulta=" + fechaConsulta +
                ", medico=" + medico +
                ", iPaciente=" + iPaciente +
                '}';
    }
}
