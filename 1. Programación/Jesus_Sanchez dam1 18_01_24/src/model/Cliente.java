package model;

public class Cliente {
    private String dni, nombre;
    private Pedido pedido;
    public Cliente() {
    }

    public Cliente(String nombre, String dni) {
        this.dni = dni;
        this.nombre = nombre;
    }



    public void agregarPedido(Pedido pedido){
        if (this.pedido.getEstado()){
            System.out.println("Pedido agregado");
            this.pedido = pedido;
        } else {
            System.out.println("ERROR, El cliente ya tiene un pedido asignado");
        }
    }

    public void eliminarPedido(){
        this.pedido = null;

    }





    public String getdni() {
        return dni;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public String getNombre() {
        return nombre;
    }

}
