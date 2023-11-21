package EjerciciosWhile;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        //Realizar un menú de 4 opciones, donde se mostrará por pantalla el siguiente formato -
        // Bienvenido a la aplicación del menú - 1. Opción1 - 2. Opción2 - 3. Opción3 - 4. Opción4 - 5. Salir -
        // Introduce la opción seleccionada
        //Una vez mostrado la última línea, el sistema esperará a que el usuario introduzca un dato.
        // Dependiendo de la opción seleccionada aparecerá un mensaje por pantalla que ponga "La
        // opción seleccionada es X". En el caso de meter una diferente pondrá "opción no contemplada".
        // El programa se repetiría hasta que introduzca el 5 (MenuSimple)


        Scanner LeerTeclado = new Scanner(System.in);
        int respuesta = 0;
        while (respuesta!=5){
            System.out.println("1. Netflix");
            System.out.println("2. Hbo");
            System.out.println("3. Amazon Prime");
            System.out.println("4. DisneyPlus");
            System.out.println("5. Salir");
            respuesta = LeerTeclado.nextInt();

            switch (respuesta){
                case 1-> System.out.println("La opción seleccionada es la Netflix");
                case 2-> System.out.println("La opción seleccionada es la Hbo");
                case 3-> System.out.println("La opción seleccionada es la Amazon Prime");
                case 4-> System.out.println("La opción seleccionada es la DisneyPlus");
                case 5-> System.out.println("Saliendo...");
                default->System.out.println("La opción seleccionada no existe");
            }}



    }
}