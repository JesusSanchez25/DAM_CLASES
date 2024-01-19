import controler.Restaurante;
import model.Cliente;
import model.Pedido;
import model.Producto;

public class Entrada {
    public static void main(String[] args) {

        //Crea un restaurante con datos metidos a mano (restaurante)
        //o Crea tres clientes con datos metidos a mano (cliente1, cliente2,
        //cliente3)
        //o Crea un pedido por cada uno de los tres clientes con los productos que
        //tú quieras
        //o Añade los pedidos al restaurante
        //o Cobra los pedidos de dos de los clientes (cliente1, cliente2)
        //o Muestra la lista de todos los pedidos del restaurante
        //o Muestra la lista de todos los pedidos que han sido cobrados
        //o Añade un pedido nuevo al restaurante con el cliente que todavía no a
        //pagado su pedido (cliente3)
        //o Añade un pedido nuevo al restaurante con el cliente que ya haya
        //pagado su pedido (cliente2)
        //o Muestra el valor de la caja
        //
        //Consideraciones:
        //- En cada caso que provoque un error se deberá avisar por consola. P.e. al
        //intentar registrar un pedido con un usuario que ya tenga un pedido activo


        Restaurante restaurante1 = new Restaurante("2133421", "Goikos");

        Cliente cliente1 = new Cliente("35234112Z", "Juan");
        Cliente cliente2 = new Cliente("46241341X", "Pedro");
        Cliente cliente3 = new Cliente("34141325A", "Marcos");

        Producto cocacola = new Producto("Coca cola", 2);
        Producto fanta = new Producto("Fanta", 2);
        Producto H_normal = new Producto("Hamburguesa normal", 12);
        Producto H_queso = new Producto("Hamburguesa con queso", 12);
        Producto H_smash = new Producto("Smash burguer", 12);
        Producto H_alcorcon = new Producto("El alcorconazo", 12);
        Producto helado = new Producto("helado", 2);


        Pedido pedido1 = new Pedido(cliente1);
        Pedido pedido2 = new Pedido(cliente2);
        Pedido pedido3 = new Pedido(cliente3);



        pedido1.agregarProducto(cocacola);
        pedido1.agregarProducto(H_alcorcon);
        pedido1.agregarProducto(helado);

        pedido2.agregarProducto(fanta);
        pedido2.agregarProducto(H_normal);
        pedido2.agregarProducto(helado);

        pedido3.agregarProducto(cocacola);
        pedido3.agregarProducto(H_queso);
        pedido3.agregarProducto(helado);

        restaurante1.agregarPedido(pedido1);
        restaurante1.agregarPedido(pedido2);
        restaurante1.agregarPedido(pedido3);
        System.out.println();

        restaurante1.cobrarPedido(cliente1.getdni());
        System.out.println();
        restaurante1.cobrarPedido(cliente2.getdni());
        System.out.println();

        restaurante1.mostrarPedidos();
        System.out.println();
        restaurante1.mostrarPedidosCobrados();

        restaurante1.agregarPedido(pedido3);
        restaurante1.agregarPedido(pedido2);

        System.out.println("Valor en caja: " + restaurante1.getCaja());

    }
}