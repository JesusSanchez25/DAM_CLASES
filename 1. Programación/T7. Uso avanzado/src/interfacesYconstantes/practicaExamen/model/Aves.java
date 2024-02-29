package interfacesYconstantes.practicaExamen.model;

public class Aves extends Animal{

    private int envergadura;

    public Aves() {
    }

    public Aves(int edad, String nombre, int envergadura) {
        super(edad, nombre);
        this.envergadura = envergadura;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Envergadura de alas: " + envergadura);
    }

    public void volar(){
        System.out.println("Y voló");
    }
}
