package ejercicios.Base1;

public class Persona {
    //1. Crea una clase llamada persona con los siguientes elementos
    //    - Propiedades: nombre (string) apellido (string) dni (string) edad (int) peso (double) altura (int)
    //    - Métodos:
    //        - mostrarDatos: sacará por pantalla los datos de la persona formateados
    //        - Métodos getters y setters asociados
    //        - Constructores:
    //            - un constructor que permita crear una persona con todos los datos
    //            - un constructor que permita crear una persona sin peso ni altura
    //            - un constructor que permita crear una persona con nombre y apellidos,
    //            el resto de datos los pondrá a 0, excepto el dni que lo pondrá a 111111111X
    //            - un constructor que permita crear una persona sin datos de entrada. Los inicializará
    //            todos a "datos por defecto", 1111111111X y 0 respectivamente

private String nombre, apellido, dni;
private int edad, altura;
private double peso;




    public Persona(){
        this("datos por defecto", "datos por defecto", "111111111X", 0, 0.0, 0);

    }

    public Persona(String nombre, String apellido, String dni, int edad, double peso, int altura){

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;


    }

    public Persona(String nombre, String apellido, String dni, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido){

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "111111X";
        // los demás se ponen a 0 solos


    }


    public void mostrarDatos(){
        //    - Propiedades: nombre (string) apellido (string) dni (string) edad (int) peso (double) altura (int)

        System.out.printf("Nombre: %s\n", nombre);
        System.out.printf("apellido: %s\n", apellido);
        System.out.printf("dni: %s\n", dni);
        System.out.printf("edad: %s\n", edad);
        System.out.printf("peso: %s\n", peso);
        System.out.printf("altura: %s\n", altura);

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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
