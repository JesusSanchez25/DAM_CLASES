package Trabajos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class EjercicioBingo_Trabajo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        ArrayList carton = new ArrayList<>(30);
        ArrayList numerosSalidos = new ArrayList<>();
        int velocidad = -1;
        boolean lineaRealizada = false;
        int contadorIntentos = 0;

        //Da números a la cartilla que no se pueden repetir, así hasta 30 números, los coloca automáticamente
        // por columnas según la decena
        GenerarCarton(carton);

        //Muestra la cartilla
        System.out.println("Esta es tu cartilla de bingo:");
        MostrarCarton(carton);
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
            if(carton.contains(numeroBingo))
            {carton.set(carton.indexOf(numeroBingo),"  ");

            }

            //Muestra el cartón actualizado
            MostrarCarton(carton);

            //Detecta si ha habido una línea en ese turno
            if (linea(carton) && !lineaRealizada){
                lineaRealizada=true;
                System.out.println("TE HA SALIDO UNA LÍNEA!!");
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

        } while (!bingo(carton));



        //BINGO
        if (bingo(carton)){

            System.out.println("HAS CONSEGUIDO EL PREMIO DEL BINGO!!!");
            System.out.println( "El bingo ha sido conseguido en: "+contadorIntentos+" intentos");
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
                //Empieza siempre en el segundo valor, coge el valor genenrado y lo compara con el valor anterior,
                // si es menor que este se cambia y vuelve a ejecutarse hasta que sea el menor de estos
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
        //de 15 números en el cartón y 12 espacios
        for (int i = 0; i < 3; i++) {
            int aleatorioColumna= (int)(Math.random()*9);
            int aleatorioFila = 0;
            do {
                //Detecta si ya hay un hueco ahí y si lo hay lo intenta de nuevo con otro número de
                //la misma columna, es un poco más enrevesado al intentar hacerlo con ArrayList pero
                //funciona bien (Hice el ejercicio cuando empezabamos a dar ArrayList)
                aleatorioFila = (int)(Math.random()*3);
                if (!carton.get((aleatorioColumna*3)+(aleatorioFila)).equals("  ")){
                    carton.set((aleatorioColumna*3)+(aleatorioFila), "  ");
                    break;
                }
            }while (true);

        }

        return carton;
    }

    public static void MostrarCarton (ArrayList carton){
        Object[][] cartonArray = new Object[3][9];
        //Da valor a un nuevo array multidimensional basado en el cartón para imprimirlo más facilmente

        //Ordena los números por columnas
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                //Introduce los números previamente ordenados en su respectiva celda
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
        String[][] cartonArray = new String[3][9];

        //Da valor a un nuevo array multidimensional basado en el cartón
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                cartonArray[i][j] = carton.get(j+(9*i)).toString();
            }
        }


        // analiza todas las filas
        for (int i = 0; i < 3; i++) {
            int contador = 0;

            //Mira solo la primera columna y si detecta algún espacio procede a analizar
            //la fila entera
            if (cartonArray[i][0].equals("  ")){
                for (int j = 0; j < 9; j++) {
                    if (cartonArray[i][j].equals("  ")){
                        contador++;
                    }
                }
                //Si la fila entera está vacia grita línea
                if (contador==cartonArray[i].length){
                    return true;
                }
            }
        }
        return false;



    }

    public static boolean bingo (ArrayList carton){
        String numero = carton.get(0).toString();
        int contador = 0;

        //Revisa del primer número al último en busca de bingo, si encuentra algún
        //valor que no sea un espacio para automáticamente para mayor eficiencia.
        while (numero.equals("  ") && contador<carton.size()){
            numero = carton.get(contador).toString();
            if(numero.equals("  ")){
                contador++;}
        }

        //Si completa el ciclo todos los números serán espacios y habrá bingo
        if (contador==carton.size()){
            return true;
        }

        //Si para antes de llegar a 27 comprobaciones todavía quedará algún número
        //por tachar y no será bingo
        return false;
    }}