package ejercicioCompras.controler;

import ejercicioCompras.model.Producto;

public class TiendaController {
    ProductosCrudRepository productosCrudRepository;
    UsuariosCrusRepository usuariosCrusRepository;

    public TiendaController() {
        this.productosCrudRepository = new ProductosCrudRepository();
        this.usuariosCrusRepository = new UsuariosCrusRepository();
    }

    public void insertarProducto(Producto producto){
        productosCrudRepository.insertarProducto(producto);
    }

    public void leerApiProductos(){}

    public void insertarProductosIniciales(){
        productosCrudRepository.insertarProductosApi("https://dummyjson.com/products");
    }

}
