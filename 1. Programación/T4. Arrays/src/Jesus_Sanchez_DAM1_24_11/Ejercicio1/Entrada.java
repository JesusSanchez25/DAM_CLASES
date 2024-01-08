package Jesus_Sanchez_DAM1_24_11.Ejercicio1;

import java.util.ArrayList;

public class Entrada {
    //1. (1 punto) Crea una aplicación que tenga lo siguiente:
    //a. Un ArrayList de String con las siguientes palabras:
    //Columna,Baraja,Importar,Sabio,Pantalla,Exterior,Pupila
    //b. Lista todas las palabras del ArrayList
    //c. Crea un array de 4 posiciones
    //d. Guarda en el array creado palabras aleatorias del arraylist creado en el
    //punto 1
    //e. Lista el contenido del array rellenado en el punto anterior

    public static void main(String[] args) {
        //A
        ArrayList<String> palabras= new ArrayList<>();

        palabras.add("Columna");
        palabras.add("Baraja");
        palabras.add("Importar");
        palabras.add("Sabio");
        palabras.add("Pantalla");
        palabras.add("Exterior");
        palabras.add("Pupila");

        //B
        for (int i = 0; i < palabras.size(); i++) {
            System.out.print(palabras.get(i)+", ");
        }
        System.out.println("");



        //C
        String[] palabrasRandom = new String[4];


        //D
        for (int i = 0; i < palabrasRandom.length; i++) {
            palabrasRandom[i] = palabras.get((int)(Math.random()*palabras.size()));
        }

        //E
        for (int i = 0; i < palabrasRandom.length; i++) {
            System.out.print(palabrasRandom[i]+", ");
        }
        System.out.println("");


    }



}
