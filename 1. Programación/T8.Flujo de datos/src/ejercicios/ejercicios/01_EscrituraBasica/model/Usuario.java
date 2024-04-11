package TODO_CASA.ejercicios.I_EscrituraBasica.model;

public class Usuario {

    //1. (DatosBásicos) Realiza un programa que pida por pantalla los datos de un usuario y lo añada a una lista (ArrayList) Los datos que se pedirán son: nombre, apellido, dni, teléfono y edad. Al terminar de pedir todos los datos de un usuario la aplicación deberá preguntar si se quieren seguir introduciendo datos: 2. En caso de contestar si, se volverán a pedir los mismos datos, crear el usuario y meterlo en la lista 3. En caso de contestar no se deberá volcar a un fichero llamado usuarios.txt todos los datos de usuarios del ArrayList con el siguiente formato
    //
    //Usuario 1
    //
    //- Nombre:XXX
    //- Apellido:XXX
    //- Teléfono:XXX
    //- DNI:XXX
    //- Edad:XXX


    private String nombre, apellido, telefono,dni;
    private int edad;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String telefono, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
        this.edad = edad;
    }

    @Override
    public String toString() {
        String texto = "Usuario: "
                + "Nombre " + nombre
                +"\nApellido " + apellido
                + "\nTeléfono " + telefono
                +"\nDni " + dni
                + "\nEdad " + edad
                + "\n\n";
        return texto;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
