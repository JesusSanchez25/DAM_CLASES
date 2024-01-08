package ProbandoMain;


import ProbandoMain.OperacionesBase.OperacionesBase;

import java.util.Scanner;

import static java.lang.System.in;

public class Entrada {
    public static void main(String[] args) {

        // TIPO nombre = valor
        Scanner scanner = new Scanner(in);
        OperacionesBase operaciones = new OperacionesBase();
        operaciones.crearListaPlabaras();
        System.out.println("Inserte la palabra");
        operaciones.agregarElemento(scanner.next());
        operaciones.agregarElemento(scanner.next());
        operaciones.agregarElemento(scanner.next());
        operaciones.agregarElemento(scanner.next());
        operaciones.agregarElemento(scanner.next());
        operaciones.agregarElemento(scanner.next());
        operaciones.obtenerElemento();

        System.out.println("Inserte la palabra a buscar");
        operaciones.buscarPalabra(scanner.next());


    }
}
