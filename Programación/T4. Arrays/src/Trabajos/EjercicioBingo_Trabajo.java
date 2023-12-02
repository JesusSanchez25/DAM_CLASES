package Trabajos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class EjercicioBingo_Trabajo {
    public static Object[][] carton = new Object[3][9];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        ArrayList numerosSalidos = new ArrayList<>();
        int velocidad = -1;
        boolean lineaRealizada = false;
        int contadorIntentos = 0;



        //Da números a la cartilla que no se pueden repetir, así hasta 30 números, los coloca automáticamente
        // por columnas según la decena
        GenerarCarton();

        //Muestra la cartilla
        System.out.println("Esta es tu cartilla de bingo:");
        MostrarCarton();
        String respuesta;


        //Elige la modalidad
        do {
            System.out.println("Pulsa R si quieres una partida rápida o L si quieres una partida lenta");
            respuesta = ""+scanner.next().charAt(0);
            if (!respuesta.equalsIgnoreCase("R") && !respuesta.equalsIgnoreCase("l")){
                System.out.println("Inserte una de las opciones");
            }

            switch (respuesta.toString().toLowerCase()){
                case "r"-> velocidad=0;
                case "l" -> velocidad=3;
            }
        } while (!respuesta.equalsIgnoreCase("r") && !respuesta.equalsIgnoreCase("l"));


        //Empieza el juego, el cual termina cuando el jugador haga bingo
        do {
            //Genera un número nuevo de Bingo que no puede haber salido previamente
            int numeroBingo;
            
            do {
                numeroBingo = (int)((Math.random()*90));

            } while (numerosSalidos.contains(numeroBingo));
            numerosSalidos.add(numeroBingo);

            //Dice el número que ha salido y lo elimina de la cartilla
            System.out.println("\n\nEl número que ha tocado es el: "+ numeroBingo);
            contadorIntentos++;
            tacharNumero(numeroBingo);


            //Muestra el cartón actualizado
             MostrarCarton();

            //Detecta si ha habido una línea en ese turno
            if (linea() && !lineaRealizada){
                lineaRealizada=true;
                System.out.println("TE HA SALIDO UNA LÍNEA!!");
                System.out.println("En el turno: "+contadorIntentos);
                System.out.println("Para continuar pulse -> Y");
                respuesta = ""+scanner.next().charAt(0);

                while (!respuesta.equalsIgnoreCase("Y")){
                    System.out.println("Letra incorrecta, cuando esté listo pulse -> Y");
                    respuesta = ""+scanner.next().charAt(0);
                }
            }

            //La cantidad de segundos hasta el siguiente número, depende de la modalidad
            try {
                Thread.sleep(velocidad*1100);
            }
            catch (Exception e) {
                System.out.println();
            }

        } while (!bingo());



        //BINGO
        if (bingo()){

            System.out.println("HAS CONSEGUIDO EL PREMIO DEL BINGO!!!");
            System.out.println( "El bingo ha sido conseguido en: "+contadorIntentos+" intentos");
        }



    }

    public static boolean numeroEsta(Object numero){
        for (Object[] linea : carton) {
            for (Object casilla : linea) {
                if (casilla==numero){
                    return true;
                }
            }
        }
        return false;
    }

    public static void tacharNumero(Object numero){
        for (int i = 0; i < carton[0].length; i++) {
            for (int j = 0; j < carton.length; j++) {
                if (carton[j][i]==numero){
                    carton[j][i] = "  ";
                }
            }
        }


    }

    public static Object[][] GenerarCarton (){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                //Rellena el array de números aleatorios en pares de 3, ordenados por decenas
                int numeroAleatorio;
                do {
                    numeroAleatorio = (int)(Math.random()*10+10*i);
                } while (numeroEsta(numeroAleatorio) || numeroAleatorio==0);
                carton[j][i] = numeroAleatorio;
            }}


        //Pone en orden de menor a mayor los números
        for (int j = 0; j < carton[0].length; j++) {
            for (int i = 0; i < carton.length-1; i++) {
                if ((int)carton[i+1][j] < (int)carton[i][j]){
                    Object aux = carton[i][j];

                    carton[i][j] = carton[i+1][j];
                    carton[i+1][j] = aux;

                    if (i!=0){
                        i-=2;
                    }
                }
            }
        }

        //Sustituye un número aleatorio en cada fila y lo reemplaza por un espacio
        for (int k = 0; k < 9; k++) {
            carton[(int)(Math.random()*3)][k] = "  ";
        }


        // Después, elige 3 filas aleatorias para hacer lo mismo, dejando un total
        //de 15 números en el cartón y 12 espacios
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> columnasCambiadas = new ArrayList<>();
            do {
                //Detecta si ya hay un hueco ahí y si lo hay lo intenta de nuevo con otro número de
                //la misma columna hasta que pone el hueco y pasa a otra columna diferente
                int aleatorioColumna;
                int aleatorioFila = (int)(Math.random()*3);

                do {
                    aleatorioColumna= (int)(Math.random()*9);
                } while (columnasCambiadas.contains(aleatorioColumna));

                if (!carton[aleatorioFila][aleatorioColumna].equals("  ")){
                    carton[aleatorioFila][aleatorioColumna] = "  ";
                    columnasCambiadas.add(aleatorioColumna);
                    break;
                }
            }while (true);

        }

        return carton;
    }

    public static void MostrarCarton (){
        //Puestra el Object[][] de cartón
        System.out.println(" ╔══════════════════════════════════════╗ ");
        for (Object[] fila : carton) {
            System.out.printf(" ║");
            for (Object numero : fila) {
                System.out.print("\t" + numero);
            }
            System.out.printf("  ║");
            System.out.println("");
        }

        System.out.println(" ╚══════════════════════════════════════╝");
    }

    public static boolean linea (){

        //Revisa del primer número al último en busca de bingo, si encuentra algún
        //valor que no sea un espacio para automáticamente para mayor eficiencia.
        for (Object[] linea : carton) {
            int contador = 0;

            for (Object numero: linea) {
                if (!numero.equals("  ")){
                    break;
                }
                contador++;
                if (contador==linea.length){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean bingo (){
        //Revisa del primer número al último en busca de bingo, si encuentra algún
        //valor que no sea un espacio para automáticamente para mayor eficiencia.
        for (Object[] linea : carton) {
            for (Object numero: linea) {
                if (!numero.equals("  ")){
                    return false;
                }
            }
        }
        return true;


    }}