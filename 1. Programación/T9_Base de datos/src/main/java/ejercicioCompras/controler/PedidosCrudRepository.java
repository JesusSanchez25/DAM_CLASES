package ejercicioCompras.controler;

import com.google.gson.Gson;
import ejercicioCompras.database.DBconnection;
import ejercicioCompras.database.EsquemaCompras;
import ejercicioCompras.model.Pedido;
import ejercicioCompras.model.Producto;

import java.sql.*;
import java.util.ArrayList;

public class PedidosCrudRepository {

    // Esta conexión simplemente te permite ejecutar sql
    private Connection connection;
    PreparedStatement ps;
    ProductosCrudRepository productosCrudRepository;
    Statement statement;
    ResultSet resultSet;
    Gson gson;


    public Pedido sacarPedido(int idCliente, int idProducto){
        connection = DBconnection.getConnection();

        String query = String.format("Select * from %s where %s = ? and %s = ?",
                EsquemaCompras.TAB_PEDIDOS, EsquemaCompras.COL_IDCLIENTE, EsquemaCompras.COL_IDPRODUCTO);

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, idCliente);
            ps.setInt(2, idProducto);
            resultSet = ps.executeQuery();

            while (resultSet.next()){
                Pedido pedido = new Pedido(
                        resultSet.getInt(EsquemaCompras.COL_IDCLIENTE),
                        resultSet.getInt(EsquemaCompras.COL_IDPRODUCTO),
                        resultSet.getInt(EsquemaCompras.COL_CANTIDAD)
                );

                return pedido;
            }
        } catch (SQLException e) {
            System.out.println("Error en query");
        } finally {
            DBconnection.closeConnection();
            connection = null;

        }

        return null;
    }


    public void aumentarCantidad(int idCliente, int idProducto, int cantidadAumentada){
        int cantidadAntigua = sacarPedido(idCliente, idProducto).getCantidad();

        // Tengo que sacar el pedido antes porque si lo saco en medio del ps
        // se me cierra la conexión al terminar el sacarPedido()
        connection = DBconnection.getConnection();

        String query = String.format("UPDATE %s SET %s = ? WHERE (%s = ?) and (%s = ?)",
                EsquemaCompras.TAB_PEDIDOS,
                EsquemaCompras.COL_CANTIDAD, EsquemaCompras.COL_IDCLIENTE, EsquemaCompras.COL_IDPRODUCTO);

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, (cantidadAntigua + cantidadAumentada));
            ps.setInt(2, idCliente);
            ps.setInt(3, idProducto);

            ps.execute();
        } catch (SQLException e) {
            System.out.println("Query error");
        }
    }


    public void agregarPedido(int idCliente, int idProducto, int cantidad){

        connection = DBconnection.getConnection();

        String query = String.format("Insert into %s (%s, %s, %s) values (?,?,?)",
                EsquemaCompras.TAB_PEDIDOS,
                EsquemaCompras.COL_IDCLIENTE, EsquemaCompras.COL_IDPRODUCTO, EsquemaCompras.COL_CANTIDAD);

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, idCliente);
            ps.setInt(2, idProducto);
            ps.setInt(3, cantidad);

            ps.execute();
        } catch (SQLException e) {
                System.out.println("Ese producto no existe \n");
            }
        }


        public void verCarrito(int idCliente){
            connection = DBconnection.getConnection();
            productosCrudRepository = new ProductosCrudRepository();

            String query = String.format("Select * from %s where %s = ?",
                    EsquemaCompras.TAB_PEDIDOS, EsquemaCompras.COL_IDCLIENTE);

            try {
                ps = connection.prepareStatement(query);
                ps.setInt(1, idCliente);
                resultSet = ps.executeQuery();

                while (resultSet.next()){
                    Pedido pedido = new Pedido(
                            resultSet.getInt(EsquemaCompras.COL_IDCLIENTE),
                            resultSet.getInt(EsquemaCompras.COL_IDPRODUCTO),
                            resultSet.getInt(EsquemaCompras.COL_CANTIDAD)
                    );

                    System.out.println(productosCrudRepository.sacarProducto(pedido.getIdProducto()));
                    System.out.println("\tCantidad: " + pedido.getCantidad());
                }
            } catch (SQLException e) {
                System.out.println("Error en query");
            } finally {
                DBconnection.closeConnection();
                connection = null;

            }

        }

        public ArrayList<Pedido> sacarTodosPedidos(int idCliente){
            connection = DBconnection.getConnection();
            ArrayList<Pedido> pedidos = new ArrayList<>();

            String query = String.format("Select * from %s where %s = ? ",
                    EsquemaCompras.TAB_PEDIDOS, EsquemaCompras.COL_IDCLIENTE);

            try {
                ps = connection.prepareStatement(query);
                ps.setInt(1, idCliente);
                resultSet = ps.executeQuery();

                while (resultSet.next()){
                    Pedido pedido = new Pedido(
                            resultSet.getInt(EsquemaCompras.COL_IDCLIENTE),
                            resultSet.getInt(EsquemaCompras.COL_IDPRODUCTO),
                            resultSet.getInt(EsquemaCompras.COL_CANTIDAD)
                    );

                    pedidos.add(pedido);
                }
            } catch (SQLException e) {
                System.out.println("Error en query");
            } finally {
                DBconnection.closeConnection();
                connection = null;

            }

            return pedidos;
        }

        public void vaciarCarrito(int idCliente){
            connection = DBconnection.getConnection();

            String query = String.format("Delete from %s where %s = ? ",
                    EsquemaCompras.TAB_PEDIDOS, EsquemaCompras.COL_IDCLIENTE);

            try {
                ps = connection.prepareStatement(query);
                ps.setInt(1, idCliente);
                ps.execute();

            } catch (SQLException e) {
                System.out.println("Error en query");
            } finally {
                DBconnection.closeConnection();
                connection = null;

            }

        }

        public void finalizarCompra(int idUsuario){
        productosCrudRepository = new ProductosCrudRepository();
        int precioFinal = 0;

        for (Pedido item : sacarTodosPedidos(idUsuario)) {
            Producto producto = productosCrudRepository.sacarProducto(item.getIdProducto());
            precioFinal += (int) (item.getCantidad() * producto.getPrice());
        }

            System.out.println("Procediendo con el pago de: " + precioFinal + "€");
            vaciarCarrito(idUsuario);

        }






}
