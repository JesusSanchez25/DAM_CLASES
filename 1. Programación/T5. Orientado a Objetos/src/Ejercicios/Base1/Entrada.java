package ejercicios.Base1;

public class Entrada {
    public static void main(String[] args) {

        //1. Crea una clase llamada persona con los siguientes elementos
        //    - Propiedades: nombre (string) apellido (string) dni (string) edad (int) peso (double) altura (int)
        //    - Métodos:
        //        - mostrarDatos: sacará por pantalla los datos de la persona formateados
        //        - Métodos getters y setters asociados
        //        - Constructores:
        //            - un constructor que permita crear una persona con todos los datos
        //            - un constructor que permita crear una persona sin peso ni altura
        //            - un constructor que permita crear una persona con nombre y apellidos, el resto de
        //            datos los pondrá a 0, excepto el dni que lo pondrá a 111111111X
        //            - un constructor que permita crear una persona sin datos de entrada. Los inicializará
        //            todos a "datos por defecto", 1111111111X y 0 respectivamente



        Persona persona1 = new Persona("Jamon", "pepe", "hola",5);
        Persona persona2 = new Persona();

        persona2.mostrarDatos();



    }

}
