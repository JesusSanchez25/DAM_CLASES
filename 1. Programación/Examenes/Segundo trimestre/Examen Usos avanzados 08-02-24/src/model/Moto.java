package model;

public class Moto extends Vehiculo {

    private int peso;
    private String transmision;

    public Moto() {
    }

    public Moto(int numSerie, int precio, String modelo, String marca, Estado estado, int peso, String transmision) {
        super(numSerie, precio, modelo, marca, estado);
        this.peso = peso;
        this.transmision = transmision;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Moto:");
        super.mostrarDatos();
        System.out.println("Peso: " + peso);
        System.out.println("Transmisión: " + transmision);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
}
