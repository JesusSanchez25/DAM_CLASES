package ejercicioCompras.database;

public interface EsquemaCompras {

    String PORT = "3306";
    String HOST = "127.0.0.1:" + PORT;
    String DB_NAME = "programacioncompras";
    String TAB_PRODUCTOS = "products";
    String TAB_PEDIDOS = "orders";
    String TAB_CLIENTES = "clients";
    String COL_ID = "id";
    String COL_NOMBRE = "name";
    String COL_EMAIL = "email";
    String COL_PASSWORD= "password";
    String COL_IDPRODUCTO = "id_p";
    String COL_IDCLIENTE = "id_c";
    String COL_CANTIDAD = "amount";
    String COL_NOMBREPRODUCTO = "tittle";
    String COL_DESCRIPCION = "description";
    String COL_PRECIO = "price";
    String COL_DESCUENTO = "discountPercentage";
    String COL_RATING = "rating";
    String COL_STOCK = "stock";
    String COL_SALARIO = "salario";
    String COL_DIRECCION = "direccion";
    String COL_MARCA = "brand";
    String COL_CATEGORIA = "category";
    String COL_MINIATURA = "thumbnail";
    String COL_IMAGENES = "images";



}
