package ArrayListEjercicios.MarcaCoches.Ejercicios;

import ArrayListEjercicios.MarcaCoches.MetodosComunes.MetodosComunes;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Ejercicio1 {




    public static void GenerarArray (){
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(in);
        for (int i = 0; i < 10; i++) {
            System.out.printf("Inserte la %dº palabra\n", i+1);
            String palabra = scanner.next();
            lista.add(palabra);
        }
        MetodosComunes.MostrarArray(lista);
    }





}
