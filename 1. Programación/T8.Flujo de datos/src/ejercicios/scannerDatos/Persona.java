package ejercicios.scannerDatos;

public class Persona {


    private String nombre, apelido, dni;
    private int telefono, edad;

    public Persona() {
    }

    public Persona(String nombre, String apelido, String dni, int telefono, int edad) {
        this.nombre = nombre;
        this.apelido = apelido;
        this.dni = dni;
        this.telefono = telefono;
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono=" + telefono +
                ", edad=" + edad +
                "}\n";
    }

    public String mostrarDatos(){
        String datos = "Nombre: " + nombre + ",Apellido: " +
                apelido + ",DNI: " + dni + ",Telefono: " + telefono + ",Edad: " + edad;

        return datos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
