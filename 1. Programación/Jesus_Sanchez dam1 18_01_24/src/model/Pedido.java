package model;

import java.util.ArrayList;

public class Pedido {
    private boolean estado;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private int cuenta;

    public Pedido(){
    }
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto (Producto producto){

        this.productos.add(producto);
        cuenta += producto.getPrecio();
    }

    public void mostrarDatos(){
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Estado: " + estado);
        System.out.println("Precio: " + cuenta);

    }

    public void eliminarProducto (Producto producto){

        this.productos.add(producto);
        cuenta -= producto.getPrecio();
    }

    public void listarProductos(){
        System.out.println("Productos:");
        for (Producto item : productos) {

            item.mostrarDatos();
        }

    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
}

