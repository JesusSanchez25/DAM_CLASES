package ejercicios.ejerciciosFichero.I_Ejercicio;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Entrada {
/*
    //Supongamos que vamos a automatizar la forma de rellenar un formulario. Para ello
    //vamos a crear una clase Formulario que tendrá un método main.
    //Dentro de este main se le mostrará al usuario un menú con las siguientes opciones:
    //1. Rellenar nombre.
    //2. Rellenar apellidos.
    //3. Rellenar DNI.
    //4. Rellenar e-mail.
    //5. Finalizar.
    //Mientras que el usuario no elija la opción 5, se le seguirá mostrando el menú. Si el usuario
    //elije la opción 5, solo se le dejará salir del programa en caso de que haya rellenado todos
    //los datos, en caso contrario se mostrará un mensaje por pantalla indicando que faltan
    //datos por rellenar. (1,5 puntos)
    //En cada opción se realizarán las siguientes comprobaciones:
    //- Opción 1: se introducen únicamente letras. En caso contrario lanzaremos la excepción
    //TipoDatoIncorrectoException. (0,18 puntos)
    //- Opción 2: se introducen únicamente letras. En caso contrario lanzaremos la excepción
    //TipoDatoIncorrectoException. (0,18 puntos)
    //- Opción 3:
    //- Si la longitud es distinta a 9 dígitos lanzaremos LongitudDNINoValidaException. (0,36
    //puntos)
    //- Si el último caracter es distinto de una letra lanzaremos UltimoDigitoNoLetraException.
    //(0,36 puntos)
    //- Si los primeros 8 dígitos no son numéricos lanzaremos
    //NumeracionContieneLetrasException. (0,36 puntos)
    //- Opción 4: comprobaremos que se ha introducido un caracter "@" y un "." En caso
    //contrario lanzaremos la excepción EmailIncorrectoException. (0,36 puntos)
    //Al salir del programa se mostrarán por pantalla un resumen con los datos rellenados. (0,2
    //puntos)
    //Recordar los métodos Character.isDigit() y Character.isLetter() que comprueban si un
    //caracter que se le pasa por parámetro es un dígito o una letra, respectivamente.
    //Recordar el método .contains() que tienen los objetos tipo String que indica si contiene la
    //cadena de caracteres que se le pasa por parámetro.

    private static String[] datos = new String[]{"nombre", "apellidos", "DNI", "email"};
    private static JSONObject nuevoUsuario = new JSONObject();

    public static void main(String[] args) {

        //1. Rellenar nombre.
        //2. Rellenar apellidos.
        //3. Rellenar DNI.
        //4. Rellenar e-mail.
        //5. Finalizar.

        File file = new File("src/ejercicios/ejerciciosFichero/recursos/usuarios");
        BufferedReader bufferedReader = null;
        JSONArray jsonArrayUsuarios;
        JSONObject jsonUsuario;

        //Mientras que el usuario no elija la opción 5, se le seguirá mostrando el menú. Si el usuario
        //elije la opción 5, solo se le dejará salir del programa en caso de que haya rellenado todos
        //los datos, en caso contrario se mostrará un mensaje por pantalla indicando que faltan
        //datos por rellenar. (1,5 puntos)
        //En cada opción se realizarán las siguientes comprobaciones:
        //- Opción 1: se introducen únicamente letras. En caso contrario lanzaremos la excepción
        //TipoDatoIncorrectoException. (0,18 puntos)
        //- Opción 2: se introducen únicamente letras. En caso contrario lanzaremos la excepción
        //TipoDatoIncorrectoException. (0,18 puntos)
        //- Opción 3:
        //- Si la longitud es distinta a 9 dígitos lanzaremos LongitudDNINoValidaException. (0,36
        //puntos)
        //- Si el último caracter es distinto de una letra lanzaremos UltimoDigitoNoLetraException.
        //(0,36 puntos)
        //- Si los primeros 8 dígitos no son numéricos lanzaremos
        //NumeracionContieneLetrasException. (0,36 puntos)
        //- Opción 4: comprobaremos que se ha introducido un caracter "@" y un "." En caso
        //contrario lanzaremos la excepción EmailIncorrectoException. (0,36 puntos)
        //Al salir del programa se mostrarán por pantalla un resumen con los datos rellenados. (0,2
        //puntos)

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder = new StringBuilder();
            String linea = "";
            while ((linea =  bufferedReader.readLine()) != null){
                stringBuilder.append(linea);
            }

            jsonArrayUsuarios = new JSONArray(stringBuilder.toString());

            
        } catch (FileNotFoundException e) {
            System.out.println("Error en la lectura");
        } catch (IOException e) {
            System.out.println("IO error");
        } finally {
            try {
                if (bufferedReader !=null){
                    bufferedReader.close();
                }
            } catch (IOException e){
                System.out.println("error");
            }

        }



        int opcion = 0;
        Scanner scanner = new Scanner(in);


        // Esto está bien porque si la respuesta no es 5 no va a ejecutar la función
        while (opcion != 5 || !comprobarJSON()){
            //- Opción 1: se introducen únicamente letras. En caso contrario lanzaremos la excepción
            //TipoDatoIncorrectoException. (0,18 puntos)
            //- Opción 2: se introducen únicamente letras. En caso contrario lanzaremos la excepción
            //TipoDatoIncorrectoException. (0,18 puntos)
            //- Opción 3:
            //- Si la longitud es distinta a 9 dígitos lanzaremos LongitudDNINoValidaException. (0,36
            //puntos)
            //- Si el último caracter es distinto de una letra lanzaremos UltimoDigitoNoLetraException.
            //(0,36 puntos)
            //- Si los primeros 8 dígitos no son numéricos lanzaremos
            //NumeracionContieneLetrasException. (0,36 puntos)
            //- Opción 4: comprobaremos que se ha introducido un caracter "@" y un "." En caso
            //contrario lanzaremos la excepción EmailIncorrectoException. (0,36 puntos)
            //Al salir del programa se mostrarán por pantalla un resumen con los datos rellenados. (0,2
            //puntos)
            String respuestaTexto;
            System.out.println("1. Rellenar nombre ");
            System.out.println("2. Rellenar apellido");
            System.out.println("3. Rellenar DNI ");
            System.out.println("4. Rellenar E-MAIL ");
            System.out.println("5. Finalizar ");

            opcion = scanner.nextInt();


            switch (opcion){
                case 1:
                    System.out.println("Inserta tu nombre");
                respuestaTexto = scanner.next();
                if (respuestaTexto.chars().allMatch(Character::isLetter)){
                    System.out.println("Nombre añadido");
                    nuevoUsuario.append(datos[0], respuestaTexto);
                } else {
                    System.out.println("No se ha podido agregar");
                    System.out.println("No se permiten números");
                }
                break;
            }
        }




    }

    private static boolean comprobarJSON(){
        if (nuevoUsuario.length() != datos.length){
            for (int i = 0; i < nuevoUsuario.length(); i++) {
                if (!nuevoUsuario.has(datos[i])){
                    System.out.println("p");
                    System.out.println("Te falta el " + datos[i] + " crack");
                }
            }
            System.out.println("\nYo que tu lo arreglaba");
            return true;
        }
        System.out.println("Todo correcto caballero");
        return false;
    }
*/
}
