package interfacesYconstantes.ejercicioPractica;

import interfacesYconstantes.ejercicioPractica.model.Estaciones_ENUM;
import interfacesYconstantes.ejercicioPractica.model.Registro;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        ArrayList<Registro> listaRegistro = new ArrayList<>();
        listaRegistro.add(new Registro(10,1,6,4,5,2023, Estaciones_ENUM.otonio));

        //cuando un registro se produce, salte un mensaje si:
          // la temperatura es más alta que la temperatura media de la estación en la que se produce.




    }

}
