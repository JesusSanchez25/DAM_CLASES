public class PracticasProgramacion {
    public static void main(String[] args) {

    //1. (OperacionesArray) Crear un array con 10 posiciones y asígnale números enteros entre 0 y 9, ambos inclusive (de forma automática). Se mostrarán los datos separados por una coma y un espacio. Una vez hecho esto se modificará el array del de la manera indicada en cada apartado, y se mostrará de nuevo.
        //- Incrementar en 1 los valores pares y en -1 los impares.
        //- Duplicar los valores positivos menores que 5
        //- Sumar a cada valor un valor entero aleatorio entre -5 y 5.
        //- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
        //segundo al tercero, ..., y el último al primero).
        //- Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.
        //- Invertir el array
        //- Mostrar la posición del primer par y del último impar

        int[] cavernícola = new int[]{5,3,8,1,4,2,5,2,9,7,6,123,321,5431};

        //Ordenar de mayor a menor
        for (int i = 0; i < cavernícola.length; i++) {
            int numeroPequeño = cavernícola[i];
            for (int j = i; j < cavernícola.length; j++) {
                if (cavernícola[j] < numeroPequeño){
                    numeroPequeño=cavernícola[j];
                    int aux = cavernícola[i];
                    cavernícola[i] = cavernícola[j];
                    cavernícola[j] = aux;
                }
            }
        }

        for (int numero : cavernícola) {
            System.out.print(numero+", ");
        }



    }
}
