package EjerciciosSwitch;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Crea un programa que permita al usuario ingresar un código de producto (como una cadena de caracteres) y,
        // utilizando una sentencia switch, muestre el nombre del producto y su precio correspondiente

        Scanner LeerTeclado = new Scanner(System.in);

        System.out.println("Inserte el código el producto: (CODIGO1/CODIGO2/CODIGO3)");
        String codigo = LeerTeclado.next();

        switch (codigo.toUpperCase()) {
            case "CODIGO1":
                System.out.println("Primer producto: 25€");
                break;
            case "CODIGO2":
                System.out.println("Segundo producto: 35€");
                break;
            case "CODIGO3":
                System.out.println("Tercer producto 10€");
                break;


        }


    }
}
