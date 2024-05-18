package ejercicioCompras.controler;

import ejercicioCompras.model.Pedido;
import ejercicioCompras.model.Producto;
import ejercicioCompras.model.Usuario;

import java.util.Scanner;

import static java.lang.System.in;

public class TiendaController {
    ProductosCrudRepository productosCrudRepository;
    UsuariosCrudRepository usuariosCrusRepository;
    PedidosCrudRepository pedidosCrudRepository;

    public TiendaController() {
        this.productosCrudRepository = new ProductosCrudRepository();
        this.usuariosCrusRepository = new UsuariosCrudRepository();
    }

    public void insertarProducto(Producto producto){
        productosCrudRepository.insertarProducto(producto);
    }

    public Producto sacarProducto(int id){
        return productosCrudRepository.sacarProducto(id);
    }

    public void mostrarTodosProductos(){
        for (Producto item :  productosCrudRepository.sacarTodosProductos()) {
            System.out.println(item.toString());
        }
        productosCrudRepository.sacarTodosProductos();
    }

    public void insertarProductosIniciales(){
        if (!productosCrudRepository.hayProductos()){
            productosCrudRepository.insertarProductosApi("https://dummyjson.com/products");
        }
    }

    public void mostrarUsuario(String email){
        System.out.println(usuariosCrusRepository.sacarUsuario(email));
    }



    public int iniciarSesion(){
        return usuariosCrusRepository.iniciarSesion();
    }

    public int registrarse(){
        return usuariosCrusRepository.registrarUsuario();
    }

    public void agregarAlCarrito(int idCliente, int idProducto, int cantidad){
        pedidosCrudRepository = new PedidosCrudRepository();

        // Si el elemento a comprar no está en el carrito del cliente se agrega
        if (pedidosCrudRepository.sacarPedido(idCliente, idProducto) == null){
            pedidosCrudRepository.agregarPedido(idCliente,idProducto,cantidad);
        }

        // Si el pedido del cliente ya está en el carrito, se actualiza
        // la cantidad de este producto en el carrito
        else {
            pedidosCrudRepository.aumentarCantidad(idCliente,idProducto, cantidad);
        }
    }

    public void comprarProducto(int idUsuario){
        Scanner scanner = new Scanner(in);
        try {
            System.out.println("Inserte el id del producto");
            int id = scanner.nextInt();

            System.out.println("Cuantos quieres comprar?");
            int cantidad = scanner.nextInt();

            agregarAlCarrito(idUsuario, id, cantidad);
        } catch (Exception e){
            System.out.println("Inserte un número");
        }
    }

    public void verCarrito(int idUsuario){
        pedidosCrudRepository = new PedidosCrudRepository();
        pedidosCrudRepository.verCarrito(idUsuario);
    }

    public void finalizarCompra(int idUsuario){
        pedidosCrudRepository = new PedidosCrudRepository();
        pedidosCrudRepository.finalizarCompra(idUsuario);
    }




}
