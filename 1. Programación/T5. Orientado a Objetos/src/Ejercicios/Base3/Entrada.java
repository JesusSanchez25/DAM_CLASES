package ejercicios.Base3;


public class Entrada {
    public static void main(String[] args) {

    //3. En la clase creada en el ejercicio 1 crear los siguientes métodos con la funcionalidad que se indica:
        //    - Un método que recibe por parámetros un número e incrementa la edad de la persona en el parámetro pasado por argumentos
        //    - Un método que calcule y devuelva el IMC. Para calcular el imc se aplica la siguiente formula IMC = peso / (altura * altura)

        Persona persona1 = new Persona("Jamon", "pepe", "hola",5, 60.0, 178);
        Persona persona2 = new Persona();

        persona2.incrementarEdad(20);
        persona2.mostrarDatos();
        persona1.calcularImc();


    }
}
