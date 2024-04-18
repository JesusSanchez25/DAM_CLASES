package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Entrada {

    public static void main(String[] args) {

        File file = new File("src/main/java/ejercicio1/resources/texto.txt");
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int letra;
            String texto = "";
            while ((letra = fileReader.read()) != -1){
                texto += (char)(letra/2);
            }
            System.out.println(texto);

        } catch (FileNotFoundException e) {
            System.out.println("Error, File not found");
        } catch (IOException e) {
            System.out.println("IO exception");
        } finally {
            try {
                if (fileReader != null){
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println("Error cerrado");
            }

        }

    }
}
