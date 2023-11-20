package ArrayEjercicios;


public class Ejercicio04 {
    public static void main(String[] args) {
    //4. Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo.
        // Carga el array numero con valores aleatorios entre 0 y 100.
        //    - En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
        //    - En el array cubo se deben almacenar los cubos de los valores que hay en numero.
        //
        //Una ver realizado lo anterior muestra el contenido de los tres arrays dispuesto en tres columnas


        System.out.println();
    int[] numeros1 = new int[20];
    int[] numeros2= new int[20];
    int[] numeros3 = new int[20];

        for (int i = 0; i < numeros1.length; i++) {
            numeros1[i]= (int)(Math.random()*101);
            numeros2[i] = (int)Math.pow(numeros1[i],2);
            numeros3[i] = (int)Math.pow(numeros1[i],3);
        }

        System.out.println("Los números generados son:");
        System.out.println("Original:\tCuadrado:\tCubo:");
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println(numeros1[i]+"      \t"+numeros2[i]+"      \t"+numeros3[i]);
        }
    }
}
