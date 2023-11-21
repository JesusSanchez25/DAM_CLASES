public class Ejercicio2 {
    //Muéstrese por consola en líneas distintas los valores mínimo y máximo de los tipos
    //primitivos a partir de las constantes definidas en el apartado de “Constantes”.
    //(Constantes)

    public static void main(String[] args) {
        System.out.printf("el valor mínimo de un byte es %d, su máximo es %d y ocupa un tañado de %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.SIZE);
        System.out.printf("el valor mínimo de un short es %d, su máximo es %d y ocupa un tañado de %d\n", Short.MIN_VALUE, Short.MAX_VALUE, Short.SIZE);
        System.out.printf("el valor mínimo de un int es %d, su máximo es %d y ocupa un tañado de %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.SIZE);
        System.out.printf("el valor mínimo de un long es %d, su máximo es %d y ocupa un tañado de %d\n", Long.MIN_VALUE, Long.MAX_VALUE, Long.SIZE);
        System.out.printf("el valor mínimo de un float es %f, su máximo es %f y ocupa un tañado de %d\n", Float.MIN_VALUE, Float.MAX_VALUE, Float.SIZE);
        System.out.printf("el valor mínimo de un double es %f, su máximo es %.2f y ocupa un tañado de %d\n", Double.MIN_VALUE, Double.MAX_VALUE, Double.SIZE);
    }
}
