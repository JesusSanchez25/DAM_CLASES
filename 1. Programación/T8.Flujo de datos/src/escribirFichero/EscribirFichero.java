package escribirFichero;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

    public void crearArchivo(String path){
        File file  = new File(path);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e){
                System.out.println("No tienes permisos de escritura");
            }
        }
    }

    public void escribirFichero(String path){
        File file = new File(path);
        if(!file.exists()){
            try {
                file.createNewFile();
                System.out.println("El fichero no existía así que se ha creado");
            } catch (IOException e){
                System.out.println("No tienes permisos de escritura");
            }
        }

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file);
            System.out.println("Escribiendo letras raras");
            fileWriter.write("Me comí una salchipapa");
            fileWriter.write(32);
            fileWriter.write(67);

        } catch (IOException e) {
            System.out.println("Error");
        } finally {
            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("No se ha podido cerrar");
            }
        }

    }
}
