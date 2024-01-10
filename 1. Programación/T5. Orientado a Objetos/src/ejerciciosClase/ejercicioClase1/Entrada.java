package ejerciciosClase.ejercicioClase1;

import ejerciciosClase.ejercicioClase1.model.Coche;
import ejerciciosClase.ejercicioClase1.model.Garaje;
import ejerciciosClase.ejercicioClase1.model.Motor;

public class Entrada {

    Garaje garaje = new Garaje();

    Motor motor = new Motor(200);
    Coche coche1 = new Coche(motor,"Jamon","Ferrari", 2.3);
    Coche coche2 = new Coche(motor,"Francisco","Lambo", 200.3);


}
