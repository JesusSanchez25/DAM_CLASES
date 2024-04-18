package ejercicios.ejerciciosFichero.III_FicheroObj.model;

// NO DEBE SER SERIALIZABLE
public class UsuarioTexto {

    private String nombre, apellido, correo;
    private int nota1, nota2, nota3;
    private int edad;

    public UsuarioTexto() {
    }

    public UsuarioTexto(String nombre, String apellido, String correo, int nota1, int nota2, int nota3, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.edad = edad;
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

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return String.format("%s,%d,%d,%d,%d", nombre, nota1, nota2, nota3, edad);
    }
}
