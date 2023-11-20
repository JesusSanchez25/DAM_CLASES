package ArrayEjercicios;

public class Ejercicio06 {
    public static void main(String[] args) {
        //Escribe un programa que rellene un array de 20 números aleatorios entre el 0 y el 30.
        // Una vez hecho esto realizará las siguientes operaciones:
        //    - modificar todos los 6 por 8
        //    - modificar todos los 7 por 15
        //    - modificar todos los 20 por 10

    int[] numeros = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*31);
            switch (numeros[i]){
                case 6-> numeros[i] = 8;
                case 7-> numeros[i] = 15;
                case 20-> numeros[i] = 10;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }


    }
}
