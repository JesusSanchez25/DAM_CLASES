package ejercicios.ascciATexto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class OperacionesFichero {

    public OperacionesFichero() {
    }

    public void traductir(String path){

        File file = new File(path);
        FileReader fileReader = null;
        String texto = "";
        int letra = 0;

        try {
            fileReader = new FileReader(file);
            while ((letra = fileReader.read()) != -1){
                texto += (char)letra;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error");
        } catch (IOException e) {
            System.out.println("IO exception");
        }


        for (String item : texto.split(" ")) {
            int numero = Integer.valueOf(item);
            System.out.print((char) numero);


        }


    }
}
