package mx.edu.uacm.modelo;

public interface IPaciente {
    Expediente expediente = new Expediente ();

    public void listarCitas(CitaMedica citas);

    public int cancelarCita(int idCita);

    public void agendarCita(Persona p);

    public int actualizaPaciente(int idPaciente);

    public int buscarExpediente (Expediente expediente);



}
