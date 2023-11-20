package ArrayEjercicios;

public class Clase05 {
    public static void main(String[] args) {
        //1. (OperacionesArray) Crear un array con 10 posiciones y asígnale números enteros entre 0 y 9,
        // ambos inclusive (de forma automática). Se mostrarán los datos separados por una coma y un espacio.
        // Una vez hecho esto se modificará el array del de la manera indicada en cada apartado, y se mostrará de nuevo.
        //- Incrementar en 1 los valores pares y en -1 los impares.
        //- Duplicar los valores positivos menores que 5
        //- Sumar a cada valor un valor entero aleatorio entre -5 y 5.
        //- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
        //segundo al tercero, ..., y el último al primero).
        //- Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.
        //- Invertir el array
        //- Mostrar la posición del primer par y del último impar.

        int[] numeros = new int[10];
        int[] numerosCopia = new int[numeros.length];
        int UltimoImpar= 0;
        int PrimerPar= 0;




        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
            System.out.print(numeros[i]+", ");
        }
        System.out.println("");

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0){
                numeros[i]+=1;
            } else {
                numeros[i]-=1;
            };
            System.out.print(numeros[i]+", ");
        }
        System.out.println("");

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]<5){
                numeros[i]*=2;
            }
            System.out.print(numeros[i]+", ");
        }
        System.out.println("");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i]+=(int)((Math.random()*10)-5);
            System.out.print(numeros[i]+", ");
            numerosCopia[i] = numeros[i];
        }
        System.out.println("");

        for (int i = 0; i < numeros.length; i++) {
            if(i!= 0){
                numeros[i]=numerosCopia[i-1];
                System.out.print(numeros[i]+", ");
                numerosCopia[i-1]=numeros[i-1];
            } else if (i==0) {
                numeros[0]=numeros[numeros.length-1];
                System.out.print(numeros[i]+", ");
            }
            numerosCopia[numeros.length-1]=numeros[numerosCopia.length-1];
        }
        System.out.println("");

        for (int i = 0; i < numeros.length-1; i+=2) {
            numeros[i]=numerosCopia[i+1];
            numeros[i+1]=numerosCopia[i];

            for (int j = 0; j < 2; j++) {
                System.out.print(numeros[j+i]+", ");
            }
            numerosCopia[i]= numeros[i];
            numerosCopia[i+1]= numeros[i+1];

        }
        System.out.println("");

        for (int i = 0; i < numeros.length; i++) {
            int aux = numeros[i];
            numeros[i] = numeros[numeros.length-1-i];
            numeros[numeros.length-1-i] = aux;

        }
        for (int numero : numeros) {
            System.out.print(numero+", ");
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0 && PrimerPar==0){
                PrimerPar=numeros[i];
            } else if (numeros[i]%2==1){
                UltimoImpar= numeros[i];

            }
        }
        System.out.println("\nEl primer par es: "+PrimerPar);
        System.out.println("El último impar es: "+UltimoImpar);
    }
}
