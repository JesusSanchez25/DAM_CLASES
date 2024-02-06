package practicaExamen.model;

public class Mamiferos extends Animal{
    private int nPatas;

    public Mamiferos() {
    }

    public Mamiferos(int edad, String nombre, int nPatas) {
        super(edad, nombre);
        this.nPatas = nPatas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de patas: " + nPatas);
    }

    public void emitirSonido(){
        System.out.println("MUUUUU");
    }


}
