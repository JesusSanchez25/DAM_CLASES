import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //2. Realiza una clase que valide los participantes y plantillas de la liga fantasy. Para ello
        //se pide crear una clase llamada EjercicioDos con un método main donde:
        //a. Se lean por consola (y guardar dentro de variables del tipo que creas conveniente)
        //los siguientes datos:
        //i. nombre participante
        //ii. número de jugadores del participante
        //iii. presupuesto del participante

        //b. Repite el proceso para recoger el nombre, presupuesto y número de jugadores de
        //2 participantes más. (el total de variables creadas será de 9)

        //c. Una vez estén todas las variables y lectura realizadas debes imprimir por pantalla
        //los siguientes mensajes
        //“1. El primer participante tiene 11 jugadores: (true o false)”
        //“2. El segundo participante tiene jugadores pares: (true o false)”
        //“3. El tercer participante tiene presupuesto positivo: (true o false)”
        //“4. La liga está preparada para empezar: (true o false)”
        //Una liga empezará si todos los jugadores tienen 11 jugadores y tienen presupuesto
        //positivo


        Scanner LeerTeclado = new  Scanner(System.in);

        System.out.println("Dime el nombre del primer participante");
        final String NOMBRE1 = LeerTeclado.next();
        System.out.println("Dime el numero de jugadores del primer participante");
        final double NUMEROPARTICIPANTES1 = LeerTeclado.nextDouble();
        System.out.println("Dime el presupuesto del primer participante");
        final double PRESUPUESTOPARTICIPANTES1 = LeerTeclado.nextDouble();


        System.out.println("Dime el nombre del segundo participante");
        final String NOMBRE2 = LeerTeclado.next();
        System.out.println("Dime el numero de jugadores del segundo participante");
        final double NUMEROPARTICIPANTES2 = LeerTeclado.nextDouble();
        System.out.println("Dime el presupuesto del segundo participante");
        final double PRESUPUESTOPARTICIPANTES2 = LeerTeclado.nextDouble();

        System.out.println("Dime el nombre del tercer participante");
        final String NOMBRE3 = LeerTeclado.next();
        System.out.println("Dime el numero de jugadores del tercer participante");
        final double NUMEROPARTICIPANTES3 = LeerTeclado.nextDouble();
        System.out.println("Dime el presupuesto del tercer participante");
        final double PRESUPUESTOPARTICIPANTES3 = LeerTeclado.nextDouble();

        boolean Comprobante1 = NUMEROPARTICIPANTES1==11;
        boolean Comprobante2 = NUMEROPARTICIPANTES2%2==0;
        boolean Comprobante3 = PRESUPUESTOPARTICIPANTES3>0;
        boolean ComprobantePresupuesto = (Comprobante3)&&(PRESUPUESTOPARTICIPANTES1>0)&&(PRESUPUESTOPARTICIPANTES2>0);
        boolean Comprobante4 = (ComprobantePresupuesto)&&(Comprobante1)&&((NUMEROPARTICIPANTES1==NUMEROPARTICIPANTES2)&&(NUMEROPARTICIPANTES2==NUMEROPARTICIPANTES3));

        System.out.println(Comprobante1);
        System.out.println(Comprobante2);
        System.out.println(Comprobante3);
        System.out.println(Comprobante4);

   }
}
