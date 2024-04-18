package III.dummyjson_productos.controller;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Tienda {

    private ArrayList<JSONObject> cesta;

    public Tienda() {
        this.cesta = new ArrayList<>();
    }


    public void comprarProducto(JSONObject producto){
        cesta.add(producto);
    }

    public void verCesta(){
        int precioTotal = 0;
        for (JSONObject item : cesta) {
            System.out.println("");
            System.out.println("Nombre: " + item.getString("title"));
            System.out.println("Precio: " + item.getInt("price"));
            precioTotal +=  item.getInt("price");
        }

        System.out.println("\n Precio total: " + precioTotal);

    }



}
