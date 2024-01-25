package Ejemplo_Herencia_Polimorfismo.model;

public final class Deportivo extends Coche {

    private int par;

    // tdo lo que tiene el coche -> excepto los constructores rellenos


    public Deportivo() {
    }

    public Deportivo(String marca, String modelo, int cv, int cc, int velocidad, int par) {
        super(marca, modelo, cv, cc, velocidad);
        this.par = par;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El par es de: " + par);
    }

    @Override
    public void acelerar(int velocidad) {
        super.acelerar(velocidad);
        setVelocidad(getVelocidad()+(int)(velocidad*0.3));
    }

    @Override
    public void decelerar(int velocidad) {
        setVelocidad((int)(getVelocidad()-velocidad*0.9));

    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }
}
