import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Prueba {
    public static Object[][] carton = new Object[3][9];

    public static void main(String[] args) {


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                //Rellena el ArrayList de números aleatorios en pares de 3, ordenados por decenas
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


        MostrarCarton();



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

    public static void MostrarCarton (){

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

}
