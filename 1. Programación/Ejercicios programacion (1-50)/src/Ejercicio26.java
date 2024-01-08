import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        //Hágase una aplicación que permita introducir el cambio a devolver en un
        //establecimiento (un valor entre 0.00 € y 4.99 €) y se muestre el cambio óptimo en
        //monedas. (CambioOptimo)

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Introduce el dinero a devolver (0-5)");
        Double dineroTotal = LeerTeclado.nextDouble();
        Double Monedas2Euros = Math.floor(dineroTotal/2);
        Double centimos = dineroTotal-Math.floor(dineroTotal);
        Double Monedas1Euros = Math.floor(dineroTotal%2);
        Double Monedas50Centimos = Math.floor(centimos/2);
        Double Monedas20Centimos= Math.floor((centimos-(0.5*Monedas50Centimos))/20*100);
        Double Monedas10Centimos= Math.floor((centimos-0.5*Monedas50Centimos-0.2*Monedas20Centimos)/10*100);
        Double Monedas5Centimos= Math.floor((centimos-0.5*Monedas50Centimos-0.2*Monedas20Centimos-0.1*Monedas10Centimos)/5*100);
        Double Monedas2Centimos= Math.floor((centimos-0.5*Monedas50Centimos-0.2*Monedas20Centimos-0.1*Monedas10Centimos-0.05*Monedas5Centimos)/2*100);
        Double Monedas1Centimos= Math.floor((centimos-0.5*Monedas50Centimos-0.2*Monedas20Centimos-0.1*Monedas10Centimos-0.05*Monedas5Centimos-0.02*Monedas2Centimos)*100);


        System.out.println(Monedas2Euros);
        System.out.println(Monedas1Euros);
        System.out.println(Monedas50Centimos);
        System.out.println(Monedas20Centimos);
        System.out.println(Monedas10Centimos);
        System.out.println(Monedas5Centimos);
        System.out.println(Monedas2Centimos);
        System.out.println(Monedas1Centimos);

    }
}