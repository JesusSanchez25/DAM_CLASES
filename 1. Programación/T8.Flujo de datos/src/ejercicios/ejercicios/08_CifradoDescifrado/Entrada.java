package TODO_CASA.ejercicios.VIIII_CifradoDescifrado;

import TODO_CASA.OperacionesFicheros;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.in;

public class Entrada {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        System.out.println("Has entrado en cifrar fichero");
        System.out.println("Introduce la frase a cifrar");

        BufferedReader bufferedReader = null;
        String texto = "";
        int clave = 0;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            texto = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("Error leyendo la línea");
        }

        System.out.println("Inserte la clave");
        clave = scanner.nextInt();

        System.out.println("Inserte el nombre del fichero al que quieres poner los datos");
        String nombreFichero = scanner.next();

        OperacionesFicheros operacionesFicheros = null;
        operacionesFicheros = new OperacionesFicheros("src/TODO_CASA/ejercicios/VIIII_CifradoDescifrado/documentos/"+nombreFichero);

        operacionesFicheros.escribirInformacion(operacionesFicheros.descifrarInformacion(texto, clave));





        //todo descifrar fichero

    }


}
