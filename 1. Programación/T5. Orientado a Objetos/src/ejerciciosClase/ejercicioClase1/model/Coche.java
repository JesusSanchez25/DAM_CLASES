package ejerciciosClase.ejercicioClase1.model;

public class Coche {
    private Motor motor;
    private String marca, modelo;
    private double precio;

    public Coche(Motor motor, String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acumularAveria(int precio){
        this.precio += precio;

    }


    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
