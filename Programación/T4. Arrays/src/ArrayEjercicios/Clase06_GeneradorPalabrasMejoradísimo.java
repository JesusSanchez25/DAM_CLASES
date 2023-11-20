package ArrayEjercicios;

import java.util.Scanner;

import static java.lang.System.in;

public class Clase06_GeneradorPalabrasMejoradísimo {
    public static void main(String[] args) {
        //1. (GeneradorPalabras) Crea un programa que cumpla los siguientes requisitos:
        //    - Crear un de chars con todas las letras del abecedario.
        //    - Crear un array de String con una longitud pedida por teclado
        //    - Pedir la longitud de cada una de las palabras que formarán parte del array del apartado 2.
        //    Tras pedir la longitud se creará una palabra de forma aleatoria con la longitud deseada
        //    (cada letra será una posición del array del apartado 1) y se guardará en el array del apartado 2

        //    - Imprimir por pantalla las palabras generada

        char[] abecedario = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l',
                'm','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};

        Scanner scanner = new Scanner(in);
        System.out.println("Inserte la longitud del array");
        int longitud = scanner.nextInt();

        String[] palabras = new String[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.printf("\nInserte la longitud de la %dº palabra\n",(i+1));
            int longitudPalabra = 10;
            palabras[i]="";
            do{
                palabras[i]="";
                for (int j = 0; j < longitudPalabra; j++) {
                palabras[i]+=abecedario[(int)(Math.random()*27)];
            }} while (!Vocales(palabras, i));

            }


            for (int j = 0; j < longitud; j++) {
                System.out.printf("La %dº palabra es: "+palabras[j]+"\n", (j+1));
            }




        }
        public static boolean Vocales(String[] palabra, int i){
            boolean verdad = false;
        if (palabra[i].contains("a") && palabra[i].contains("o") && palabra[i].contains("i") &&
                palabra[i].contains("u") && palabra[i].contains("e")){
            return true;
        }
            return verdad;
        }
    }

