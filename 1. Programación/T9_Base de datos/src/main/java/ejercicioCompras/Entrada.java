package ejercicioCompras;

import ejercicioCompras.controler.TiendaController;
import ejercicioCompras.model.Producto;
import lombok.AllArgsConstructor;

public class Entrada {
    public static void main(String[] args) {

        TiendaController tiendaController = new TiendaController();

        tiendaController.insertarProductosIniciales();



    }
}
