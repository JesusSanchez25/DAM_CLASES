package json;

import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class Operaciones {
    public static void main(String[] args) {

        File file = new File("src/json/asignaturas.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        StringBuilder texto = new StringBuilder();




        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String linea = null;
            while ((linea = bufferedReader.readLine()) != null){
                texto.append("\n" + linea);
            }

            JSONArray arrayAsignaturas = new JSONArray(texto.toString());



            for (int i = 0; i < arrayAsignaturas.length(); i++) {
                /*JSONObject asignatura = arrayAsignaturas.getJSONObject(i);
                String nombre = asignatura.getString("nombre");
                String profesor = asignatura.getString("profesor");
                int horas = asignatura.getInt("horas");
                JSONArray conocimientos = asignatura.getJSONArray("conocimientos");

                System.out.println("Nombre: " + nombre);
                System.out.println("Profesor: " + profesor);
                System.out.println("Horas: " + horas);
                System.out.println("Conocimientos: " + conocimientos.join(","));
                System.out.println("\n");*/

                JSONObject asignaturaJSOn = arrayAsignaturas.getJSONObject(i);
                Asignatura asignatura = new Gson().fromJson(asignaturaJSOn.toString());
            }







        } catch (FileNotFoundException e) {
            System.out.println("Error");
        } catch (IOException e) {
            System.out.println("IO exception");
        } finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("");
                }
            }
        }


    }
}
