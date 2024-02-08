package model;

public class Bicicleta extends Vehiculo implements Reparable {

    private Tipo tipo;

    public Bicicleta() {
    }

    public Bicicleta(int numSerie, int precio, String modelo, String marca, Estado estado, Tipo tipo) {
        super(numSerie, precio, modelo, marca, estado);
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Bicicleta:");
        super.mostrarDatos();
        System.out.println("Tipo de bicicleta: " + tipo.getNombre());
    }

    @Override
    public void reparar() {
        setPrecio((int)(getPrecio()*1.05));
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
