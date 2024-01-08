package EjerciciosTFor;

import java.util.Scanner;

public class Ejercicios11 {
    public static void main(String[] args) {
        //Dibujar por consola un Cuadrado de + . Para ello se pedirá por consola el tamaño del lado
        // y se imprimirá el cuadrado con el siguiente formato (CuadradoFor).

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte el lado del cubo");
        int lado = LeerTeclado.nextInt();
        for (int i = 0; i < lado; i++) {
            for (int ancho = 0; ancho < lado; ancho++) {
                if(i==0|| i==lado-1){
                    System.out.print(" + ");

                } else if ((ancho >0 && ancho < lado-1
                )){
                    System.out.print("   ");
                } else {
                    System.out.print(" + ");
                }
            }
            System.out.println("");
        }

    }
}
