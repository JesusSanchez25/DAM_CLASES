package Ejemplo_Herencia_Polimorfismo.model;

public final class Suv extends Coche{

    private int traccion;
    public Suv(){

    }

    public Suv(String marca, String modelo, int cv, int cc, int velocidad, int traccion) {
        super(marca, modelo, cv, cc, velocidad);
        this.traccion = traccion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tracción: " + traccion);
    }

    @Override
    public void acelerar(int velocidad) {
        super.acelerar(velocidad);

        switch (traccion){
            case 2:
                setVelocidad(getVelocidad()+(int)(velocidad*0.1));
                break;
            case 4:
                setVelocidad(getVelocidad()+(int)(velocidad*0.05));
                break;

        }
    }

    @Override
    public void decelerar(int velocidad) {
        setVelocidad((int)(getVelocidad()-velocidad*0.7));

    }


}
