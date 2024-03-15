package controler;

import java.io.File;
import java.io.IOException;

public class OperacionesFicheros {
    File file = new File("C:\\Users\\Usuario DAM1\\Documents\\DAM\\1. Programación\\T8.Flujo de datos\\Ficheros\\fichero2.1.txt");

    //tamaño
    // modificacion, creacion, propietario, permisos, extensión
    // ruta, nombre, directiorio()
    // leer


    public OperacionesFicheros() {
    }



    public void lecturaInformacion(String fichero){

        File file = new File(fichero);
        System.out.println("Nombre: " + file.getName());
        System.out.println("Ruta: " + file.getPath());
        System.out.println("Escribir?: " + file.canWrite());
        System.out.println("Leer?: " + file.canWrite());
        System.out.println("Directorio: " + file.isDirectory());
        System.out.println("Existe: " + file.exists());

        if (!file.exists()) {
            try {
                file.createNewFile();
                lecturaInformacion(fichero);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("terminando informacion del fichero");


    }

    public void lecturaDirectorio(String directorio) throws Exception{
        File file = new File(directorio);

        //FILE.LIST da el String[] con todos los nombres dentro del directorio.
        //FILE.LISTFILES da el File[] con todos los archivos.

        if (file.isDirectory()){
            for (File archivo : file.listFiles()) {
                System.out.println("Nombre: " + archivo.getName());
                if (archivo.isDirectory()){
                    lecturaDirectorio(archivo.getAbsolutePath());
                }

            }
        }

    }

}
