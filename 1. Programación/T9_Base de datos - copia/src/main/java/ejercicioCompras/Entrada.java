package ejercicioCompras;

import ejercicioCompras.controler.TiendaController;
import ejercicioCompras.model.Producto;
import ejercicioCompras.model.Usuario;
import lombok.AllArgsConstructor;

import java.util.Scanner;

import static java.lang.System.in;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        TiendaController tiendaController = new TiendaController();

        int idUsuario = -1;

        tiendaController.insertarProductosIniciales();
        int respuesta =-1;


        while (true){

            while (idUsuario == -1){
                System.out.println("1. Iniciar sesión");
                System.out.println("2. Registrarse");
                int respuesta2 = scanner.nextInt();


                switch (respuesta2){
                    case 1:
                        System.out.println("Procedemos con el inicio de sesión");
                        idUsuario = tiendaController.iniciarSesion();
                        break;

                    case 2:
                        System.out.println("Procedemos con el registro de sesión");
                        idUsuario = tiendaController.re();
                        break;

                    default:
                        System.out.println("Elija una opción válida");
                        break;
                }

            }

            while (respuesta != 4){
                System.out.println("1. Ver productos");
                System.out.println("2. Comprar producto");
                System.out.println("3. Ver carrito");
                System.out.println("4. Finalizar compra");
                respuesta = scanner.nextInt();

                switch (respuesta){
                    case 1:
                        tiendaController.mostrarTodosProductos();
                        break;
                    case 2:
                        tiendaController.comprarProducto(idUsuario);
                        break;

                    case 3:
                        tiendaController.verCarrito(idUsuario);
                        break;

                    case 4:
                        tiendaController.finalizarCompra(idUsuario);
                        idUsuario = -1;
                        System.out.println("Saliendo");
                        break;

                    default:
                        System.out.println("Elige una opción válida");
                        break;
                }
            }

        }












    }
}
