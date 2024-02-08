package model;

public class Coche extends Vehiculo {

    private int cv, cc;

    public Coche() {
    }

    public Coche(int numSerie, int precio, String modelo, String marca, Estado estado, int cv, int cc) {
        super(numSerie, precio, modelo, marca, estado);
        this.cv = cv;
        this.cc = cc;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Coche:");
        super.mostrarDatos();
        System.out.println("Centímetros cúbicos: " + cc);
        System.out.println("Caballos: " + cv);
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}
