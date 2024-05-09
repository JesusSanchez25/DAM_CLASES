package ejercicioColegio;

import ejercicioColegio.controler.AcademiaControler;
import ejercicioColegio.database.DBconnection;

import java.sql.Connection;

public class Entrada {
    public static void main(String[] args) {

        Connection connection = DBconnection.getConnection();
        AcademiaControler academiaControler = new AcademiaControler();

        academiaControler.obtenerProfesores();
    }
}
