package explicacion;

import explicacion.controler.OperacionesFicheros;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //EL BUFFERREADER PUEDE FALLAR
        // TE DEVUELVE UN STRING
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        OperacionesFicheros operacionesFicheros = new OperacionesFicheros();
        try {
            operacionesFicheros.lecturaDirectorio("C:\\Users\\Usuario DAM1\\Documents");
        } catch (Exception e) {
            System.out.println("");
        }


    }
}
