package model;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Vehiculo> listaVehiculos;
    private int caja;

    public Empresa() {
        this.listaVehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo){

        for (Vehiculo item : listaVehiculos) {
            if (item.getNumSerie()== vehiculo.getNumSerie()){
                System.out.println("Error, ese número de serie ya ha sido introducido antes");
                return;
            }
        }
        listaVehiculos.add(vehiculo);
        System.out.println("Vehiculo añadido con éxito");

    }



    public void mostrarTodosVehiculos(){
        for (Vehiculo item : listaVehiculos) {
            item.mostrarDatos();
            System.out.println("");
        }
    }

    public void reparar(int numeroSerie){
        for (Vehiculo item : listaVehiculos) {
            if (item instanceof Reparable && item.getNumSerie()==numeroSerie){
                ((Reparable) item).reparar();
            } else if(item.getNumSerie()==numeroSerie && !(item instanceof Reparable)){
                System.out.println("Ese tipo de vehículo no es reaparable aquí");
            }
        }
    }

    public void repararTodo(){
        for (Vehiculo item : listaVehiculos) {
            if (item instanceof Reparable){
                ((Reparable) item).reparar();
            }
        }
    }

    public void venderVehiculo(int numeroSerie){
        for (Vehiculo item : listaVehiculos) {
            if (item.getNumSerie()==numeroSerie){
                listaVehiculos.remove(item);
                caja+= item.getPrecio();
                System.out.println("El vehiculo con el número de serie: " + item.getNumSerie() +
                        " ha sido vendido por " + item.getPrecio());
                return;
            }
        }
        System.out.println("no se ha encontrado vehículo");
    }

    public void verCaja(){
        System.out.println("La caja actual es de: " + caja + "€");
    }




    // todo vender 3 vehiculos y sumar a la caja
}
