public class Ejercicio34 {
    public static void main(String[] args) {

    //34. Leáse tres números entre 0 y 9, ambos inclusive. Compruébese (mostrándose
    //verdadero o falso) las siguientes condiciones:
    //a) Los tres valores son iguales
    //b) Dos a dos los valores son distintos
    //c) Hay más pares que impares
    //d) Uno es el producto de los otros dos

        Integer numero1 = 8;
        Integer numero2 = 4;
        Integer numero3 = 2;
        Boolean numero1Par = (numero1%2)==0;
        Boolean numero2Par = (numero2%2)==0;
        Boolean numero3Par = (numero3%2)==0;



        Boolean Comprobante = numero1==numero2&&numero2==numero3;
        Boolean Comprobante1 = numero1!=numero2&&numero2!=numero3;
        Boolean ComprobanteImpares = (numero1Par&&(numero2Par||numero3Par)||(numero2Par&&(numero1Par||numero3Par))||(numero3Par&&(numero1Par||numero2Par)));
        Boolean ComprobanteProductos = (numero1==(numero2*numero3)||(numero2==(numero1*numero3))||(numero3==(numero1*numero2)));

        System.out.println(Comprobante);
        System.out.println(Comprobante1);
        System.out.println(ComprobanteImpares);
        System.out.println(ComprobanteProductos);


    }
}
