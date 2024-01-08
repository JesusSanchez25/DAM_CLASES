public class Ejercicio4 {


    public static void main(String[] args) {
        //Resuélvase el primer ejercicio del apartado “Salida de datos por consola” de forma
        //que se defina un método de salida para cada una de las líneas de salida.
        //(ConstantesMetodos)

    new Ejercicio4().salida1();
    new Ejercicio4().salida2();
    new Ejercicio4().salida3();
    new Ejercicio4().salida4();
    new Ejercicio4().salida5();
    new Ejercicio4().salida6();

    }
    public void salida1(){
        System.out.printf("el valor mínimo de un byte es %d, su máximo es %d y ocupa un tañado de %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.SIZE);
    }
    public void salida2(){
        System.out.printf("el valor mínimo de un short es %d, su máximo es %d y ocupa un tañado de %d\n", Short.MIN_VALUE, Short.MAX_VALUE, Short.SIZE);
    }
    public void salida3(){
        System.out.printf("el valor mínimo de un int es %d, su máximo es %d y ocupa un tañado de %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.SIZE);
    }
    public void salida4(){
        System.out.printf("el valor mínimo de un long es %d, su máximo es %d y ocupa un tañado de %d\n", Long.MIN_VALUE, Long.MAX_VALUE, Long.SIZE);
    }
    public void salida5(){
        System.out.printf("el valor mínimo de un float es %f, su máximo es %f y ocupa un tañado de %d\n", Float.MIN_VALUE, Float.MAX_VALUE, Float.SIZE);
    }
    public void salida6(){
        System.out.printf("el valor mínimo de un double es %f, su máximo es %.2f y ocupa un tañado de %d\n", Double.MIN_VALUE, Double.MAX_VALUE, Double.SIZE);
    }
}
