package ejercicioBiblioteca.model;

public abstract class Formato {

    private int id;
    private String titulo;
    private boolean estado;
    private String seccion;

    public Formato() {
    }

    public Formato(String seccion, String titulo) {
        this.seccion = seccion;
        this.titulo = titulo;
    }

    public void mostrarDatos(){
        System.out.println("Id: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Seccion: " + seccion);
        System.out.println("Estado: " + estado);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
