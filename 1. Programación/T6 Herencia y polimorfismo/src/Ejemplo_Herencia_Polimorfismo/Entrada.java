package Ejemplo_Herencia_Polimorfismo;

import Ejemplo_Herencia_Polimorfismo.model.Coche;
import Ejemplo_Herencia_Polimorfismo.model.Deportivo;
import Ejemplo_Herencia_Polimorfismo.model.Suv;
import Ejemplo_Herencia_Polimorfismo.model.Utilitario;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {


        Deportivo deportivo = new Deportivo("a","a",123,123,40, 200);

        //Otra forma de instanciar un objeto:
        Coche deportivo1 = new Deportivo("a","a",123,123,40, 200);


        Suv suv = new Suv("a","a",123,123,40, 2);
        Utilitario utilitario = new Utilitario("a","a",123,123,40, 200);
        deportivo.mostrarDatos();

        ArrayList<Coche> coches = new ArrayList<>();
        coches.add(deportivo);
        coches.add(suv);
        coches.add(utilitario);

        for (Coche item : coches) {
            item.decelerar(40);
        }

        for (Coche item : coches) {
            if (item instanceof Deportivo){
                System.out.println(((Deportivo)item).getPar());
            }
        }



    }
}
