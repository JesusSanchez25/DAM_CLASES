package EjerciciosWhile;

import java.util.Scanner;

    public class Ejercicio09 {
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
            int respuesta = 0;
            int operando1 = 0;
            while (respuesta!=4){
                System.out.println("Bienvenido a la aplicación de cambios de base");
                System.out.println("Introduce el número a cambiar");
                operando1 = LeerTeclado.nextInt();

                System.out.println("Seleccione la base deseada");
                System.out.println("1. Base 2");
                System.out.println("2. Base 8");
                System.out.println("3. Base 16");
                System.out.println("4. Salir");
                respuesta = LeerTeclado.nextInt();

                switch (respuesta){
                    case 1-> System.out.println("El número con base 2 es: "+binario(operando1,operando1));
                    case 2-> System.out.println("El número con base 8 es: "+Octal(operando1,operando1));
                    case 3-> System.out.println("El número con base 16 es: "+Hexadecimal(operando1,operando1));
                    default->System.out.println("Saliendo...");
                }}



        }
        public static String binario (int respuestaBinario, int respuestaBinario1_0){
            String Binario = "";
            String BinarioVerdadero = "";
            while (respuestaBinario>0){
                respuestaBinario1_0 = respuestaBinario%2;
                respuestaBinario /=2;

                Binario+=respuestaBinario1_0;

            }
            for (int z = 0; z < Binario.length(); z++) {
                BinarioVerdadero += Binario.charAt(Binario.length()-1-z);

        }
            return BinarioVerdadero;

        }
        public static String Octal (int respuestaOctal, int respuestaOctal1_0){
            String Octal = "";
            String OctalVerdadero = "";
            while (respuestaOctal>0){
                respuestaOctal1_0 = respuestaOctal%8;
                respuestaOctal /=8;

                Octal+=respuestaOctal1_0;

            }
            for (int z = 0; z < Octal.length(); z++) {
                OctalVerdadero += Octal.charAt(Octal.length()-1-z);

            }
            return OctalVerdadero;

        }
        public static String Hexadecimal (int respuestaHexadecimal, int respuestaHexadecimal1_0){
            String Hexadecimal = "";
            String HexadecimalVerdadero = "";
            while (respuestaHexadecimal>0){
                respuestaHexadecimal1_0 = respuestaHexadecimal%16;
                respuestaHexadecimal /=16;


                if (respuestaHexadecimal1_0>=10){
                    switch (respuestaHexadecimal1_0){
                        case 10-> Hexadecimal+="A";
                        case 11-> Hexadecimal+="B";
                        case 12-> Hexadecimal+="C";
                        case 13-> Hexadecimal+="D";
                        case 14-> Hexadecimal+="E";
                        case 15-> Hexadecimal+="F";

                    }
                } else if (respuestaHexadecimal1_0<10) {
                    Hexadecimal+=respuestaHexadecimal1_0;

                }

            }
            for (int z = 0; z < Hexadecimal.length(); z++) {
                HexadecimalVerdadero += Hexadecimal.charAt(Hexadecimal.length()-1-z);

            }
            return HexadecimalVerdadero;

        }

    }

