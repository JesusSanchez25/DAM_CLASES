package TODO_CASA;

import java.io.*;

public class OperacionesFicheros {

    private File file;

    public OperacionesFicheros(String ruta) {
        this.file = new File(ruta);
    }

    public void borrarInformacion(){
        // Si no creas el fileWriter null no vas a poder CERRARLO
        // y por lo tanto no se va a GUARDAR

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("Camion");
        } catch (IOException e) {
            System.out.println("Error en el archivo");
        } finally {
            try {
                if (fileWriter !=null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("Exception");
            }
        }
    }

    public void escribirInformacion(String texto){
        FileWriter fileWriter = null;

        try {
            if (!file.exists()){
                System.out.println("El archivo que has intentado acceder no existe así que lo vamos a crear por ti guapo");
            }
            fileWriter = new FileWriter(file, true);
            fileWriter.write(texto);
        } catch (IOException e) {
            System.out.println("No se ha encontrado el fichero");
        } finally {
            try {
                if (fileWriter !=null) {
                    fileWriter.close();

                }
            } catch (IOException e) {
                System.out.println("Exception");
            }
        }

    }

    public String leerInformacion(){
        String texto = "";

        FileReader fileReader = null;

        try {
            // Dato curioso, si pasamos el -1 a CHAR y luego de nuevo a INT
            // se raya mazo y no nos saca de vuelta el -1, sino uqe aparece un
            // 65535

            fileReader = new FileReader(file);
            int letra;
            while(((letra = fileReader.read())) != -1){
                texto += (char)letra;
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se ha podido encontrar el archivo");
        } catch (IOException e) {
            System.out.println("No se ha podido leer el archivo");
        }


        return texto;
    }

    public void contarInformacion(String texto){
        int letras= 0, palabras= 0, oraciones = 0;

        FileReader fileReader = null;

        Character hola = 'a';

        try {
            fileReader = new FileReader(file);
            int letra;
            while(((letra = fileReader.read())) != -1){
                // CONTAR LETRAS
                if ((letra >= 65 && letra <= 90) || letra >= 97 && letra<= 122){
                    letras++;
                }

                // CONTAR PALABRAS
                if (letra == 32 || letra ==-1){
                    palabras++;
                }

                // CONTAR FRASES
                if (letra == 46){
                    oraciones++;
                }

                texto += (char)letra;
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se ha podido encontrar el archivo");
        } catch (IOException e) {
            System.out.println("No se ha podido leer el archivo");
        }

        System.out.println("La cantidad de letras es: " + letras);
        System.out.println("La cantidad de palabras es: " + palabras);
        System.out.println("La cantidad de oraciones es: " + oraciones);


    }

    public String traducirTextoASCII(String texto){
        String textoASCII = "";
        for (char item : texto.toCharArray()) {
            textoASCII += (int)(item) +" ";
        }

        return textoASCII;
    }

    public String traducirASCIITexto(String texto){
        String textoASCII = "";
        for (String item : texto.split(" ")) {
            textoASCII += (char)(Integer.parseInt(item));
        }

        return textoASCII;
    }

    public String cifrarInformacion(String texto, int cifrado){
        String textoASCII = "";
        for (char item : texto.toCharArray()) {
            textoASCII += ((int)(item)+cifrado) +" ";
        }

        return textoASCII;
    }

    public String descifrarInformacion(String texto, int clave){
        String textoASCII = "";
        for (String item : texto.split(" ")) {
            textoASCII += (char)((Integer.parseInt(item)-clave));
        }

        return textoASCII;
    }


}
