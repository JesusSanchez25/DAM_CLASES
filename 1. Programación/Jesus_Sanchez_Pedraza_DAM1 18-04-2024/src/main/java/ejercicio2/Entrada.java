package ejercicio2;

import ejercicio2.controler.OperacionesJSON;
import org.json.JSONArray;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Entrada {

    //Este es el enunciado del segundo ejercicio. Se trata de que puedas leer el json
    //que te adjunto: https://api.spacexdata.com/v3/launches
    //De este json quiero que generes un fichero llamado lanzamientos.txt que
    //permita guardar los nombres de los cohetes (rocket_name) de aquellos
    //lanzamientos del año 2010 (launch_year) en adelante y que no hayan tenido
    //éxito (launch_success)
    //Muy importante, tienes que comentar en classroom como comentario privado el
    //número de cohetes que has obtenido como resultado
    public static void main(String[] args) {

        File file = new File("src/main/java/ejercicio2/resources/lanzamientos.txt");
        URL url = null;
        try {
            url = new URL("https://api.spacexdata.com/v3/launches");
        } catch (MalformedURLException e) {
            System.out.println("Error en la url");
        }

        OperacionesJSON operacionesJSON = new OperacionesJSON(file, url);
        JSONArray misiones =  operacionesJSON.leerJSON();
        String misionesSeleccionadas = operacionesJSON.seleccionMisiones(misiones);
        operacionesJSON.escribirMisiones(misionesSeleccionadas);

    }

}
