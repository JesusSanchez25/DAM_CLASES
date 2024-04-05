package buscarURL_Menu.controller;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import static java.lang.System.in;

public class OperacionesJSON {

    public JSONObject lecturaAPI(String urlString) {

        BufferedReader bufferedReader = null;
        StringBuilder texto;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            texto = new StringBuilder();
            String linea = "";
            System.out.println(connection.getURL());


            while ((linea = bufferedReader.readLine()) != null) {
                texto.append(linea);
            }


        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // IMPORTANTE PASAR EL STRINGBUILDER A STRING
        return new JSONObject(texto.toString());
    }

    public void mostrarTodasLigas(JSONObject json){

        JSONArray ligas = json.getJSONArray("leagues");

        for (int i = 0; i < ligas.length(); i++) {
            System.out.println(ligas.getJSONObject(i).getString("strLeague"));
        }


    }

    public void mostrarTodasLigas(JSONObject json){

        JSONArray ligas = json.getJSONArray("teams");

        for (int i = 0; i < ligas.length(); i++) {
            System.out.println(ligas.getJSONObject(i).getString("strLeague"));
        }


    }


    // https://dummyjson.com/products


}
