package ejercicios.Base4;

public class Persona {


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



    public void calcularImc(){

        double imc = peso/(altura*altura/10000);
        System.out.printf("Su imc es de: %s\n", imc);

        if (imc<18.5){
            System.out.println("Peso inferior al normal");
        } else if (imc<25) {
            System.out.println("Peso normal");
        } else if (imc<30) {
            System.out.println("Peso superior al normal");
        } else {
            System.out.println("Obesida grave");
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
