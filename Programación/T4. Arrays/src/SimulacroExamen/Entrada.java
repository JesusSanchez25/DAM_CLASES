package SimulacroExamen;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class Entrada {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Scanner scanner = new Scanner(in);
        Object[] pedido;

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



        int idPedido = 0;
        int respuesta;

        do {
            System.out.println("Elige la opción que desees");
            System.out.println("1.Añadir pedido");
            System.out.println("2.Servir Pedido");
            System.out.println("3.Mostrar pedidos pendientes");
            System.out.println("4.Mostrar caja");
            System.out.println("5.Salir");
            respuesta = scanner.nextInt();


            switch (respuesta){
                //- Una vez introducido esto, se agregará el pedido a la lista de pedidos pendientes
                //el cual constará de los siguientes elementos: id, nombre, teléfono, conjunto de
                //ingredientes, precio y estado

                case 1:
                    pedido = new Object[6];


                    //Precio base
                    double precio = 8;
                    ArrayList<String> ingredientes = new ArrayList<>();
                    Object[][] listaIngredientes = new Object[][]{
                            {"Tomate",1.0},{"aceitunas",1.5},{"queso",1.0},{"albahaca",0.5},{"jamon",1.0}
                    };

                    idPedido++;
                    pedido[0] = idPedido;
                    System.out.println("Inserte un nombre");
                    pedido[1] = scanner.next();
                    System.out.println("Inserte un teléfono");
                    pedido[2] = scanner.next();
                    int cantidad;
                    do {
                        System.out.println("Cuantos ingredientes quieres?");
                        cantidad = scanner.nextInt();
                        if (cantidad<1){
                            System.out.println("Pide más de 1 ingrediente");
                        }
                    } while (cantidad<1);



                    for (int i = 0; i < cantidad; i++) {
                        int NumeroIngrediente;
                        do {
                            System.out.println("Elige un ingrediente");
                            System.out.println("1.Tomate");
                            System.out.println("2.Aceitunas");
                            System.out.println("3.Queso");
                            System.out.println("4.Albahaca");
                            System.out.println("5.Jamón");
                            NumeroIngrediente = scanner.nextInt();
                            if (listaIngredientes[NumeroIngrediente-1][0]==null){
                                System.out.println("Inserte un número válido");
                            }
                        } while (NumeroIngrediente < listaIngredientes[0].length);

                        ingredientes.add(listaIngredientes[NumeroIngrediente-1][0].toString());
                            precio+=(double)listaIngredientes[NumeroIngrediente-1][1];

                    }
                    pedido[3] = ingredientes;
                    pedido[4]=precio;
                    pedido[5] = false;
                    metodos.añadirPedido(pedido);

                    break;


                case 2:
                    //2. Servir pedido
                    //El sistema pedirá el id del pedido que se quiere servir realizará las siguientes accione:
                    //- En el caso de estar el pedido modificará su atributo estado y realizará el cobro
                    //del pedido
                    //- En el caso de no estar se muestra un aviso
                    System.out.println("Inserte el id del pedido que se queire servir");
                    metodos.ServirPedido(scanner.nextInt());


                    break;



                case 3:
                    metodos.MostrarPedidosPendientes();
                    break;
                case 4:
                    System.out.println("La caja tiene "+metodos.MostrarCaja()+" euros");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Introduce un número válido");
                    break;



            }

        } while (respuesta!=5);






    }
}
