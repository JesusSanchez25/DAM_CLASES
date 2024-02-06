package practica2Examen.model;

public class Vehiculo {
    private int anio, id;
    private String marca, modelo;
    private boolean disponible;

    public Vehiculo() {
    }

    public Vehiculo(int anio, String marca, String modelo) {
        this.anio = anio;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarDatos(){
        System.out.println("Año: " + anio);
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("disponible: " + disponible);
    }

    public void revisarCoche(){
        System.out.println("Vamos a comenzar con la revisión del coche");
        double random = Math.random();
        if (random<0.5){
            System.out.println("Tu coche la ha palmado bro");
            disponible = false;
        } else {
            System.out.println("Tu coche ha sido arreglado con éxito");
        }
        }

    }
}
