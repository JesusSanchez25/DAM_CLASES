package model;

import static model.Estado.*;

public abstract class Vehiculo {

    private int numSerie, precio;
    private String modelo, marca;
    private Estado estado;

    public Vehiculo() {
    }

    public Vehiculo(int numSerie, int precio, String modelo, String marca, Estado estado) {
        this.numSerie = numSerie;
        this.precio = precio;
        this.modelo = modelo;
        this.marca = marca;
        this.estado = estado;

        if (estado.equals(Nuevo)){
            this.precio += precio*0.1;
        } else if (estado.equals(Seminuevo)){
            this.precio += precio*0.05;
        } else if(estado.equals(Usado)){
            this.precio += 0;
        }
    }

    public void mostrarDatos(){
        System.out.println("Número de serie: " + numSerie);
        System.out.println("Precio: " + precio);
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Estado: " + estado.getNombre());
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
