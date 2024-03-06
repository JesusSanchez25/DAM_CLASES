package clasesAnidadas.ejercicioPartido;

public class Entrada {
    public static void main(String[] args) {

        Partido partido = new Partido("Barcelona", "Madrid");

        Partido partido1 = new Partido();
        Partido.Equipo equipo1 = partido1.new Equipo("Barcelona");
        Partido.Equipo equipo2 = partido1.new Equipo("Madrid");

        partido1.mostrarResultado();

    }


}
