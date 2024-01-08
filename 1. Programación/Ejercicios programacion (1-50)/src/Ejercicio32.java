public class Ejercicio32 {
    public static void main(String[] args) {
        //Lea dos números entre 0 y 9, ambos inclusive. Compruébese (mostrándose verdadero
        //o falso) las siguientes condiciones e indíquese cómo se evalúan:
        // a) El primero es par y el segundo impar
        //b) El primero es superior al doble del segundo e inferior a 8
        //c) Son iguales o la diferencia entre el primero y el segundo es menor que 2
        //(CompararEnteros)

        Integer numero1 = 4;
        Integer numero2 = 5;

        Boolean comprobanteParImpar = ((numero1 % 2)==0)&&((numero2 % 2)==1);
        Boolean comprobanteDobleMenor8 = (numero1>(2*numero2))&&(numero1<8);
        Boolean comprobanteIgualesDiferencia2 = (numero1==numero2)||(-2<(numero1-numero2)&&(numero1-numero2)<2);
        System.out.println(comprobanteParImpar);
        System.out.println(comprobanteDobleMenor8);
        System.out.println(comprobanteIgualesDiferencia2);

    }
}
