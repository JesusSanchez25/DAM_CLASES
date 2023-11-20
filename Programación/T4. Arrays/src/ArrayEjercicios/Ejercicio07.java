package ArrayEjercicios;

import java.util.Scanner;

import static java.lang.System.in;

public class Ejercicio07 {
    public static void main(String[] args) {
        //1. Crea un programa que pida 10 palabras por consola y las guarde en
        // un array de String. Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
        //    - Ver todas las palabras: mostrarla todas las palabras del array
        //    - Obtener una palabra al azar: mostrará una palabra de las que existen en el array
        //    - Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
        //    - Ver media de letras: mostrará el número medio de letras entre todas las palabas
        //    - Ver palabra con más letras
        //    - Ver palabra con menos letras

        Scanner scanner = new Scanner(in);
        String[] palabras = new String[10];
        Double contadorLetras = 0.0;
        String palabraMasGrande = "";
        String palabraMasPequeña = "";

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Inserte tu palabra");
            palabras[i]= scanner.next();
            if (contadorLetras==0){
                palabraMasPequeña=palabras[i];
            }
            contadorLetras += palabras[i].length();

               if (palabras[i].length()>palabraMasGrande.length()) {
                   palabraMasGrande = palabras[i];
               }
                if(palabras[i].length()<palabraMasPequeña.length()){
                palabraMasPequeña=palabras[i];
            }
        }

        System.out.print("Las palabras del array son: ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(palabras[i]+",");
        }

        System.out.println("\nLa palabra aleatoria es: "+ palabras[(int)(Math.random()*10)]);
        System.out.println("El número de letras total es: "+(contadorLetras.intValue()));
        System.out.println("El media de letras es: "+(contadorLetras/ palabras.length));
        System.out.println("La palabra más grande es: "+palabraMasGrande);
        System.out.println("La palabra más pequeña es: "+palabraMasPequeña);

    }
}
