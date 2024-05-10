package ejercicioCompras.controler;

import ejercicioCompras.model.Producto;
import ejercicioCompras.model.Usuario;

public class TiendaController {
    ProductosCrudRepository productosCrudRepository;
    UsuariosCrudRepository usuariosCrusRepository;

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
        } else{
            System.out.println("Ya hay productos en la base");
        }

    }

    public void mostrarUsuario(String email){
        System.out.println(usuariosCrusRepository.sacarUsuario(email));
    }

    // todo CAMBIAR POR "REGISTRAR USUARIO O LOGIN"

    public void iniciarSesion(){


        // TODO REGISTRAR O LOGIN
    }




}
