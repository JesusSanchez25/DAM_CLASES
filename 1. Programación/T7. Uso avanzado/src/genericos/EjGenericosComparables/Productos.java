package genericos.EjGenericosComparables;

public class Productos /*No extiende*/{

    //Crea una clase llamada Producto con nombre, precio y tipo.
    // Dicha clase tendrá constructor, getter, setter y mostrar datos

    private String nombre, tipo;
    private int precio;


    public Productos() {
    }

    public Productos(String nombre, String tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public void mostrarDatos(){
        System.out.println("nombre: " + nombre);
        System.out.println("tipo: " + tipo);
        System.out.println("precio: " + precio);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
