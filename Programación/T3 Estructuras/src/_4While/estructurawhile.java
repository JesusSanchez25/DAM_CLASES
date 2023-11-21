package _4While;

import java.util.Scanner;

public class estructurawhile {
    public static void main(String[] args) {
        int numero = 10;
        Scanner scanner = new Scanner(System.in);

        while (numero != 0) {
            System.out.println("Por favor introduce un número");
            numero=scanner.nextInt();
        }

    }
}
