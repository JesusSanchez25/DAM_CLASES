package SimulacroExamen;

import java.util.ArrayList;

public class Metodos {
    //Desarrolla una aplicación que ges1ona los pedidos de una pizzería. Para ello la
    //aplicación constará de un menú mediante el cual se podrán realizar pedidos, servirlos y
    //cobrarlos. El menú será el siguiente:
    //1. Realizar pedido
    //El sistema pedirá los siguientes datos:
    //- Nombre de usuario
    //- Teléfono de usuario
    //- Can1dad de ingredientes que quiere añadir. Una vez introducida una can1dad
    //(la cual tendrá que ser mayor que uno) se mostrará una lista de ingredientes, de
    //los cuales el usuario tendrá que seleccionar el número indicado (un ingrediente
    //consta de nombre y precio)
    //- Una vez introducido esto, se agregará el pedido a la lista de pedidos pendientes
    //el cual constará de los siguientes elementos: id, nombre, teléfono, conjunto de
    //ingredientes, precio y estado
    //2. Servir pedido
    //El sistema pedirá el id del pedido que se quiere servir realizará las siguientes accione:
    //- En el caso de estar el pedido modificará su atributo estado y realizará el cobro
    //del pedido
    //- En el caso de no estar se muestra un aviso
    //3. Mostrar pedidos pendientes
    //Se mostrará la lista de pedidos que aún no han sido servidos. La información que se
    //mostrará es: Nombre usuario, teléfono y nombre de cada uno de los ingredientes
    //4. Mostrar caja
    //Se mostrará el total de pizzas cobradas hasta el momento
    //• El id del pedido no es un dato que asigne el usuario, deberá asignarlo el sistema
    //y será único

    ArrayList<Object[]> pedidosPendientes = new ArrayList<>();
    double caja = 0;

    public void añadirPedido(Object[] pedido){
        pedidosPendientes.add(pedido);

    }
    public void ServirPedido(int id){
        for (Object[] item : pedidosPendientes) {
            if ((int)item[0]==id){
                item[5] = true;
                System.out.println("El pedido ha sido servido");
                caja+=(double)item[4];
                pedidosPendientes.remove(item);
                break;
            }
            System.out.println("No se ha encontrado pedido ");
        }




    }
    public void MostrarPedidosPendientes(){
        for (Object[] item : pedidosPendientes) {
            System.out.printf("Id: "+item[0]+", ");
            System.out.printf("Nombre: "+item[1]+", ");
            System.out.printf("Telefono: "+item[2]+", ");
            System.out.printf("Ingredientes: "+item[3]+", ");
            System.out.printf("Precio: "+item[4]+", ");
            System.out.printf("Estado: "+item[5]+", ");
            System.out.println("");
        }

    }
    public double MostrarCaja(){
        return caja;
    }
}
