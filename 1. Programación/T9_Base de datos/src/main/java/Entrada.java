import controler.AcademiaControler;
import controler.AlumnoCrudRepository;
import database.DBconnection;
import model.Alumno;
import model.Profesor;

import java.sql.Connection;

public class Entrada {
    public static void main(String[] args) {

        Connection connection = DBconnection.getConnection();
        AcademiaControler academiaControler = new AcademiaControler();

        academiaControler.obtenerProfesores();
    }
}
