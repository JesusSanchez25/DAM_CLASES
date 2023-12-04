package Estructura.modelo;

public class Persona {

    //Es la ESTRUCTURA BASE de lo que va a ser una persona
    // atributos - propiedades (suelen ser privados y se obtienen con los getter y setter)
    private String nombre, apellido, email;
    private int telefono;
    private char genero;


    // métodos - CONSTRUCTOR -> por defecto tengo el vacío (hasta que creo un Constructor)
    public Persona(String nombre, String apellido, int telefono){
        // Este constructor te pide solo 3 valores
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;

    }

    public Persona(String nombre, String apellido, int telefono, String email){
        // Este constructor te pide solo 3 valores
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;

    }

    public Persona(){

    }
    // metodos - "normales"

    public void mostrarDatos (){
        System.out.println("El nombre es: " + nombre);
        System.out.println("El apellido es: " + apellido);
        System.out.println("El email es: " + email);
        System.out.println("El teléfono es: " + telefono);

    }




    // métodos - "getter"


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public char getGenero() {
        return genero;
    }

    // métodos - "setter"

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    //Cambias lo que hace el método toString
    @Override
    public String toString(){
        return nombre;
    }
}