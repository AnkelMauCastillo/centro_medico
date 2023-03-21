package mx.edu.uacm.modelo;

import java.util.Date;

public class Consulta {
    private Date fechaConsulta;
    //private Medico medico;
    private IPaciente iPaciente;

    public Consulta(Date fechaConsulta) {

        this.fechaConsulta = fechaConsulta;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }



    @Override
    public String  toString() {
        return "Consulta{" +
                "fechaConsulta=" + fechaConsulta +
                ", iPaciente=" + iPaciente +
                '}';
    }
}
