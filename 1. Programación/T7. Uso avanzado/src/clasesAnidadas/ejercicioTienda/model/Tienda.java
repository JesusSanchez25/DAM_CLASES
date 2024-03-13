package clasesAnidadas.ejercicioTienda.model;

import java.util.ArrayList;

public class Tienda {
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


    private Almacen almacen;
    private ArrayList bicicletasStock,bicicletasReparar;
    private int caja;


    //    2. Métodos
    //        1. construirAlmacen(numeroPlazas): asignará un almacen a la tienda con el número de plazas indicado
    //        2. venderBicicleta(numero): venderá la bici situada en la posición indicada y mostrará sus datos.
    //        3. agregarBici(Bicicleta): agregará la bicicleta a los bicicletasStock
    //        4. repararBicicleta(Bicicleta): agregará la bicicleta a los bicicletasReparar.
    //        5. getters / setters


    public Tienda() {
    }

    public void construirAlmacen(int numeroPlazas){
        Almacen almacen1 = new Almacen(numeroPlazas);

    }

    public void agregarBici(Bicicleta bici){
        bicicletasStock.add(bici);
        System.out.println("Bicicleta agregada con éxito crack");
    }

    public void venderBicicleta(int posicion){
        try {
            bicicletasStock.remove(posicion);
            System.out.println("Bicicleta eliminada con éxito");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Que me hablas mi pana no tenemos tu bici");
        }
    }

    public void repararBicicleta(Bicicleta bici){
        if (bicicletasStock.contains(bici)){
            bicicletasStock.remove(bici);
            bicicletasReparar.add(bici);

            System.out.println("La bici está siendo reparada, cuando termine la pondremos de nuevo a la venta");
        } else {
            System.out.println("Esta bici no está en el stock pero la repararemos igual");
            bicicletasReparar.add(bici);
        }


    }



    //    3. Crea una clase anidada llamada Almacén con las siguientes características
    //        1. Atributos
    //            1. Número de plazas
    //        2. Métodos
    //            1. getters / setters

    class Almacen{

        private int numeroPlazas;

        public Almacen() {
        }

        public Almacen(int numeroPlazas) {
            this.numeroPlazas = numeroPlazas;
        }

        public int getNumeroPlazas() {
            return numeroPlazas;
        }

        public void setNumeroPlazas(int numeroPlazas) {
            this.numeroPlazas = numeroPlazas;
        }
    }


}
