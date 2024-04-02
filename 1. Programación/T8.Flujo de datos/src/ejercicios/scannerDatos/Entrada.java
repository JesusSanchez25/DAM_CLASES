package ejercicios.scannerDatos;

import escribirFichero.EscribirFichero;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Entrada {

    public static void main(String[] args) {

        ArrayList<Persona> personaArrayList = new ArrayList<>();


        Scanner scanner = new Scanner(in);

        int respuesta = 0;
        while (respuesta != 5){
            System.out.println("Vas a inscribir una persona");
            System.out.println("Insererta seguido por espacios o saltos de linea los siguientes datos");
            System.out.println("Nombre, apellido, dni, telefono, edad");
            personaArrayList.add(new Persona(scanner.next(), scanner.next(),
                    scanner.next(), scanner.nextInt(), scanner.nextInt()));




            System.out.println("Si quieres parar pulse 5");
            respuesta = scanner.nextInt();
        }

        String ruta = "src/ejercicios/scannerDatos/resources/usuarios.txt";
        File file = new File(ruta);
        FileWriter fileWriter = null;

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error en permisos");
            }
        }

        try {
            fileWriter = new FileWriter(file, true);
            for (Persona persona : personaArrayList) {
                fileWriter.write(persona.toString());
            }

        } catch (IOException e) {
            System.out.println("Error");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("errorr");
            }
        }

        System.out.println("Procedemos a insertar los datos en el fichero " + file.getName());




    }
}
