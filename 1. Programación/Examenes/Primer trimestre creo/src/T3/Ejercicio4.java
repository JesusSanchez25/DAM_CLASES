package T3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Realiza un programa que pida por consola una palabra (palabra maestra). Una
        //vez introducido pide una segunda palabra (palabra secundaria). El programa
        //seguirá pidiendo palabras hasta que se introduzca una que esté contenida en la
        //palabra maestra. Una vez se dé el caso pasará lo siguiente:
        //- De meter una palabra que esté incluida en la palabra maestra aparecerá por
        //consola el número de caracteres de esta (palabra maestra)
        //Ejemplo:
        //Introduce la palabra maestra: desarrollo
        //Introduce la palabra secundaria: ejemplo
        //Introduce la palabra secundaria: hola
        //Introduce la palabra secundaria: desa
        //10 letras
        //- De meter una palabra que sea idéntica a la palabra maestra, se mostrará por
        //consola la segunda palabra al revés
        //Introduce la palabra maestra: desarrollo
        //Introduce la palabra secundaria: ejemplo
        //Introduce la palabra secundaria: hola
        //Introduce la palabra secundaria: desarrollo
        //ollorrased

        Scanner scanner = new Scanner(System.in);

        String palabraMaestra;
        String palabraMaestraCopia;
        String palabraSecundaria;
        String palabraSecundariaCopia = "";
        int coinciden = 0;
        int identicas = 0;
        int longitudPalabraMaestra;
        int longitudPalabraSecundaria;

        System.out.println("Inserte la palabra maestra");
        palabraMaestra = scanner.next();

        do{

        System.out.println("Inserte la palabra secundaria");
         palabraSecundaria = scanner.next();
         longitudPalabraMaestra = palabraMaestra.length();
         longitudPalabraSecundaria = palabraSecundaria.length();

            for (int i = 0; i < longitudPalabraMaestra-longitudPalabraSecundaria+1; i++) {
               palabraMaestraCopia= palabraMaestra.substring(i,palabraSecundaria.length()+i);

                if (palabraMaestraCopia.equals(palabraSecundaria)){
                    coinciden++;
                    if (i==0){
                        identicas++;
                    }
                }
            }

    } while (coinciden==0);

        System.out.println("La palabra maestra contiene la palabra secundaria");
        System.out.println(longitudPalabraMaestra+" letras");

        if (identicas==1){

            for (int i = 0; i < longitudPalabraSecundaria; i++) {
                palabraSecundariaCopia += palabraSecundaria.charAt(longitudPalabraSecundaria-1-i);

            }

            System.out.println(palabraSecundariaCopia);
        }

    }
}
