package trabajoObjetos.model;

import java.io.Serializable;

public class Tarea implements Serializable {

    // Es un objeto que pertenece a LA CLASE (no al objeto),
    // que no se puede CAMBIAR
    // y que es privado
    private static final long serialVersionUID = 123456789L;
    private String nombre, descripcion;
    private boolean completada;

    public Tarea() {
    }

    public Tarea(String nombre, String descripcion, boolean completada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completada = completada;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", completada=" + completada +
                '}';
    }
}
