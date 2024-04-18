package ejercicios.ejerciciosFichero.III_FicheroObj;

import java.util.Scanner;

import static java.lang.System.in;

public class Entrada {
    public static void main(String[] args) {

        GestorAgenda gestorAgenda = new GestorAgenda();
        Scanner scanner = new Scanner(in);


        gestorAgenda.guardarUsuario();
        gestorAgenda.leerUsuarios();

    }

}
