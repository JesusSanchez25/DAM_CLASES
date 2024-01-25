package Ejemplo_Herencia_Polimorfismo.model;

public final class Utilitario extends Coche{
    private int numeroAsientos;
    public Utilitario(){}

    public Utilitario(String marca, String modelo, int cv, int cc, int velocidad, int numeroAsientos) {
        super(marca, modelo, cv, cc, velocidad);
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de asientos: " + numeroAsientos);
    }

    @Override
    public void acelerar(int velocidad) {
        super.acelerar(velocidad);
    }

    public void decelerar(int velocidad) {
        setVelocidad((int)(getVelocidad()-velocidad*0.8));


    }
}
