import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Realiza una clase llamada Ejercicio5 con un método main el cual realiza
        //operaciones de trigonometría. Para ello el programa contará con los siguientes
        //métodos (da igual si estáticos o no)
        //a. Calcular área triángulo: tendrá dos parámetros de entrada de tipo int y devolverá
        //el resultado de calcular el área de un triángulo. La fórmula matemática es: (b *
        //a)/2

        //b. Calcular área círculo: tendrá un parámetro de te entrada de tipo int y devolverá el
        //resultado de calcular el área del círculo. La fórmula matemática para calcular el
        //área es Pi * r^2
        //Una vez creado estos métodos el método main deberá realizar lo siguiente:
        //- Pedir cinco variables para trabajar con triángulos: altura, lado1, lado2, lado3
        //- Mostrar los siguientes mensajes:
        //o El área del triángulo con base X y altura X es X
        //o El triángulo es isósceles: true o false
        //o El triángulo es equilátero: true o false
        //- Pedir dos variables para trabajar con círculos: radio
        //- Mostrar los siguientes mensajes:
        //o El área del círculo es X (la precisión será de 3 decimales)
        //• Un triángulo es equilatero si sus tres lados son iguales
        //• Un triángulo es isósceles si tienes dos lados iguales y uno diferente

        Scanner LeerTeclado = new  Scanner(System.in);

        System.out.println("Dime la altura del triangulo");
        final int ALTURA = LeerTeclado.nextInt();
        System.out.println("Dime la base del triangulo");
        final int BASE = LeerTeclado.nextInt();
        System.out.println("Dime un lado del triangulo");
        final int LADO1 = LeerTeclado.nextInt();
        System.out.println("Dime el otro lado del triangulo");
        final int LADO2 = LeerTeclado.nextInt();

        boolean isosceles = (((BASE==LADO1)&&(LADO1!=LADO2))||((BASE==LADO2)&&(LADO1!=LADO2))||((LADO1==LADO2)&&(BASE!=LADO2)));
        boolean equilatero = (BASE==LADO1)&&(LADO1==LADO2);


        System.out.println("Dime el radio del círculo");
        Double radio = LeerTeclado.nextDouble();

        System.out.printf("El área del triángulo con base %sm y altura %sm es %s\n", BASE,ALTURA, AreaTriangulo(BASE,ALTURA));
        System.out.printf("El triángulo es isosceles: %b\n", isosceles);
        System.out.printf("El triángulo es equilatero: %b\n", equilatero);
        System.out.printf("El área del círculo es: %s\n", AreaCirculo(radio));

    }
    public static int AreaTriangulo(int BASE, int ALTURA){
        return BASE*ALTURA/2;

    }
   public static Double AreaCirculo(Double radio){
        return Math.PI*(Math.pow(radio,2));

    }




}
