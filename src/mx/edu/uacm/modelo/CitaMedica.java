package mx.edu.uacm.modelo;

import java.util.Date;

public class CitaMedica {
    private Date fechaCita;
    private IPaciente iPaciente;
    private Medico medico;

    public CitaMedica(Date fechaCita, IPaciente iPaciente, Medico medico) {
        this.fechaCita = fechaCita;
        this.iPaciente = iPaciente;
        this.medico = medico;
    }


}
