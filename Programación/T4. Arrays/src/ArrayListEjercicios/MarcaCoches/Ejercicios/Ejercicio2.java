package ArrayListEjercicios.MarcaCoches.Ejercicios;

import ArrayListEjercicios.MarcaCoches.MetodosComunes.MetodosComunes;

import java.util.ArrayList;

public class Ejercicio2 {
    //2. Crear un programa que genere 30 números aleatorios entre 0 - 10 y los guarde en un array. Una vez metidos, se deberá mostrar:
    //    - Numero de puntos obtenidos
    //    - Media de puntos obtenidos
    public static void GenerarArray (){
        ArrayList lista = new ArrayList<>();
        int suma = 0;

        for (int i = 0; i < 10; i++) {
            lista.add((int)(Math.random()*11));
        }
        MetodosComunes.MostrarArray(lista);
        for (Object numero : lista) {
            suma+=(int)numero;

        }
        System.out.println("La suma de puntos obtenidos es: "+ suma);
        System.out.println("La media de puntos obtenidos es: "+ suma/lista.size());

    }}

