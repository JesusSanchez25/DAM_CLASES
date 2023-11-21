package EjerciciosTFor;

public class Ejercicio06 {
    public static void main(String[] args) {
        //Mostrar todos los números pares comprendidos entre dos dados. (ParesEntreDosDados)

        int numero1 = (int)Math.ceil(Math.random()*6);
        System.out.println("el primer número es: "+numero1);
        int numero2 = (int)Math.ceil(Math.random()*6);
        System.out.println("el segundo número es: "+numero2);

        int pares = 0;
        for (int i = numero1+1; i < numero2; i++) {
            if (i%2==0){pares++;}
        }
        System.out.println("El número de pares entre el rango es: "+pares);
        }
    }

