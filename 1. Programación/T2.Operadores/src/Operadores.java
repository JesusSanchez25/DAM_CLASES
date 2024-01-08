public class Operadores {

    public static void main(String[] args) {
        int numeroUno = 10;
        int numeroDos = 5;
        int numeroTres = 30;
        int numeroCuatro =26;

        //OPERACIONES SIMPLES//
        /*numero++;
        numero++;
        numero++;
        numero++;
        numero--;
        numero--;
        numero = -numero;

        int suma = numeroUno + numeroDos;
        int restar = numeroUno - numeroDos;
        int multi = numeroUno * numeroDos;
        double división = (double) numeroUno / numeroDos;
        int modulo = numeroUno % numeroDos;


        System.out.printf("El resultado de la suma es %d\n",suma);
        System.out.printf("El resultado de la resta es %d\n",restar);
        System.out.printf("El resultado de la multiplicación es %d\n",multi);
        System.out.printf("El resultado de la división es %.2f\n",división);
        System.out.printf("El resultado de la división es %d\n",modulo); //el resto de la división */

        //OPERADORES ARITMÉTICOS//
       /* numeroUno =10;
        numeroDos =6;
        int sumas = numeroUno + numeroDos;
        numeroUno +=numeroDos; //es lo mismo que numeroUno = numeroUno + numeroDos

        numeroUno -=2; //numeroUno = numeroUno - 2
        numeroUno +=1; //numeroDos = numeroUno +1
        numeroUno *=1; //numeroUno = numeroUno *1
        numeroUno /=2; //numeroUno = numeroUno/2
        numeroUno%=3; //numeroUno = numreoUno %3 numeroUno = 7%3
        //numeroUno = 1 */


        //OPERADORES RELACIONALES//
        /*
        //> : el número de la izquierda es más grande que el número que está en la derecha (te da true or false)
        boolean relacionUno = numeroUno>numeroDos; //10>6? -> true

        //>= : el número de la izquierda es más grande o igual que el número que está en la derecha
        boolean relacionDos = numeroUno>= numeroDos; //10>=10? -> true

        //< : el número de la izquierda es más pequeño que el número que está enl a derecha
        numeroDos = 17;
        boolean relaciontres = numeroUno<numeroDos; // 10<17 ->true
        //<= : el número de la izquierda es más pequeño o igual que el númreo de la derecha
        boolean relacionCuatro = numeroUno<=numeroDos; //10<=17 -< true
        // == : los dos números tienen el mismo valor
        boolean relacionCinco = numeroDos == numeroUno; // 17 == 10 -> false
        // != : los dos números son diferentes
        boolean relacionSeis = numeroUno !=numeroDos; // 10 es diferente de 17? -< true */


        //OPERADORES LÓGICOS//
        /*
        // &&(ampersan) esto y esto es verdad entonces da verdad
        boolean relacionUno = numeroUno>0 && nueroDos<numeroTres; //10>0 && 6<30 -< true

        // ||(pipe) esto o esto es verdad entonces da verdad
        boolean relacionDos = numeroDos<0 || numeroDos<numeroCuatro; // 6<0 || 6<26 -> true

        // !(a) vuelve el resultado lo contrario, de positivo a negativo y viceversa (n1&&!n2) si la interjección es verdad da falso
        boolean relacionTres = numeroTres = !(numeroTres>numeroCuatro) && numeroCuatro> 2*numeroUno; // !(30>25) && 26>2*10 */



        ////CADENAS////
        String frase1 = "Esto es una frase a evaluar";
        String frase2 = "Esto es una frase a evaluar";
        String nombre = "EsteEsOtroNombre;";
        String correo = "micorreo@gmail.com";




        //boolean comparacionFrases = frase1 == frase2;
        //boolean comoparacionFrases frase1.equal(frase2);
        //boolean comparacionFrases = frase1.equalsIgnoreCase(frase2); //iguala sin tener en cuenta las mayúsculas
        //boolean comparacionFrases =frase1.toUpperCase().equals(frase2.toUpperCase()); //compara las 2 frases en mayusculas
        int comparacionInt = frase1.compareTo(frase2);
        int numeroCaraceteres = frase1.length();
        boolean comprobarFrase = numeroCaraceteres>0;
        char letrainicial = nombre.charAt(0);
        char letraFinal = nombre.charAt(nombre.length()-1);  //Que guapo chaval esto si que me mola, te saca la letra final SIEMPRE
        int posicionArroba = correo.indexOf("@");
        String nombreCorreo = (correo.substring(0,posicionArroba));
        

        System.out.println("El número de caracteres de frase 1 es " +numeroCaraceteres);
        System.out.println("La letra inicial de la frase uno es " +letrainicial);
        System.out.println("La letra final del nombre es " +letraFinal);
        System.out.println("La posición de la @ es "+posicionArroba);
        System.out.println("El nombre del correo es " +nombreCorreo);
        System.out.println("El dominio del correo es " + correo.substring(posicionArroba+1, correo.length()));









    }







    }







