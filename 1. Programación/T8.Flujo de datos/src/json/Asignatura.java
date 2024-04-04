package json;

import java.util.Arrays;

public class Asignatura {


    private String nombre, profesor;
    private int horas;
    private String[] conocimientos;

    public Asignatura() {
    }

    public Asignatura(String nombre,  int horas, String profesor, String[] conocimientos) {
        this.nombre = nombre;
        this.horas = horas;
        this.profesor = profesor;
        this.conocimientos = conocimientos;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", horas='" + horas + '\'' +
                ", profesor='" + profesor + '\'' +
                ", conocimientos=" + Arrays.toString(conocimientos) +
                '}';
    }
}
