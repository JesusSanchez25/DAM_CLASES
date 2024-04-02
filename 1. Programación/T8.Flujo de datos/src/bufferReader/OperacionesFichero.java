package bufferReader;

import java.io.*;

public class OperacionesFichero {

    public void lecturaBuffer(String path){

        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String linea  = null;

            while ((linea = bufferedReader.readLine()) != null){
            System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.printf("No se encontró el fichero");
        } catch (IOException e) {
            System.out.println("No se pudo leer el fichero (no tiene permisos de lectura)");
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
                fileReader.close(); // SI EL BUFFER NO ES NULO EL FILE READER TAMPOCO LO SERIA
            } catch (IOException e) {
                System.out.println("Error");
            }
        }

    }
}
