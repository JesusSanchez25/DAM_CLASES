package ejercicios.ventanaFormulario.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Usuario {
    private String nombre, apellido, correo, telefono;

    public Usuario(String correo, String telefono) {
        this.correo = correo;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return
                nombre.toUpperCase() + ":\n" +
                " -apellido: " + apellido + "\n" +
                " -correo: " + correo + "\n" +
                " -telefono: " + telefono + "\n";
    }
}
