package ArrayMultidimensionalEjericios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.in;

public class EjercicioBingo_Huecos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        ArrayList carton = new ArrayList<>(30);
        ArrayList numerosSalidos = new ArrayList<>();
        int numeroBingo;
        boolean linea = false;
        int contador = 0;

        //Da números a la cartilla que no se pueden repetir, así hasta 30 números, los coloca automáticamente
        // por columnas según la decena
        GenerarCarton(carton);

        //Muestra la cartilla
        System.out.println("Esta es tu cartilla de bingo:");
        MostrarCarton(carton);

        //Pregunta si está listo para emprezar
        System.out.println("Para empezar pulse -> Y");
        Character respuesta = scanner.next().charAt(0);
        while (!respuesta.toString().toUpperCase().equals("Y")){
            System.out.println("Letra incorrecta, cuando esté listo pulse -> Y");
            respuesta = scanner.next().charAt(0);
        }


        //Empieza el juego, el cual termina cuando el jugador haga bingo
        do {
            //Genera un número nuevo de Bingo que no puede haber salido previamente
            do {
                numeroBingo = (int)((Math.random()*90));

            } while (numerosSalidos.contains(numeroBingo));
            numerosSalidos.add(numeroBingo);

            //Dice el número que ha salido y lo elimina de la cartilla
            System.out.println("\n\nEl número que ha tocado es el: "+ numeroBingo);
            contador++;
            if(carton.contains(numeroBingo))
            {carton.set(carton.indexOf(numeroBingo),"  ");

            }

            //Muestra el cartón actualizado
            MostrarCarton(carton);

            //Detecta si ha habido una línea en ese turno
            if (linea(carton) && linea==false){
                linea=true;
                System.out.println("TE HA SALIDO UNA LÍNEA!!");
            }

            //Para 4 segundos hasta el siguiente número
            try {
                //Ponemos a "Dormir" el programa durante los ms que queremos
                Thread.sleep(3*1200);
            }
            catch (Exception e) {
                System.out.println();
            }

        } while (!bingo(carton));



        //BINGO
        if (bingo(carton)){

            System.out.println("HAS CONSEGUIDO EL PREMIO DEL BINGO!!!");
            System.out.println( "El bingo ha sido conseguido en: "+contador+" intentos");
        }



    }

    public static ArrayList GenerarCarton (ArrayList carton){
        //Genera 3 números en cada decena
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {

                //Rellena el ArrayList de números aleatorios en pares de 3, ordenados por decenas
                int numero;
                do {
                    numero =(int)(((Math.random()*10)+10*i)); //cuando hace 3 vueltas cambia de decena
                }while (carton.contains(numero));
                carton.add(numero);

                //Pone en orden de menor a mayor los números
                //Coge el valor genenrado y lo compara con el valor anterior, si es menor que este
                //se cambia y vuelve a ejecutarse hasta que sea el menor de estos
                while ((carton.indexOf(numero)>0) && (numero < (int)(carton.get(carton.indexOf(numero)-1)))){
                    carton.add(carton.indexOf(numero)-1,numero);
                    carton.remove(carton.lastIndexOf(numero));
                }
            }
        }

        //Sustituye un número aleatorio en cada fila y lo reemplaza por un espacio
        for (int k = 0; k < 9; k++) {
            carton.set((int)((Math.random()*3)+3*k), "  ");
        }

        // Después, elige 3 filas aleatorias para hacer lo mismo, dejando un total
        //de 15 números en el cartón y 15 espacios
        for (int i = 0; i < 3; i++) {
            int aleatorioColumna= (int)(Math.random()*9);
            int aleatorioFila = 0;
            boolean hecho = false;
            do {
                aleatorioFila = (int)(Math.random()*3);
                if (!carton.get((aleatorioColumna*3)+(aleatorioFila)).equals("  ")){
                    carton.set((aleatorioColumna*3)+(aleatorioFila), "  ");
                    hecho = true;
                }
            }while (!hecho);
        }






        return carton;}
    public static void MostrarCarton (ArrayList carton){
        Object[][] cartonArray = new Object[3][9];
        Collections.replaceAll(carton, -1, "  ");
        //Da valor a un nuevo array multidimensional basado en el cartón
        //Ordena los números por columnas
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                String numeroBingo = carton.get(j+(3*i)).toString();
                cartonArray[j][i] = (numeroBingo);
            }
        }

        System.out.println(" ╔══════════════════════════════════════╗ ");
        for (Object[] fila : cartonArray) {
            System.out.printf(" ║");
            for (Object numero : fila) {
                System.out.print("\t" + numero);
            }
            System.out.printf("  ║");
            System.out.println("");
        }

        System.out.println(" ╚══════════════════════════════════════╝");
    }

    public static boolean linea (ArrayList carton){
        int[][] cartonArray = new int[3][9];
        Collections.replaceAll(carton, "  ", -1);

        //Da valor a un nuevo array multidimensional basado en el cartón
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                cartonArray[i][j] = (int)carton.get(j+(9*i));
            }
        }

        // analiza todas las filas
        for (int i = 0; i < 3; i++) {
            int contador = 0;

            //Mira solo la primera columna y si detecta algún -1 procede a analizar
            //la fila entera
            if (cartonArray[i][0]==-1){
                for (int j = 0; j < 9; j++) {
                    if (cartonArray[i][j]==-1){
                        contador++;
                    }
                }
                if (contador==9){
                    Collections.replaceAll(carton, -1, "  ");
                    return true;
                }
            }
        }
        Collections.replaceAll(carton, -1, "  ");
        return false;



    }

    public static boolean bingo (ArrayList carton){
        Collections.replaceAll(carton, "  ", -1);
        int numero;
        int contador = 0;
        int i = 0;

        //Revisa del primer número al último en busca de bingo, si encuentra algún
        //número que no sea -1 para automáticamente para mayor eficiencia.
        do {
            numero = (int)carton.get(i);
            i++;
            if(numero==-1){contador++;}
        } while (numero==-1 && i<27);

        //Si completa el ciclo todos los números serán -1 y habrá bingo
        if (contador==27){
            Collections.replaceAll(carton, -1, "  ");
            return true;
        }

        //Si para antes de llegar a 27 comprobaciones todavía quedará algún número
        //pro tachar y no será bingo
        Collections.replaceAll(carton, -1, "  ");
        return false;
    }}