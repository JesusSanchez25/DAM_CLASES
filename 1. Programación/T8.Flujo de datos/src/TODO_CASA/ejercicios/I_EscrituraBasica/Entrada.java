package TODO_CASA.ejercicios.I_EscrituraBasica;

import TODO_CASA.OperacionesFicheros;
import TODO_CASA.ejercicios.I_EscrituraBasica.model.Usuario;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Entrada {

    //1. (DatosBásicos) Realiza un programa que pida por pantalla los datos de un usuario
    // y lo añada a una lista (ArrayList) Los datos que se pedirán son: nombre, apellido,
    // dni, teléfono y edad. Al terminar de pedir todos los datos de un usuario la aplicación
    // deberá preguntar si se quieren seguir introduciendo datos: 2. En caso de contestar si,
    // se volverán a pedir los mismos datos, crear el usuario y meterlo en la lista 3.
    // En caso de contestar no se deberá volcar a un fichero llamado usuarios.txt todos los
    // datos de usuarios del ArrayList con el siguiente formato
    //
    //Usuario 1
    //
    //- Nombre:XXX
    //- Apellido:XXX
    //- Teléfono:XXX
    //- DNI:XXX
    //- Edad:XXX


    public static void main(String[] args) {
        int respuesta = 0;
        ArrayList<Usuario> usuarioArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(in);
        while (respuesta!=2){
            System.out.println("Empezando el proceso de creacion de usuario");
            System.out.println("Inserte un nombre, apellido, dni, teléfono y edad (seguido de espacios)");
            Usuario usuario = new Usuario(scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.nextInt());
            usuarioArrayList.add(usuario);

            System.out.println("Si desea dejar de crear usuarios pulse 2, si no, pulse 1");
            respuesta = scanner.nextInt();
        }

        OperacionesFicheros operacionesFicheros = new OperacionesFicheros("src/TODO_CASA/ejercicios/I_EscrituraBasica/usuario.txt");

        operacionesFicheros.borrarInformacion();
        for (Usuario item : usuarioArrayList) {
            operacionesFicheros.escribirInformacion(item.toString());
        }



    }



}
