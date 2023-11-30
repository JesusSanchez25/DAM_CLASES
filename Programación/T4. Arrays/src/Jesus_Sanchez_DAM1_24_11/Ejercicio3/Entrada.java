package Jesus_Sanchez_DAM1_24_11.Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Entrada {
    //3. (6 puntos) Realizar una aplicación que gestione usuarios mediante una lista (tu
    //decides cual), donde los datos del alumno que se quieren guardar son nombre
    //(string), apellido (string), teléfono (int) y dni (string): La funcionalidad de la
    //aplicación se guiará por un menú con las siguientes opciones:
    //a. Agregar persona: Pedirá los datos de nombre, apellido, teléfono y dni.
    //Una vez pedidos agregará la persona en la lista.
    //b. Buscar persona: Pedirá un dni y sacará por pantalla todos los datos de la
    //persona asociada con el formato Nombre: XXX, Apellido: XXX, Teléfono:
    //XXX
    //c. Borrar persona: Pedirá un dni y la eliminará de la lista
    //d. Listar personas: Listará todos los elementos existentes en la lista con el
    //formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
    //En todos los casos se deberá de dar confirmación al usuario tanto del éxito
    //de la operación como de la ejecución incorrecta de la opción

    public static void main(String[] args) {
        Metodos metodo = new Metodos();

        ArrayList<String> DNIS = new ArrayList();
        int opcion;

        do {

            Scanner scanner = new Scanner(in);
            System.out.println("\nPulsa cualquier tecla para desplegar el menú");
            scanner.next();
            System.out.println("Elige la opción que desees");
            System.out.println("1.Agregar persona");
            System.out.println("2.Buscar persona");
            System.out.println("3.Borrar persona");
            System.out.println("4.Listar personas");
            System.out.println("5.Salir");
            opcion = scanner.nextInt();

            switch (opcion){

                //A
                case 1:
                    //a. Agregar persona: Pedirá los datos de nombre, apellido, teléfono y dni.
                    //Una vez pedidos agregará la persona en la lista.
                    Object[] persona = new Object[4];


                    System.out.println("Inserte el nombre");
                    persona[0] = scanner.next();
                    System.out.println("Inserte el apellido");
                    persona[1] = scanner.next();
                    System.out.println("Inserte el teléfono");
                    persona[2] = scanner.nextInt();
                    System.out.println("Inserte el dni");
                    persona[3] = scanner.next();
                    System.out.println("");



                    if (DNIS.contains(persona[3])){
                        System.out.println("Ese DNI ya ha sido utilizado antes");
                        System.out.println("No se ha podido agregar");
                    } else {
                        DNIS.add((String)persona[3]);
                        metodo.agregarPersona(persona);
                        System.out.println("La persona ha sido agregada con éxito");
                    }

                    break;


                //B
                case 2:
                    System.out.println("Inserte el dni de la persona a buscar");
                    metodo.buscarPersona(scanner.next());


                    break;

                case 3:
                    System.out.println("Inserte el dni de la persona a borrar");

                    //Si borras una persona también se borra su DNI de la base de datos,
                    //así cuando borras a una persona luego puedes volver a agregarse con
                    //el mismo DNI sin problemas
                    int posicion = metodo.borrarPersona(scanner.next());

                    if (posicion != -1){
                        DNIS.remove(posicion);
                    }
                    break;

                case 4:
                    metodo.listarPersonas();
                    break;

                default:
                    System.out.println("inserte una opcíon válida");
                    break;

            }
        } while (opcion!=5);
        
        System.out.println("Saliendo...");
        
        
        
        
        
    }
}
