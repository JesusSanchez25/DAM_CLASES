package ejercicios.ventanaFutbol.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario {
    private int id;
    private String nombre, contrasenia, correo;


}
