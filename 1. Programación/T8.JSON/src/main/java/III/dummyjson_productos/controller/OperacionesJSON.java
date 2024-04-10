package III.dummyjson_productos.controller;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

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

    public void mostrarTodosProductos(JSONObject json){

        JSONArray productos = json.getJSONArray("products");

        for (int i = 0; i < productos.length(); i++) {
            System.out.println(productos.getJSONObject(i).getString("title"));
        }


    }

    public void mostrarProductosCategoria(JSONObject json){

        JSONArray productos = json.getJSONArray("products");
        String seccion = "";

        for (int i = 0; i < productos.length(); i++) {
            if (!productos.getJSONObject(i).getString("category").equals(seccion)){
                System.out.println("\n\nSECCIÓN DE " + seccion.toUpperCase());
                seccion = productos.getJSONObject(i).getString("category");
            }
            System.out.println(productos.getJSONObject(i).getString("title"));
        }


    }

    public JSONObject buscarProducto(JSONObject json, String nombre){

        JSONArray productos = json.getJSONArray("products");
        String seccion = "";

        for (int i = 0; i < productos.length(); i++) {
            if (productos.getJSONObject(i).getString("title").equals(nombre)){
                return productos.getJSONObject(i);
            }
        }
        return null;

    }







    // https://dummyjson.com/products


}
