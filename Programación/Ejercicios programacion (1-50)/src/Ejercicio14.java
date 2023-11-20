public class Ejercicio14 {
    public static void main(String[] args) {

        int operando1 = 24;
        int operando2 =7;

        int suma1 = operando1 + operando2;
        int resta1 = operando1 - operando2;
        int multiplicacion1 = operando1*operando2;
        int division1 = operando1/operando2;
        int modulo1 = operando1%operando2;
        double division2 = (double) operando1/operando2;
        double modulo2 = operando1%operando2;

        System.out.printf("La suma de %d y %d es %d\n", operando1, operando2, suma1);
        System.out.printf("La resta de %d y %d es %d\n", operando1, operando2, resta1);
        System.out.printf("La multiplicación de %d y %d es %d\n", operando1, operando2, multiplicacion1);
        System.out.printf("La división de %d y %d es %d\n", operando1, operando2, division1);
        System.out.printf("El módulo de %d y %d es %d\n", operando1, operando2, modulo1);
        System.out.printf("La división de %d y %d es %f\n", operando1, operando2, division2);
        System.out.printf("El módulo de %d y %d es %.2f\n", operando1, operando2, modulo2);

    }
}
