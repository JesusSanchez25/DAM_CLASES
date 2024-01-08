package HashtableEjercicios.metodosEj2;

import com.sun.source.tree.SwitchTree;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

import static java.lang.System.*;

public class MetodosEj2 {
    //1. (Agenda) Realizar una aplicación que gestione usuarios mediante arrays, donde los cuales constan de nombre (string), apellido (string),
    // teléfono (int) y dni (string): La funcionalidad de la aplicación se guiará por un menú
    //con las siguientes opciones:
    //- Agregar persona: Pedirá los daos de nombre, apellido, teléfono y dni. Una vez pedidos agregará la persona en la lista.
    //- Buscar persona: Pedirá un dni y sacará por pantalla todos los datos de la persona
    //asociada con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
    //- Borrar persona: Pedirá un dni y la eliminará de la lista
    //- Listar personas: Listará todos los elementos existentes en la lista con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
    //- En todos los casos se deberá de dar confirmación al usuario tanto del éxito de la operación como de la ejecución incorrecta de la opción
    Scanner scanner = new Scanner(in);
    Hashtable<String, Object[]> usuarioshash = new Hashtable<>();
    Object[] persona;

    public void iniciarEjercicio(){
        int respuesta;
        do {
            out.println("Elige la opción que desees");
            out.println("1. Agregar a una persona");
            out.println("2. Buscar a una persona");
            out.println("3. Eliminar a una persona");
            out.println("4. Listar todas las personas");
            out.println("5. Salir");
            respuesta = scanner.nextInt();

            switch (respuesta){
                case 1->agregarPersona();
                case 2->buscarPersona();
                case 3->borrarPersona();
                case 4->listarPersona();
                case 5-> out.println("Saliendo...");
                default -> out.println("El número introducido es incorrecto");

            }


        }while (respuesta!=5);
    }
    private void agregarPersona (){
        Scanner scanner = new Scanner(in);
        persona= new Object[4];
        System.out.println("Inserte el nombre, apellido, teléfono y dni (Separados por comas)");
        String input = scanner.nextLine();
        String[] inputs = input.split(",");
        persona[0] = inputs[0].trim();
        persona[1] = inputs[1].trim();
        persona[2] = Integer.parseInt(inputs[2].trim());
        persona[3] = inputs[3].trim();

        if (usuarioshash.get(persona[3])!=(null)){
            out.println("Esa persona ya ha sido agregada");
        } else {
            System.out.println("La persona ha sido añadida con éxito");
        }

        usuarioshash.put(persona[3].toString(), persona);

    }

    private void buscarPersona(){
        System.out.println("Inserte el DNI de la persona a buscar");
        String DNI = scanner.next();
        if (usuarioshash.get(DNI).equals(null)){
            System.out.println("No se ha encontrado ninguna persona con ese DNI");
        } else {
            System.out.println("Nombre: "+ usuarioshash.get(DNI)[0]);
            System.out.println("Apellidos:"+ usuarioshash.get(DNI)[1]);
            System.out.println("Teléfono:"+ usuarioshash.get(DNI)[2]);
            System.out.println("DNI: "+ usuarioshash.get(DNI)[3]);

        }


    }
    private void borrarPersona(){
        System.out.println("Inserte el DNI de la persona a borrar");
        String DNI = scanner.next();
        if (usuarioshash.get(DNI).equals(null)){
            System.out.println("No se ha encontrado ninguna persona con ese DNI");
        } else {

            System.out.println("ha sido eliminada la persona");
            System.out.println("Nombre: "+ usuarioshash.get(DNI)[0]);
            System.out.println("Apellidos:"+ usuarioshash.get(DNI)[1]);
            System.out.println("Teléfono:"+ usuarioshash.get(DNI)[2]);
            System.out.println("DNI: "+ usuarioshash.get(DNI)[3]);
            usuarioshash.remove(DNI);

        }
    }
    private void listarPersona(){
        Enumeration<Object[]> elementos = usuarioshash.elements();

        System.out.println("");
        while (elementos.hasMoreElements()){
            Object[] element = elementos.nextElement();
            for (Object item : element) {
                out.printf(item+", ");
            }
            System.out.println("");
        }



    }




}
