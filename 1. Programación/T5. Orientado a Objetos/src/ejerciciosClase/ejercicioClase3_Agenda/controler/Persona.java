package ejerciciosClase.ejercicioClase3_Agenda.controler;

public class Persona {
    private String nombre,dni;
    private int telefono;

    public Persona(){}
    public Persona(String nombre, String dni, int telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    public void mostrarDatos(){
        System.out.printf("Nombre: %s\n", nombre);
        System.out.printf("Telefono: %s\n", telefono);


    }

    public String getNobre() {
        return nombre;
    }

    public void setNobre(String nobre) {
        this.nombre = nobre;
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
