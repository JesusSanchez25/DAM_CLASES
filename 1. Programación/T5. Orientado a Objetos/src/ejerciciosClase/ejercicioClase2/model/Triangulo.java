package ejerciciosClase.ejercicioClase2.model;

public class Triangulo {

    private int base, altura;
    private double area;
    public Triangulo(){}
    public Triangulo(int base, int altura){
        this.area = base*altura/2;
        this.base = base;
        this.altura = altura;


    }
    public double calcularArea(){
        double area = base*altura/2;
        return area;

    }



}
