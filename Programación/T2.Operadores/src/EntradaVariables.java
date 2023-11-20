public class EntradaVariables {
    //(Fuera del main para que sea una variable global o de clase)
    int numero = 0;
    String apellido = "Sanchez";
    public void metodoImprimir(){
        String correo = "jesus.sanchez@gmail.com"; //esta var es de bloque
        System.out.println(numero);
        System.out.println(apellido);
        System.out.println(correo);
    }

    //las variables de bloque solo existen dentro de sus corchetes y no se pueden llamar desde fuera
    public void cambiarValores(){
        int numero = 80;
        apellido = "Pedraza";
        String correo = "otrogmail@gmail.com";

    }

    public static void main(String[] args) {

    //mutables
    String nombre = "Jesús";
        System.out.println(nombre);
        nombre="José";
        System.out.println(nombre);

    //no mutables (constantes)
        final String CIF = "B12323223";
        //CIF= "Z213321" (no se puede cambiar porque es constante)
        System.out.println(CIF);


        //Variables primitivas (son solo un número/dato y empiezan por minúscula): "int, double, char..."
        //Variables complejas (guardan todas las funcionalidades que se pueden usar como ese dato, son una clase y
        //tienen sus funcionalidades): "String, Integer, Character...

        //números enteros (sin comas)
        byte numeroByte = 123;
        Byte numeroByteComplejo = 123;
        short numeroShort = 12345;
        int numeroInt = 123456789;
        long numeroLong = 123456789;

        //números reales (con comas)
        float numeroFloat = 1234.0f;        //poner f para que sepa que es float
        double numeroDouble = 123456789.6;

        //boolean (true/false)
        boolean valorTrue = true;
        boolean valorFalse = false;
        Boolean valorBooleanComplejo = false;

        //letras - solo una letra -> '' (comilla simple solo)
        char letra = 'a';

        //palabras - ""
        String valorPalabra = "esto es una frase";


        System.out.println("El byte es " +numeroByte);
        System.out.println("El short es " +numeroShort);
        System.out.println("El int es " +numeroInt);
        System.out.println("El long es " +numeroLong);
        System.out.println("El float es " +numeroFloat);
        System.out.println("El double es " +numeroDouble);
        System.out.println("El boolean es " +valorTrue);
        System.out.println("El char es " +letra);
        System.out.println("La frase es " +valorPalabra);


        System.out.printf("el valor mínimo de un byte es %d, su máximo es %d y ocupa un tañado de %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.SIZE);
        System.out.printf("el valor mínimo de un short es %d, su máximo es %d y ocupa un tañado de %d\n", Short.MIN_VALUE, Short.MAX_VALUE, Short.SIZE);
        System.out.printf("el valor mínimo de un int es %d, su máximo es %d y ocupa un tañado de %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.SIZE);
        System.out.printf("el valor mínimo de un long es %d, su máximo es %d y ocupa un tañado de %d\n", Long.MIN_VALUE, Long.MAX_VALUE, Long.SIZE);
        System.out.printf("el valor mínimo de un float es %.2f, su máximo es %f y ocupa un tañado de %d\n", Float.MIN_VALUE, Float.MAX_VALUE, Float.SIZE);
        System.out.printf("el valor mínimo de un double es %.2f, su máximo es %.2f y ocupa un tañado de %d\n", Double.MIN_VALUE, Double.MAX_VALUE, Double.SIZE);




    }





}
