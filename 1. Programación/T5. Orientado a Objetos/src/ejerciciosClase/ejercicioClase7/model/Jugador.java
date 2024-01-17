package ejerciciosClase.ejercicioClase7.model;

public class Jugador {
    private String nombre;
    private String posicion;
    private boolean estrella;
    private int calidad;

    // Constructor que inicializa los atributos con los parámetros dados
    public Jugador(String nombre, String posicion, int calidad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.calidad = calidad;
        this.estrella = (calidad > 90);
    }

    // Método para mostrar los datos del jugador por pantalla
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Estrella: " + estrella);
        System.out.println("Calidad: " + calidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }
}


