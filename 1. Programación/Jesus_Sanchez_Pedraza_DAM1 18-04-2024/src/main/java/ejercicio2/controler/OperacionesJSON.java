package ejercicio2.controler;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

//Este es el enunciado del segundo ejercicio. Se trata de que puedas leer el json
//que te adjunto: https://api.spacexdata.com/v3/launches
//De este json quiero que generes un fichero llamado lanzamientos.txt que
//permita guardar los nombres de los cohetes (rocket_name) de aquellos
//lanzamientos del año 2010 (launch_year) en adelante y que no hayan tenido
//éxito (launch_success)
//Muy importante, tienes que comentar en classroom como comentario privado el
//número de cohetes que has obtenido como resultado
public class OperacionesJSON {
    File file;
    URL url;

    public OperacionesJSON(File file, URL url) {
        this.file = file;
        this.url = url;
    }

    public JSONArray leerJSON(){

        BufferedReader bufferedReader = null;

        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder texto = new StringBuilder();
            String linea;

            while ((linea = bufferedReader.readLine()) != null){
                texto.append(linea);
            }
            JSONArray jsonArray = new JSONArray(texto.toString());
            return jsonArray;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO exception");
        }
        return null;
    }

    public String seleccionMisiones(JSONArray misiones){
        StringBuilder textoTotal = new StringBuilder();
        for (int i = 0; i < misiones.length(); i++) {
            JSONObject mision = misiones.getJSONObject(i);
            String misionTexto = "";
            if (mision.getInt("launch_year") > 2010  && mision.get("launch_success").toString().equals("false")){
                    textoTotal.append("Nombre: " + mision.getJSONObject("rocket").getString("rocket_name") + "\n");
                    textoTotal.append("Año: " + mision.getInt("launch_year") + "\n");
                    textoTotal.append("Éxito: " + mision.get("launch_success").toString() + "\n");

                    textoTotal.append("\n");


            }
        }
        System.out.println(textoTotal);
        return textoTotal.toString();
    }

    public void escribirMisiones(String misiones){
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));

            bufferedWriter.write(misiones);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO exception");
        } finally {
            try {
                if (bufferedWriter != null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                System.out.println("Error cerrado");
            }

        }
    }

}
