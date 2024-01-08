package EjerciciosWhile;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        //Modifica el ejercicio anterior para hacer una calculadora. Nada más ejecutar se mostrarán las
        // opciones disponibles - Bienvenido a la aplicación de calculos - Introduce operando uno: -
        // Introduce operando dos: - 1. Sumar - 2. Restar - 3. Multiplicar - 4. Dividir - 5. Módulo - 6.
        // Salir - Selecciona la operacion que quieres realizar.
        //Al seleccionar una de las opciones el sistema realizará la operación correspondiente y mostrará
        // el resultado por pantalla de la siguiente forma "El resultado de la operación es:". Una vez
        // terminada la operación volverá a mostrar el menú y pedir dos números nuevos. (MenuCalculo)

        Scanner LeerTeclado = new Scanner(System.in);
        int respuesta = 0;
        Double operando1 = 0.0;
        Double operando2 = 0.0;
        while (respuesta!=6){
            System.out.println("Bienvenido a la aplicación de cálculos");
            System.out.println("Introduce el operando uno");
            operando1 = LeerTeclado.nextDouble();
            System.out.println("Seleccione la operación deseada");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Módulo");
            System.out.println("6. Salir");
            respuesta = LeerTeclado.nextInt();
            System.out.println("Introduce el operando dos");
            operando2 = LeerTeclado.nextDouble();

            switch (respuesta){
                case 1-> System.out.println("El resultado de la operación es: "+operando1+operando2);
                case 2-> System.out.println("El resultado de la operación es: "+(operando1-operando2));
                case 3-> System.out.println("El resultado de la operación es: "+operando1*operando2);
                case 4-> System.out.println("El resultado de la operación es: "+operando1/operando2);
                case 5-> System.out.println("El resultado de la operación es: "+operando1%operando2);
                default->System.out.println("Saliendo...");
            }}



    }
}
