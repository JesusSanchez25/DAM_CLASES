package practicaExamen;

import practicaExamen.constantes.Constantes;
import practicaExamen.model.Peces;

public class Entrada {
    //(Animales)
    //Desarrolla una aplicación para gestionar diferentes tipos de animales en un zoológico. Cada animal tendrá ciertas características específicas. Los tipos de animales serán:
    //
    //Mamíferos: tendrán un nombre, una edad, y una cantidad de patas. Además, podrán realizar un sonido característico.
    //Aves: tendrán un nombre, una edad, y una envergadura de alas. También podrán volar.
    //Peces: tendrán un nombre, una edad, y un tipo de agua en el que viven (dulce o salada). Pueden nadar.
    //Adicionalmente, existirá una clase Zoológico que tendrá una lista de animales, donde se podrán registrar todos los animales del zoológico.
    //
    //La aplicación tendrá la capacidad de:
    //
    //Registrar un animal. Para ello preguntará si se quiere registrar un mamífero, un ave o un pez, y pedirá los datos del animal.
    //Listar animales. Para ello preguntará si se quiere listar los mamíferos, las aves, los peces o todos.
    //Mostrar datos de un animal. Para ello pedirá el nombre del animal y mostrará las características específicas del animal según su tipo.
    //Realizar un menú para gestionar todos los casos anteriores, teniendo en cuenta que:
    //
    //No puede haber dos animales con el mismo nombre en el zoológico.
    //Los mamíferos, aves y peces tendrán diferentes comportamientos según su tipo.


    public static void main(String[] args) {
        Peces pececito = new Peces(2, "Ramoncín", Constantes.aguaDulce);

        pececito.nadar();

    }



}
