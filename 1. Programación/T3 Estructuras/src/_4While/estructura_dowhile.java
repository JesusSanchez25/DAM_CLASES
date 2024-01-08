package _4While;

import java.util.Scanner;

public class estructura_dowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduce núero");
            numero = scanner.nextInt();
        } while (numero !=0);
    }
}
