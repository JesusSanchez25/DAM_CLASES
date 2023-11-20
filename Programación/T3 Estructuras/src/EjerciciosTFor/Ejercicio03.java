package EjerciciosTFor;

public class Ejercicio03 {
    public static void main(String[] args) {
        //Modificar el ejercicio anterios para calcular la tabla de multiplicar
        // de todos los números (TablaTodos)

        for (int i=0; i <= 10; i++) {
            System.out.print("\nTabla de multiplicar del "+i);
            for (int j = 0; j < 11; j++) {
                System.out.printf("/n%d*%d=%d", i, j, i * j);
            }

        }
    }
}