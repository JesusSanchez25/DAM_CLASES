package ArrayListEjercicios.GarajeCoches.Metodos;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Metodos {
    ArrayList<Object[]> listaCoches = new ArrayList<>();;
    ArrayList<String> martriculasUsadas = new ArrayList<>();
    Scanner scanner = new Scanner(in);



    public void mostrarCoche (Object[] coche){
        for (Object item : coche) {
            System.out.printf(item+", ");
        }
        System.out.println("");
    }

    public void añadirCoche (Object[] coche){


        if (!martriculasUsadas.contains(coche[3])){
            martriculasUsadas.add((String)coche[3]);
            System.out.println("Coche agregado al garaje");
            listaCoches.add(coche);
            martriculasUsadas.add((String)coche[3]);

        } else {
            System.out.println("Esa matrícula ya ha sido usada anteriormente");
        }
    }

    public void listarCoches (){
        for (Object[] coche : listaCoches) {
            for (Object parte : coche) {
                System.out.print(parte+", ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void buscarCoches (String matricula){
        if (martriculasUsadas.contains(matricula)){
            int posicion = martriculasUsadas.indexOf(matricula);
            mostrarCoche(listaCoches.get(posicion));
            
        }
       
    }

    public void mostrarCostes (){
        int sumaTotal = 0;
        for (Object[] coche : listaCoches) {
            sumaTotal += (int)coche[2];
        }

        System.out.println("La suma total de todos los costes es: "+sumaTotal);

    }

    public void eliminarCoche (String matricula){
        if (martriculasUsadas.contains(matricula)){
            int posicion = martriculasUsadas.indexOf(matricula);
            System.out.println("Se ha eliminado el coche ");mostrarCoche(listaCoches.get(posicion));
            listaCoches.remove(posicion);

        }


    }

    public void vaciarGaraje (){
        listaCoches.clear();



    }



}
