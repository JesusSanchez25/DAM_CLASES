package clasesAnidadas.ejercicioCasa;

import clasesAnidadas.ejercicioCasa.model.Terreno;
import clasesAnidadas.ejercicioCasa.utils.Orientacion;
import clasesAnidadas.ejercicioCasa.utils.TerrenoException;

public class Entrada {

    public static void main(String[] args) {
        Terreno terreno = new Terreno(500, 20000, Orientacion.norte);

        try {
            terreno.construirCasa(300);
        } catch (TerrenoException e){
            System.out.println(e.getMessage());
        }

        terreno.getCasa().construirAnexo(23);



    }



}
