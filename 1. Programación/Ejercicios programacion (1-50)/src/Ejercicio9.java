import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        //Hágase un programa que lea el nombre de dos personas, su altura, su edad, si tienen
        //carnet o no de conducir y la letra de su dni. Se mostrarán los datos como se indica en
        //la salida. (FormatoDatos)

        Scanner LeerTeclado = new Scanner(System.in);

        System.out.println("Inserte el nombre de la primera persona");
        String nombre = LeerTeclado.next();
        System.out.println("Inserte su edad");
        String edad = LeerTeclado.next();
        System.out.println("Inserte su estatura");
        String altura = LeerTeclado.next();
        System.out.println("Inserte si tiene carnet de conducir (true/false)");
        String carnetConducir = LeerTeclado.next();
        System.out.println("Inserte su letra del DNI");
        String letraDni = LeerTeclado.next();

        System.out.println("Inserte el nombre de la segunda persona");
        String nombre1 = LeerTeclado.next();
        System.out.println("Inserte su edad");
        String edad1 = LeerTeclado.next();
        System.out.println("Inserte su estatura");
        String altura1 = LeerTeclado.next();
        System.out.println("Inserte si tiene carnet de conducir (true/false)");
        String carnetConducir1 = LeerTeclado.next();
        System.out.println("Inserte su letra del DNI");
        String letraDni1 = LeerTeclado.next();

        String Espacios = " ";
        String EspaciosTotales1 = "";
        String EspaciosTotales2 = "";
        String EspaciosTotalesNombre = "";
        Integer DiferenciaEspaciosPersona1 = 26-nombre.length();
        Integer DiferenciaEspaciosPersona2 = 26-nombre1.length();

        for(int i=0; i<DiferenciaEspaciosPersona1+1; i++){
            EspaciosTotales1 += Espacios;
        }
        for(int i=0; i<DiferenciaEspaciosPersona2+1; i++){
            EspaciosTotales2 += Espacios;
        }
        for(int i=0; i<21; i++){
            EspaciosTotalesNombre += Espacios;
        }


        System.out.printf("nombre                     Edad     Altura   Carnet   Letra\n");
        System.out.printf("======%s====    =======   =======   =====\n",EspaciosTotalesNombre);
        System.out.printf("%s%s%s        %s      %s       %s\n", nombre,EspaciosTotales1, edad, altura, carnetConducir, letraDni);
        System.out.printf("%s%s%s        %s      %s       %s\n", nombre1,EspaciosTotales2, edad1, altura1, carnetConducir1, letraDni1);
        System.out.printf("-------------------------------------------------------------");
    }


}
