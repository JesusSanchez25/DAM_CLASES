package ejerciciosClase.ejercicioClase2.model;

public class Circulo {
    private double radio,diametro, area;


    public Circulo(){}
    public Circulo(double radio){
        this.radio = radio;
        this.area = Math.PI*Math.pow(radio, 2);
    }

    public double calcularArea(){
        area = Math.PI*Math.pow(radio, 2);
        return area;
    }

    public double calcularDiametro(){
        diametro = 2*radio;
        return diametro;

    }



}
