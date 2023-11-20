package EjerciciosWhile;

import java.util.Scanner;

public class Ejercicio09_Mejorado {
    public static void main(String[] args) {
        //3. Modifica el ejercicio 9 para hacer una calculadora de cambios de base. Nada más ejecutar se
        // mostrarán las opciones disponibles - Bienvenido a la aplicación de cambios de base
        //    - Introduce el número que quieres cambiar de base:
        //    - Pasar a base2
        //    - Pasar a base8
        //    - Pasar a base16
        //    - Salir
        //    - Selecciona la base a la que quieres pasar
        //
        //Al introducir un número el sistema comprobará que es mayor que 0. En caso de no serlo mostrará el
        // mensaje "No válido, introduce otro", esperando una nueva introducción de datos. Una vez introducido,
        // al seleccionar una de las opciones el sistema realizará la conversión correspondiente y mostrará el
        // resultado por pantalla de la siguiente forma "El número XX en base10 es igual que XX en baseXX".
        // Una vez terminada la operación volverá a mostrar el menú y pedir un número. (MenuBases)

        Scanner LeerTeclado = new Scanner(System.in);
        int BaseDeseada = 0;
        int operando1 = 0;
        while (BaseDeseada != 4) {
            System.out.println("Bienvenido a la aplicación de cambios de base");
            System.out.println("Introduce el número a cambiar");
            operando1 = LeerTeclado.nextInt();

            System.out.println("Seleccione la base deseada");
            System.out.println("1. Base 2");
            System.out.println("2. Base 8");
            System.out.println("3. Base 16");
            System.out.println("4. Salir");
            BaseDeseada = LeerTeclado.nextInt();

            switch (BaseDeseada) {
                case 1 -> System.out.println("El número con base 2 es: " + Ejercicio09_Mejorado.Resultado(operando1, operando1,2));
                case 2 -> System.out.println("El número con base 8 es: " + Resultado(operando1, operando1,8));
                case 3 -> System.out.println("El número con base 16 es: " + Resultado(operando1, operando1,16));
                default -> System.out.println("Saliendo...");
            }
        }
    }

    public static String Resultado(int moduloOperando1, int divisionOperando1, int base) {
        String Resultado = "";
        String ResultadoVerdadero = "";
        while (moduloOperando1 > 0) {
            divisionOperando1 = moduloOperando1 % base;
            moduloOperando1 /= base;


            if (divisionOperando1 >= 10) {
                switch (divisionOperando1) {
                    case 10 -> Resultado += "A";
                    case 11 -> Resultado += "B";
                    case 12 -> Resultado += "C";
                    case 13 -> Resultado += "D";
                    case 14 -> Resultado += "E";
                    case 15 -> Resultado += "F";

                }
            } else {
                Resultado += divisionOperando1;

            }
        }
        for (int z = 0; z < Resultado.length(); z++) {
            ResultadoVerdadero += Resultado.charAt(Resultado.length() - 1 - z);

        }
        return ResultadoVerdadero;

    }
}
