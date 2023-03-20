package mx.edu.uacm.modelo;

public interface IPaciente {

    public void listarCitas(CitaMedica citas);

    public int cancelarCita(int idCita);

    public void agendarCita(Persona p);

    public int actualizaPaciente(int idPaciente);



}
