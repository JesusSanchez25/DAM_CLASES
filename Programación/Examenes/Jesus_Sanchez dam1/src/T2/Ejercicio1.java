import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //1. Realiza las siguientes acciones dentro de una misma clase:
        //a. Una clase llamada EjercicioUno que contenga un método main. Realiza las
        //siguientes acciones dentro de la clase
        //i. Crea las siguientes variables: nombre, apellido, edad, altura, peso, sexo (M/F).
        //Pon el tipo que consideres correcto
        //ii. Pide por consola cada uno de los datos anteriores y guárdalos en las variables
        //iii. Crea una variable llamada IMC


        //b. Crea un método llamado calculoIMC el cual pida por parámetros el peso (en kg) y
        //la altura (en m). Este método retornará el valor obtenido en la siguiente fórmula
        //peso. IMC = peso / altura ^ 2
        //c. En el método main, iguala el valor de la variable IMC al retorno del método creado
        //en el punto anterior
        //d. Imprime por consola un mensaje con el siguiente formato
        //
        //“Hola Borja tu IMC teniendo en cuenta tu altura de 174cm y tu peso de 68kg, tiene
        //un valor de 19,54”

        Scanner LeerTeclado = new  Scanner(System.in);

        System.out.println("Dime tu nombre");
        final String NOMBRE = LeerTeclado.next();
        System.out.println("Dime tu apellido");
        final String APELLIDO = LeerTeclado.next();
        System.out.println("Dime tu edad");
        final Double EDAD = LeerTeclado.nextDouble();
        System.out.println("Dime tu altura en metros");
        final Double ALTURA = LeerTeclado.nextDouble();
        System.out.println("Dime tu peso en kg");
        final Double PESO = LeerTeclado.nextDouble();
        System.out.println("Dime tu sexo (M/F)");
        String Sexo =  LeerTeclado.next();
        final char SEXO= Sexo.charAt(0);
        System.out.println(SEXO);

        Double IMC = CalculoIMC(ALTURA,PESO);
        System.out.printf("“Hola %s tu IMC teniendo en cuenta tu altura de %.1f y tu peso de %.1f, tiene" +
                "un valor de %.2f”",NOMBRE,ALTURA,PESO,IMC);
    }

    public static Double CalculoIMC(Double ALTURA, Double PESO){

        Double pruebas = PESO/Math.pow(ALTURA,2);

        return pruebas;
    }
}