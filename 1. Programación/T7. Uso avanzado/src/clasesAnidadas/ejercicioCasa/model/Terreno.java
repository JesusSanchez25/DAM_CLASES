package clasesAnidadas.ejercicioCasa.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Terreno {

    //Crea una aplicación para poder gestionar la construcción de una casa. Para ello crea las siguientes clases:
    //
    //- Terreno, la cual constará de los siguientes atributos y métodos:
    //    - Casa
    //    - m2
    //    - orientacion: un enum que puede tener los valores de norte, sur, este y oeste
    //    - valoración: precio en el que la casa está valorada
    //    - constructores(): los que consideres necesarios
    //    - revalorizarCasa(): incrementará un 25% de su valoracion si hay una casa construida en el terreno, un 30% si además la casa es de más de 100m2 y un 50% si además tiene piscina
    //    - construirCasa(): construirá una casa en el terreno
    //    - getter y setter

    private Casa casa;
    private int m2;
    private Orientacion orientacion;
    public Terreno() {
    }



}
