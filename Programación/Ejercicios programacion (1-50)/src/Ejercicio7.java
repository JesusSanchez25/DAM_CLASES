import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Hágase un programa que lea en variables locales el nombre del ciclo que estudias, tu
        //nombre, tu edad, tu peso, tu letra del dni y si tienes o no carnet de conducir. Los datos
        //leídos se mostrarán por consola en la misma línea seaparados por un espacio.
        //(Estudiante)

        Scanner LeerTeclado = new Scanner(System.in);
        new Ejercicio7().Estudiante();
    }


    protected void Estudiante(){
        Scanner LeerTeclado = new Scanner(System.in);

        System.out.println("Inserte el ciclo formativo que realiza");
        System.out.println("''Pulsa enter para continuar''");
            String cicloFormativo = LeerTeclado.next();
        System.out.println("Inserte su nombre");
        System.out.println("''Pulsa enter para continuar''");
            String nombre = LeerTeclado.next();
        System.out.println("Inserte su edad");
        System.out.println("''Pulsa enter para continuar''");
            String edad = LeerTeclado.next();
        System.out.println("Inserte su peso en kilogramos");
        System.out.println("''Pulsa enter para continuar''");
            String peso = LeerTeclado.next();
        System.out.println("Inserte su letra del DNI");
        System.out.println("''Pulsa enter para continuar''");
            String letraDni = LeerTeclado.next();
        System.out.println("Inserte si tiene carnet de conducir (true/false)");
        System.out.println("''Pulsa enter para continuar''");
            String carnetConducir = LeerTeclado.next();


        System.out.println(cicloFormativo + " "  + nombre + " "  + edad + " "  + peso + " "  + letraDni + " "  + carnetConducir);
        System.out.println("pulse enter para continuar");

    }
}

