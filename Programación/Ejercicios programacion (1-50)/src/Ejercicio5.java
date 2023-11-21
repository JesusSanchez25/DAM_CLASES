

public class Ejercicio5 {

    public static void main(String[] args) {
        //Resuélvase el segundo ejercicio del apartado “Salida de datos por consola” de forma
        //que se defina un método de salida para cada una de las líneas de salida.
        //(DireccionMetodos)

        new Ejercicio5().salida1();
        new Ejercicio5().salida2();
        new Ejercicio5().salida3();
        new Ejercicio5().salida4();
        new Ejercicio5().salida5();
        new Ejercicio5().salida6();
    }

        final String nombreCompleto = "Jesús Sánchez Pedraza";
        final String calle = "Inspector Juan Antonio Bueno";
        final String numeroPortal = "nº4";
        final String piso = ",5";
        final String letraPiso = "D";
        final String codigoPostal = "28923 ";
        final String localidad = "Alcorcón";
        final String provincia = "Madrid";
        final String país = "España";


    public void salida1(){
        System.out.println("SALIDA");
    }
    public void salida2(){
        System.out.println(nombreCompleto);
    }
    public void salida3(){
        System.out.println("C/" +calle + numeroPortal + piso + letraPiso);
    }
    public void salida4(){
        System.out.println(codigoPostal + localidad);
    }
    public void salida5(){
        System.out.println(provincia);
    }
    public void salida6(){
        System.out.println(país);
    }

    }

