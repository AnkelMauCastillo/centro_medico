package mx.edu.uacm.modelo;

public class Persona implements IPaciente{
    private String nombrePersona;
    private Integer edadPersona;
    private String generoPersona;
    private String direcciónPersona;
    private int telefonoPersona;
    private String correoPersona;
    private String nacionalidadPersona;
    private String estadoCivil;

    public Persona(String nombrePersona, Integer edadPersona, String generoPersona, String direcciónPersona, int telefonoPersona, String correoPersona, String nacionalidadPersona, String estadoCivil) {
        this.nombrePersona = nombrePersona;
        this.edadPersona = edadPersona;
        this.generoPersona = generoPersona;
        this.direcciónPersona = direcciónPersona;
        this.telefonoPersona = telefonoPersona;
        this.correoPersona = correoPersona;
        this.nacionalidadPersona = nacionalidadPersona;
        this.estadoCivil = estadoCivil;
    }


    public String getNombrePersona() {
        return nombrePersona;
    }

    public Integer getEdadPersona() {
        return edadPersona;
    }

    public String getGeneroPersona() {
        return generoPersona;
    }

    public String getDirecciónPersona() {
        return direcciónPersona;
    }

    public int getTelefonoPersona() {
        return telefonoPersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public String getNacionalidadPersona() {
        return nacionalidadPersona;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombrePersona='" + nombrePersona + '\'' +
                ", edadPersona=" + edadPersona +
                ", generoPersona='" + generoPersona + '\'' +
                ", direcciónPersona='" + direcciónPersona + '\'' +
                ", telefonoPersona=" + telefonoPersona +
                ", correoPersona='" + correoPersona + '\'' +
                ", nacionalidadPersona='" + nacionalidadPersona + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }

    @Override
    public void listarCitas(CitaMedica citas) {

    }

    @Override
    public int cancelarCita(int idCita) {
        return 0;
    }

    @Override
    public void agendarCita(Persona p) {

    }

    @Override
    public int actualizaPaciente(int idPaciente) {
        return 0;
    }
}
