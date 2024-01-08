import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Prueba {


    public static void main(String[] args) {
        int[] alumnos = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        ArrayList numerosUsados = new ArrayList<>();
        int[] mostrar = new int[3];


        Scanner scanner = new Scanner(in);

        System.out.println("De cuanto es el grupo?");
        int grupo = scanner.nextInt();

        for (int item : alumnos) {


        }

        for (int i = 0; i < alumnos.length/grupo; i++) {

            for (int j = 0; j < grupo; j++) {

                int numeroRandom = (int)(Math.random()*alumnos.length);

                if (numerosUsados.contains(alumnos[numeroRandom])){
                    i--;
                }

                numerosUsados.add(numeroRandom);

                mostrar[i]=numeroRandom;


            }

            for (int item : mostrar) {
                System.out.print(item);

            }
            System.out.println();






        }



    }
}
