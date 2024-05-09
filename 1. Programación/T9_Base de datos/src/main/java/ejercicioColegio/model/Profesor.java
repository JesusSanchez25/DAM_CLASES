package ejercicioColegio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Profesor implements Serializable {
    private String nombre, correo, direccion;
    private int id, salario;

    public Profesor(String nombre, String correo, String direccion, int salario) {
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", id=" + id +
                ", salario=" + salario +
                '}';
    }
}
