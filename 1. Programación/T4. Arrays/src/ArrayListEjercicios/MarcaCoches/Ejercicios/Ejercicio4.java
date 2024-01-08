package ArrayListEjercicios.MarcaCoches.Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class Ejercicio4 {
    public static void GenerarArray (){
        ArrayList<String> lista = new ArrayList<String>();
        Scanner scanner = new Scanner(in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Inserte la %d palabra\n", i+1);
            lista.add(scanner.next());
        }


        int letrasTotales = 0;
        String palabraLarga = lista.get(0);
        String palabraCorta = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            letrasTotales += (lista.get(i)).length();


        }
        Collections.sort(lista);

        System.out.printf("\nLa cantidad de letras totales es: "+letrasTotales);
        System.out.printf("\nLa palabra más larga es ", lista.get(0));
        System.out.printf("La palabra más corta es ", lista.get(lista.size()-1) +"\n");

    }
}
