package interfacesYconstantes.practicaExamen.model;

public class Animal {

    private int edad;
    private String nombre;

    public Animal() {
    }

    public Animal(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }


    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
