package ejerciciosClase.ejercicioClase3_Agenda.controler;

public class Persona {
    private String nobre,dni;
    private int telefono;

    public Persona(){}
    public Persona(String nobre, String dni, int telefono) {
        this.nobre = nobre;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getNobre() {
        return nobre;
    }

    public void setNobre(String nobre) {
        this.nobre = nobre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
