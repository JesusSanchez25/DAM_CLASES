package controler;

import model.Cliente;
import model.Pedido;

import java.util.ArrayList;

public class Restaurante {
    private int caja;
    private String nif,nombre;
    private ArrayList<Pedido> pedidos;

    public Restaurante(){

    }

    public Restaurante(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();

    }

    public void agregarPedido(Pedido pedido){
        for (Pedido item : pedidos) {
            if (pedido.getCliente().getdni().equals(item.getCliente().getdni()) && !pedido.getEstado()){
                System.out.println("Error, ese dni ya tiene un pedido asignado por pagar");
                return;
            }
        }
        System.out.println("Pedido agregado.");
        pedidos.add(pedido);


    }

    public void cobrarPedido(String cliente){
        for (Pedido item : pedidos) {
            if (item.getCliente().getdni().equals(cliente)){
                caja += item.getCuenta();
                item.setEstado(true);

                System.out.println("Pedido cobrado con éxito");
                System.out.println("Factura:");
                System.out.println("Nombre del restaurante: " + nombre);
                System.out.println("NIF del restaurante: " + nif);
                item.listarProductos();
                System.out.println("\n Precio total: " + item.getCuenta()+"€");


                return;
            }
        }
        System.out.println("No se ha encontrado el pedido, DNI INCORRECTO");


    }

    public void mostrarPedidos(){
        System.out.println("Todos los pedidos: ");
        for (Pedido item : pedidos) {
            item.mostrarDatos();
            System.out.println();
        }


    }
    public void mostrarPedidosCobrados(){
        System.out.println("Pedidos cobrados: ");

       for (Pedido item : pedidos) {
           if (item.getEstado()){
               item.mostrarDatos();
               System.out.println();

           }
       }
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
