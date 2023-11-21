package ArrayMultidimensionalEjericios;

public class EjercicioFilasColumnas {
    public static void main(String[] args) {

    int[][] array = new int[3][7];
    int pares = 0;
    int impares = 0;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]= (int)(Math.random()*100);
            }
        }
        int j= 0;


        for (int[] fila : array) {
            for (int numero : fila) {
                System.out.print(numero+", ");
                switch (numero%2){
                    case 0-> pares++;
                    case 1-> impares++;
                }
            }
            System.out.println("");

        }

        System.out.println("El número de pares es: "+pares);
        System.out.println("El número de impares es: "+impares);

        for (int[] fila : array) {
            int sumaFilas = 0;
            for (int numero : fila) {
                sumaFilas+=numero;
            }
            System.out.printf("La suma de la fila 1 da: %d",sumaFilas);
            System.out.println("");

        }

        int sumaColumna1 = 0;



        for (int e = 0; e < 7; e++) {
            for (int i = 0; i < 3; i++) {
                sumaColumna1+=array[i][j];

            }
            j++;
            System.out.printf("\nLa columna %dº da:" +sumaColumna1, e);
            sumaColumna1=0;
        }








    }
}
