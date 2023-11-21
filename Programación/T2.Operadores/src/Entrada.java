public class Entrada {
    public static void main(String[] args) {

        /* String nombre = "Jesús";
        int edad = 18;

        System.out.print("Este es mi primer trabajo en Java, poco más y me contrata Google\t39 \nHola");

        System.out.printf("\nmi nombre es %s y tengo %d años\n", nombre, edad);
        //el %d es de decimal (un número)

        System.out.println("Mi nombre es "+nombre+" y tengo "+edad+"años");

        System.out.println(39);*/

        //Crea un nuevo programa que muestre ¡Hola mundo!, para la salida por consola se
        // haga en un método sin datos de entrada ni salida de nombre “saludar”.


        new Entrada().saludar();
        new Entrada().saludarPerso("Jesús");    //Cada uno es un método que se refiere a una acción
        new Entrada().saludarPerso("Leticia");    //cada uno que pongas se ejecuta independientemente del otro

        new Entrada().sumar(6,2);
        new Entrada().dividir(9,2);

    }


    public void saludar() {
        System.out.println("Hola mundo");
        System.out.println("Otra frase más");


    }

    //Crea un método que se llame saludarPerso el cual admita un
    // parámetro de tipo string y muestre por consola el mensaje "Hola NombreIntroducido".

    public void saludarPerso(String nombre){
        System.out.println("hola "+nombre);


    }

    //Crea un método que admita como parámetros dos números y muestre por consola su suma.
    public void sumar(Integer número1, Integer número2){
        System.out.println("La suma de los números es "+ (número1+número2));
    }

    public void dividir(Integer número1, Integer número2){
        System.out.println("La división de los números es "+ (double)número1/número2);}

        
}