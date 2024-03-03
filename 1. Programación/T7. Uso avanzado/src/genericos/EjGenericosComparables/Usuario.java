package genericos.EjGenericosComparables;

public class Usuario implements Comparable<Usuario>{

    //Crea una clase llamada Usuario con nombre, apellido, correo y edad. Dicha clase implementará Comparable la
    // cual se ordena por edad. Dicha clase tendrá constructor, getter, setter y mostrar datos

    private String nombre, apellido, correo;
    private int edad;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String correo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("Edad: " + edad);
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("correo: " + correo);
    }

    @Override
    public int compareTo(Usuario o) {
        if (edad<o.getEdad()){
            return -1;
        } else if(edad>o.getEdad()){
            return 1;
        } else {
            return 0;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
