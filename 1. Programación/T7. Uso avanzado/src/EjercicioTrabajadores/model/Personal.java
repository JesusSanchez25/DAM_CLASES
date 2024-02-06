package EjercicioTrabajadores.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Personal {

    private String nombre, apellido, dni;

    public Personal() {
    }

    public Personal(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void mostrarDatos(){
        System.out.println("Nombre :" + nombre);
        System.out.println("Apellido :" + nombre);
        System.out.println("DNI :" + nombre);

    }


    public Object getDni() {
        return "puta";
    }
}
