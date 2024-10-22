package lecturaFichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OperacionesFicheros {


    public void lecturaFichero(String ruta){

        File file = new File(ruta);
        FileReader fileReader = null;


        try {
            fileReader = new FileReader(file);
            int lectura = 0;
            while ((lectura = fileReader.read()) != -1){
                System.out.print(" ");
                System.out.print(Integer.valueOf((char)lectura));
            }

        } catch (FileNotFoundException e) {
            System.out.println("El fichero que intentas leer no existeeeee");
        } catch (IOException e) {
            System.out.printf("No hay permisos de lectura");
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
