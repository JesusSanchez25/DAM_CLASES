package PruebasyCosas;

import java.util.Scanner;

public class ArbolitoNavidad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce como de grande quieres que sea tu arbol de navidad");
        int tamaño = scanner.nextInt();
        int asteriscos = -1;
        int espacios = tamaño+7;
        for (int i = 0; i < tamaño; i++) {
                asteriscos+=2;
                espacios-=1;
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
