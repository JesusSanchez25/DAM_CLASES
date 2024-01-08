package T3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //1. Realiza un programa que muestre por consola el siguiente menú
        //1. Realizar suma
        //2. Realizar potencia
        //3. Realizar multiplicación
        //4. Salir
        //Una vez impreso el menú se deberán pedir los datos correspondientes a la
        //operación. Una vez pedidos se mostrará el resultado de la operación con el siguiente
        //formato: “El resultado de la potencia con los operandos 4 y 2 es de 8”
        //En el caso de seleccionar salir o cualquier opción no contemplada no deberá pedir
        //ningún operador


        Scanner scanner = new Scanner(System.in);

        double operando1;
        double operando2;
        int opcion = 0;


        do {
            System.out.println("Introduzca el primer operando ");
            operando1 = scanner.nextInt();


            System.out.println("Introduzca la operación");
            System.out.println("1.Realizar suma");
            System.out.println("2.Realizar potencia");
            System.out.println("3.Realizar multiplicación");
            System.out.println("4.Salir");
            opcion = scanner.nextInt();

            if(opcion<=3 && opcion>0){
                System.out.println("Introduzca el segundo operando ");
            operando2 = scanner.nextInt();

            switch (opcion){
                case 1-> System.out.println("El resultado de la operación es: "+(operando1+operando2));
                case 2-> System.out.println("El resultado de la operación es: "+Math.pow(operando1,operando2));
                case 3-> System.out.println("El resultado de la operación es: "+(operando1*operando2));

            }}

        } while (opcion<=4 && opcion>=0);






    }
}
