import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        //Hágase un programa que lea en tres variables de cadena tu nombre, tu primer apellido
        //y tu segundo apellido; y en otras tres variables enteras tu día, mes y año de nacimiento.
        //El programa utilizará sólo una vez el método println para mostrar la salida.
        //(Concatenar)


        Scanner LeerTeclado = new Scanner(System.in);

        System.out.println("Inserte el nombre de la primera persona");
        String Nombre = LeerTeclado.nextLine();
        String nombre1 = Nombre.substring(0,Nombre.indexOf(" "));
        String Apellidos = Nombre.substring(Nombre.indexOf(" ")+1);
        String Apellido1 = Apellidos.substring(0,Apellidos.indexOf(" "));
        String Apellido2 = Apellidos.substring(Apellidos.indexOf(" ")+1);

        System.out.println(nombre1);
        System.out.println(Apellidos);
        System.out.println(Apellido1);
        System.out.println(Apellido2);

      /*  int Díadenacimiento= 12;
        int Mesnaciento= 9;
        int Añonacimiento= 1998;

        System.out.println("Me llamo " +Nombre + " " +apellido + " " +apellido1 + "y nací en el "
                +Díadenacimiento+"-" +Mesnaciento +"-"+Añonacimiento);*/
    }
}
