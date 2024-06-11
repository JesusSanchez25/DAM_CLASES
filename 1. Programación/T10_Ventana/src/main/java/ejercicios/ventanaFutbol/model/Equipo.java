package ejercicios.ventanaFutbol.model;

import ejercicios.ventanaFutbol.controler.DBControler;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class Equipo {
    private String nombre;
    private int presupuesto, id, valoracionMedia;
    private ArrayList<Jugador> plantilla, alineacion;
    private DBControler dbControler;


    public Equipo(int id, String nombre, int presupuesto) {
        dbControler = new DBControler();
        this.plantilla = new ArrayList<>();
        this.alineacion = new ArrayList<>();

        this.id = id;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.plantilla = dbControler.sacarJugadoresEquipo(id);
        this.alineacion = new ArrayList<>();
        sacarAlineacion();
        this.valoracionMedia = 0;
        calcularValoracion();

    }

    public void agregarJugador(Jugador jugador){
        plantilla.add(jugador);


    }

    public void agregarJugadorPlantilla(Jugador jugador){
        alineacion.add(jugador);
    }

    public void calcularValoracion(){
        valoracionMedia = 0;
        for (Jugador item : alineacion) {
            valoracionMedia += item.getMedia();
        }

    }

    public void sacarAlineacion(){
        for (Jugador item : plantilla) {
            if (item.isEstitutlar() && alineacion.size() < 7){
                alineacion.add(item);
            }
        }
    }




}
