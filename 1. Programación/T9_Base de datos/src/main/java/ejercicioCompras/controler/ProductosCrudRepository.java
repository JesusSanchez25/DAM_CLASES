package ejercicioCompras.controler;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import ejercicioCompras.database.DBconnection;
import ejercicioCompras.database.EsquemaCompras;
import ejercicioCompras.model.Producto;
import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductosCrudRepository {

    // Esta conexión simplemente te permite ejecutar sql
    private Connection connection;
    PreparedStatement ps;
    ResultSet resultSet;
    Gson gson;

    public ProductosCrudRepository() {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        gson = builder.create();
    }

    public void insertarProducto(Producto producto){

        // Abro conexión
        connection = DBconnection.getConnection();

        // Trabajo conexión
        String query = String.format("INSERT INTO %s (%s,%s,%s,%s,%s,%s,%s,%s) VALUES (?,?,?,?,?,?,?,?)",
                EsquemaCompras.TAB_PRODUCTOS,
                EsquemaCompras.COL_ID, EsquemaCompras.COL_NOMBREPRODUCTO, EsquemaCompras.COL_DESCRIPCION, EsquemaCompras.COL_PRECIO,
                EsquemaCompras.COL_RATING, EsquemaCompras.COL_STOCK, EsquemaCompras.COL_MARCA, EsquemaCompras.COL_CATEGORIA
        );
        try {
            ps = connection.prepareStatement(query);
            ps.setFloat(1,producto.getId());
            ps.setString(2,producto.getTitle());
            ps.setString(3,producto.getDescription());
            ps.setFloat(4,producto.getPrice());
            ps.setDouble(5,producto.getRating());
            ps.setInt(6,0);
            ps.setString(7,producto.getBrand());
            ps.setString(8,producto.getCategory());

            ps.execute();
            System.out.println("mek");
        } catch (SQLException e) {
            System.out.println("Error en la query");
            System.out.println(e.getCause());
        } finally {
            try {
                if (ps != null){
                    ps.close();
                }
            } catch (SQLException e) {
                System.out.println("Error en cerrado");
            }}

        // Cierro conexión
        DBconnection.closeConnection();
        connection = null;

    }



    public JSONObject leerApi(String urlString){

        BufferedReader bufferedReader = null;
        StringBuilder texto = new StringBuilder();


        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String linea = "";

            while ((linea = bufferedReader.readLine()) != null){
                texto.append(linea);
            }



        } catch (IOException e) {
            System.out.println("ERROR EN IO");
        }


        return new JSONObject(texto.toString());

    }

    public void insertarProductosApi(String api){
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();

        JSONArray jsonArray = leerApi(api).getJSONArray("products");

        for (int i = 0; i < jsonArray.length(); i++) {
            Producto producto = gson.fromJson(jsonArray.getJSONObject(i).toString(), Producto.class);
            insertarProducto(producto);
            System.out.println(producto.toString());
        }


    }


}
