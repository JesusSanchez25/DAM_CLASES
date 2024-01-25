package Ejemplo_Herencia_Polimorfismo.model;

public abstract class Coche {

    private String marca, modelo;
    private int cv,cc, velocidad;

    public Coche(){}
    public Coche(String marca, String modelo, int cv, int cc, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.cc = cc;
        this.velocidad = velocidad;
    }

    public void mostrarDatos(){
        System.out.println("La marca es: " + marca);
        System.out.println("El modelo es: " + modelo);
        System.out.println("La caballos es: " + cv);
        System.out.println("Los centimetros cúbicos es: " + cc);
        System.out.println("La velocidad es: " + velocidad);

    }

    public void acelerar(int velocidad){
        this.velocidad += velocidad;

    }

    public abstract void decelerar(int velocidadFreno);

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

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
