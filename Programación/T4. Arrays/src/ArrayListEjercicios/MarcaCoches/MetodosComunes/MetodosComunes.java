package ArrayListEjercicios.MarcaCoches.MetodosComunes;

import java.util.ArrayList;

public class MetodosComunes {

    public static void MostrarArray (ArrayList lista){
        for (Object numereo : lista) {
            System.out.print(numereo + ", ");
        }
        System.out.println("");
    }
}
