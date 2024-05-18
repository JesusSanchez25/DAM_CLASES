package ejercicioCompras.model;

import ejercicioCompras.controler.ProductosCrudRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Pedido {
    private int idCliente, idProducto, cantidad;
    ProductosCrudRepository productosCrudRepository;

    public Pedido(int idCliente, int idProducto, int cantidad) {
        this.idCliente = idCliente;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }


}
