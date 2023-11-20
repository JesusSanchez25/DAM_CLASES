package EjerciciosTFor;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        //Modificar el ejercicio anteriore para calcular la tabla de multiplicar de los numeros
        // comprendidos en un rango de números pedidos. Por ejemplo, las tablas de los números
        // comprendidos entre el 3 y el 7 (3,4,5,6,7)


        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte el número por el que empieza el rango");
        int numero = LeerTeclado.nextInt();
        System.out.println("Inserte el segundo número por el que empieza el rango");
        int numero1 = LeerTeclado.nextInt();




        for (int i=numero; i <= numero1; i++) {

            for (int j = 0; j < 11; j++) {
                System.out.printf("\n%d*%d=%d", i, j, i * j);
            }

        }



    }
}
