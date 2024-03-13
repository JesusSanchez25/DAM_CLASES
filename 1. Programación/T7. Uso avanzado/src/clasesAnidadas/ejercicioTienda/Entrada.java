package clasesAnidadas.ejercicioTienda;

import clasesAnidadas.ejercicioTienda.Utils.TamanioBici;
import clasesAnidadas.ejercicioTienda.Utils.TipoBici;
import clasesAnidadas.ejercicioTienda.model.Bicicleta;

public class Entrada {
    public static void main(String[] args) {


        //10 (Tienda) Anidada
        //
        //Desarrolla una aplicación que tenga las siguientes características:
        //2. Crear una clase Tienda que tenga las siguientes características
        //    1. Atributos
        //        1. almacen: Almacen
        //        2. bicicletasStock: ArrayList
        //        3. bicicletasReparar: ArrayList
        //        4. caja: int
        //    2. Métodos
        //        1. construirAlmacen(numeroPlazas): asignará un almacen a la tienda con el número de plazas indicado
        //        2. venderBicicleta(numero): venderá la bici situada en la posición indicada y mostrará sus datos.
        //        3. agregarBici(Bicicleta): agregará la bicicleta a los bicicletasStock
        //        4. repararBicicleta(Bicicleta): agregará la bicicleta a los bicicletasReparar.
        //        5. getters / setters
        //    3. Crea una clase anidada llamada Almacén con las siguientes características
        //        1. Atributos
        //            1. Número de plazas
        //        2. Métodos
        //            1. getters / setters
        //3. Crea una clase Entrada donde se pueda
        //    1. Crear una tienda de bicis
        //    2. Crea un almacén en la tienda creada con 2 plazas.
        //    3. Agregar 4 bicis en stock. La forma de repararla será cualquiera
        //    4. Lleva a la tienda una bici que tenga 27 velocidades, 29 pulgadas, un tamaño L y es de tipo MTB. Para reparar esta bici es necesario cambiar su estado, incrementarle en 2 sus velocidades. Reparar esta bici cuesta un número double aleatorio entre 100 y 200 euros multiplicado por 2
        //    5. Lleva a la tienda otra bici que tenga 2 velocidades, 27 pulgadas, un tamaño M y es de tipo paseo. Para reparar esta bici es necesario cambiar su estado, incrementarle en 1 sus velocidades y subirle en 2 las pulgadas. Reparar esta bici cuesta un número int aleatorio entre 50 y 100 euros
        //    6. Lleva a la tienda otra bici que tenga 8 velocidades, 24 pulgadas, un tamaño S y es de tipo carretera. Para reparar esta bici es necesario cambiar su estado, incrementarle en 4 sus velocidades y subirle en 5 las pulgadas. Reparar esta bici cuesta un número int aleatorio entre 150 y 250 euros
        //- Tan solo se podrá admitir una bici si el almacén tiene plazas. En el caso de no tener plazas saltará una excepción.
        //1. Muestra por consola todos los datos de las bicis que están en stock
        //2. Repara todas las bicis y muestra por consola sus datos. Cada vez que se repara una bici se debe meter en la caja el coste
        //3. Genera un número aleatorio que esté entre 1 y 20. Vende la bici situada en el número aleatorio generado. Cada vez que se vende una bici se debe meter en caja el coste Se deberá capturar el fallo si se intenta acceder a una bici que no existe


        Bicicleta bicicleta = new Bicicleta(TipoBici.PASEO, TamanioBici.S,12,23,true);

        bicicleta.reparar();
    }
}
