package ejercicios.ventanaFutbol.database;

public interface EsquemaFutbol {

    String PORT = "3306";
    String HOST = "127.0.0.1:" + PORT;
    String DB_NAME = "programacionfutbol";
    String TB_USUARIOS = "usuarios";
    String COL_ID = "id";
    String COL_NOMBRE = "nombre";
    String COL_CONTRASENIA = "contrasenia";
    String COL_CORREO = "correo";
    String TB_EQUIPOS = "equipos";
    String COL_PRESUPUEPSTO = "presupuesto";
    String COL_FK_IDEQUIPO = "id_equipo";
    String TB_JUGADORES = "jugadores";
    String COL_JG_NOMBRE = "name";
    String COL_JG_ID = "_id";
    String COL_MEDIA = "media";
    String COL_POSICION = "posicion";
    String COL_PRECIO = "precio";
    String COL_ESTITULAR = "estitular";
    String VISTA_JUGADORESNOFICHADOS = "vistajugadoresnofichados";
    String VISTA_JUGADORESENALINEACION = "vistajugadoresenalineacion";



}
