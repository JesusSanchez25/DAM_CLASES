package III.dummyjson_productos;

import III.dummyjson_productos.controller.OperacionesJSON;
import III.dummyjson_productos.controller.Tienda;
import org.json.JSONObject;

import java.util.Scanner;

import static java.lang.System.in;

public class Entrada {
    public static void main(String[] args) {

        //1. VER PRODUCTOS -+ ID, NOMBRE, PRECIO
        //2. VER PRODUCTO POR CATEGORIA ->SE MUESTRAN LAS CATEGORÍAS, SELECCIONO UNA Y SE MUESTRAN LOS PRODUCTOS CORRESPONDIENTES
        //3. COMPRAR PRODUCTO —i UN ID Y AÑADE EL PRODUCTO CORRESPONDIENTE AL CARRITO
        //4. VER CARRITO -+ VER TODOS LOS PRODUCTOS DEL CARRITO
        //5. VACIAR CARRITO -+ ELIMINAR TODOS LOS PRODUCTOS, SIN BORRAR
        //6. FINALIZAR COMPRA -+ "VAS A COMPRAR x PRODUCTOS POR UN VALOR DE x€

        //+ EXCEPCIONES
        //+ MENÚ

        //https://dummyjson.com/docs/products

        OperacionesJSON operacionesJSON = new OperacionesJSON();
        Tienda tienda = new Tienda();
        Scanner scanner = new Scanner(in);
        String url = "https://dummyjson.com/products";
        JSONObject json = operacionesJSON.lecturaAPI(url);

        System.out.println("Inserte el número de la opción que desea realizar");
        System.out.println("1. VER PRODUCTOS");
        System.out.println("2. VER PRODUCTO POR CATEGORIA");
        System.out.println("3. COMPRAR PRODUCTO");
        System.out.println("4. VER CARRITO");
        System.out.println("5. VACIAR CARRITO");
        System.out.println("6. FINALIZAR COMPRA");

        operacionesJSON.mostrarProductosCategoria(operacionesJSON.lecturaAPI(url));

        System.out.println("Selecciona el producto al que comprar");
        String producto = scanner.nextLine();
        tienda.comprarProducto(operacionesJSON.buscarProducto(json, producto));

        System.out.println("Selecciona el producto al que comprar");
        String producto2 = scanner.nextLine();
        tienda.comprarProducto(operacionesJSON.buscarProducto(json, producto2));

        tienda.verCesta();


    }
}
