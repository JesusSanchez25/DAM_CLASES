package model;

public class Producto {
    private String nombre;
    private int precio;

    public Producto() {
    }

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDatos(){
        System.out.println("\tNombre:" + nombre);
        System.out.println("\tPrecio:" + precio);


    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
}
