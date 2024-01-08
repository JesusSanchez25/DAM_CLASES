package _3BloqueFor;

public class estructurafor {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

        }
        //inicio;final,increment
        for (int i=1; i<=5;i++){
            System.out.println("La posición es igual a: " +i);

            if(i%2==0){
                System.out.println("Esto es un número par");
            } else {
                System.out.println("Esto es un número impar");
            }
        }
    }
}
