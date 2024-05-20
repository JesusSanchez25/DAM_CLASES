package ejercicios.ventanaFutbol.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Jugador {

    private int idEquipo;
    private String _id, name, posicion;
    private int media, precio;
    private boolean estitutlar;

    public Jugador(String _id, String name, String posicion, int media, int precio) {
        this._id = _id;
        this.name = name;
        this.posicion = posicion;
        this.media = media;
        this.precio = precio;
    }
}
