package excepciones.ejercicioExcepcionMultiples.model;

import excepciones.ejercicioExcepcionMultiples.utils.EdadInvalidaException;
import excepciones.ejercicioExcepcionMultiples.utils.NombreInvalidoException;

public class Persona {

    //Clase Persona: con los siguientes atributos: nombre (String) y edad (int).
    // Implementa un constructor que permita inicializar la persona con un nombre
    // y una edad. Agrega un método llamado validarDatos que lance las excepciones
    // personalizadas EdadInvalidaException y NombreInvalidoException según los criterios
    // establecidos.

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {

        try {
            validarDatos(nombre,edad);
        } catch (Exception e){
            System.out.println("Excepcion ejecutada");
            System.out.println(e.getMessage());
            return;
        }


        this.nombre = nombre;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void validarDatos(String nombre, int edad) throws Exception{

    if (edad < 0 || edad>120){
        throw new EdadInvalidaException("");
    } else if (nombre == null){
        throw new NombreInvalidoException("");
    }




    }
}
