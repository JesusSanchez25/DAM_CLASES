package ejerciciosClase.ejercicioClase7;

import ejerciciosClase.ejercicioClase7.controler.Partido;
import ejerciciosClase.ejercicioClase7.model.Equipo;

public class Entrada {
    //1. **(Equipo)**
    //
    //Desarrollar una clase Equipo que tenga las siguientes características:
    //
    //- Un atributo de tipo String que sea el nombre
    //- Tres atributos de tipo int que sean el nivelAtaque, nivelCentro y nivelDefensa
    //- Un atributo int que sean los goles
    //- Un constructor que pida por parámetros un nombre y que tenga la siguiente funcionalidad:
    //    - Inicialice el nombre al pasado por parámetros
    //    - Inicialice el nivel de ataque a un número aleatorio entre 0 y 100
    //    - Inicialice el nivel de centro a un número aleatorio entre 0 y 100
    //    - Inicialice el nivel de defensa a un número alaatorio entre 0 y 100
    //    - Inicialice los goles a 0
    //- Un constructor que pida por parámetros un storing (nombre) y tres enteros (niveles de ataque medio y defensa)
    // y que tenga la siguiente funcionalidad:
    //    - Inicialice el nombre al pasado por parámetros
    //    - Inicialice el nivel de ataque al número pasado
    //    - Inicialice el nivel de centro al número pasado
    //    - Inicialice el nivel de defensa al número pasado
    //- Un método atacar que no reciba nada por parámetros y retorne un booleano. La funcionalidad será la siguiente
    //    - Retornará true (se ha metido gol) si el resultado de la operación de (nivelAtaque * (aleatorio entre 0-1)
    //    + (nivelCentro * aleatorio entre 0-1)/2) es superior a 90. Además sumará uno a la variable goles
    //    - Retornará false en el resto de los casos
    //
    //Desarrollar una clase Entrada que tenga la siguiente funcionalidad:
    //
    //- Crear dos equipos:
    //    - (EquipoA) construido con el constructor que pide un nombre
    //    - (EquipoB) construido con el constructor que pide un nombre y tres int
    //- Realizar un ataques sucesivos del EquipoA y el EquipoB. Tras cada uno de los ataques mostrar el
    // siguiente mensaje "El resultado es EqupoA X - EqiuipoB X)
    //- Tras realizar 3 ataques de cada equipo y mostrar el resultado definitivo
    //
    //**MODIFICACIÓN**
    //
    //Desarrollar una clase Jugador que tenga las siguientes características:
    //
    //- Atributo de tipo String (nombre)
    //- Atributo de tipo String (posicion)
    //- Atributo de tipo boolean (estrella)
    //- Atributo de tipo int (calidad)
    //- Crear un constructor que pida por parámetro un nombre, una posición, y una calidad. Se iniciará los
    // atributos a los parámetros pasados. El atributo estrella será true si la calidad es superior a 90, sino será false.
    //- Un método mostrarDatos que imprima por pantalla los datos del jugador
    //
    //Modificar la clase Equipo para que tenga:
    //
    //- Un atributo de tipo Arraylist que se inicialice a vacío en todos los constructores
    //- Un método que no devuelva nada y que pida por parámetros un objeto de tipo jugador. El método agregará
    // a la lista de jugadores el pasado por parámetros
    //- Un método que sea listarDelateros que no devuelva nada y muestre por consola los datos de los delantros
    //
    //Crear una clase partido que tenga los siguientes atributos;
    //
    //- Dos atributos de tipo equipo
    //- un atibuto de tipo boolean. Representa si el partido se esta jugando o está terminado
    //- un atributo de tipo int. Representa en que parte está
    //- Un constructor con los dos equipos pasados por parámetros
    //- Un método iniciarPartido: realiza tres ataques por cada parte
    //- Un método mostrarResultado: muestra el resultado final del partido: EquipoA XX - Equipo B XX
    //
    //Implementar una funcionalidad para:
    //
    //- Cuando un equipo ataca marcará gol cuando su método atacar sea true y su niven de ataque sea mayor que el
    // nivel de defensa del contrario







    public static void main(String[] args) {
        // Crear dos equipos
        Equipo equipoA = new Equipo("EquipoA");
        Equipo equipoB = new Equipo("EquipoB", 75, 60, 80);

        Partido partido = new Partido(equipoA, equipoB);
        partido.iniciarPartido();
    }



}
