package model;

public class Patinete extends Vehiculo implements Reparable{

    private int minutAutonomia;

    public Patinete() {
    }

    public Patinete(int numSerie, int precio, String modelo, String marca, Estado estado, int minutAutonomia) {
        super(numSerie, precio, modelo, marca, estado);
        this.minutAutonomia = minutAutonomia;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Patinete:");
        super.mostrarDatos();
        System.out.println("Minutos de autonomía: " + minutAutonomia);
    }

    @Override
    public void reparar() {
        setPrecio((int)(getPrecio()*1.1));
    }

    public int getMinutAutonomia() {
        return minutAutonomia;
    }

    public void setMinutAutonomia(int minutAutonomia) {
        this.minutAutonomia = minutAutonomia;
    }
}
