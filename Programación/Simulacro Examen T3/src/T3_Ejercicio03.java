import java.util.Scanner;

public class T3_Ejercicio03 {
    public static void main(String[] args) {
        //3. Desarrollar una aplicación que simule el funcionamiento de un cajero automático. Este
        //cajero debe manejar el saldo de una cuenta donde se podrán realizar las siguientes
        //operaciones:
        //- Ingresar dinero: se pedirá el pin y un saldo a introducir. Al realizar la operación se
        //aparecerá el mensaje “saldo introducido con éxito”
        //- Sacar dinero: se pedirá el pin y un saldo a sacar. solo se podrá hacer si el saldo
        //restante no es negativo. En caso de no poder sacar dinero aparecerá el mensaje
        //“Imposible sacar dinero”
        //- Consultar el estado de la cuenta: se pedirá el pin y dice el saldo actual
        //- Salir
        //Consideraciones:
        //- El saldo y las cantidades a ingresar deberán ser double
        //- Cada vez que se realiza una operación se pedirá el PIN que deberá coincidir con 1111.
        //En caso de no coincidir

        Scanner scanner = new Scanner(System.in);

        double dineroCuenta = 0.0;
        int pin = 0;
        int intentoPin = 0;
        double ingresoPerdida =0.0;
        int opcion = 0;

        do {
            System.out.println("1.ingresar dinero");
            System.out.println("2.Sacar dinero");
            System.out.println("3.Consultar dinero");
            System.out.println("4.Salir");
            opcion=scanner.nextInt();

            switch (opcion){
                case 1:

                    System.out.println("Dime el pin");
                        pin=scanner.nextInt();

                        if(pin==1111) {
                    System.out.println("Introduzca la cifra a ingresar");
                ingresoPerdida = scanner.nextInt();
                dineroCuenta += ingresoPerdida;}
                    else {
                         System.out.println("Pin incorrecto");}
                break;

                case 2:
                    System.out.println("Dime el pin");
                    pin=scanner.nextInt();

                    if(pin==1111) {
                        System.out.println("Introduzca la cifra a sacar");
                        ingresoPerdida = scanner.nextInt();
                        if(dineroCuenta>=ingresoPerdida){
                            dineroCuenta -= ingresoPerdida;}
                        else {
                            System.out.println("No posee del saldo necesario para realizar la operación");
                    }
                    }
                    else {
                        System.out.println("Pin incorrecto");}
                    break;
                case 3:
                    System.out.println("Dime el pin");
                    pin=scanner.nextInt();

                    if(pin==1111) {
                        System.out.println("Posee acutalmente de "+dineroCuenta +"€");

                    }
                    else {
                        System.out.println("Pin incorrecto");}
                    break;

            }
        } while (opcion!=4);
        System.out.println("Saliendo...");

    }
}
