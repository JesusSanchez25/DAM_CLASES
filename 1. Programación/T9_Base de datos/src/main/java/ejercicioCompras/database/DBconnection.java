package ejercicioCompras.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    static Connection connection;

    // plantear un patrón SINGLETONE


    public DBconnection() {
    }

    public static Connection getConnection (){
        //retorna la conexión
        if (connection == null){
            createConnection();
        }
        return connection;
    }
    private static void createConnection (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = String.format("jdbc:mysql://%s/%s", EsquemaCompras.HOST, EsquemaCompras.DB_NAME);
            connection = DriverManager.getConnection(url,"root",                                                                                                                                 "SanchezJesus01*_");
        } catch (ClassNotFoundException e) {
            System.out.println("Error en el Driver");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // Cargar el Driver Class.forname("")
        // DriveManaget.connect(uri, user, pass)




    }
    public static void closeConnection (){
        // cierra la conexión
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error en el cerrado de la base de datos");
        }
    }

}
