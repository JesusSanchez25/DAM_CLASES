package ejercicios.ejercicioClase2.model;

import ejercicios.ejercicioClase2.controler.Empresa;

public final class Jefe extends Trabajador{

    private int acciones, beneficio;

    public Jefe() {
    }

    public Jefe(String nombre, String apellido, String dni, int acciones, int beneficio) {
        super(nombre, apellido, dni);
        this.acciones = acciones;
        this.beneficio = beneficio;
    }

    public void despedirTrabajador(String dni, Empresa empresa){
        for (Trabajador item : empresa.getTrabajadoresLista()) {
            if (item.getDni().equalsIgnoreCase(dni)){
                if (item instanceof Jefe){
                    System.out.println("El jefe no se puede despedir a sí mismo");
                    return;
                } else {
                    ((Contratados)item).setContratado(false);
                    System.out.println("Trabajador eliminado con éxito");
                    empresa.getTrabajadoresLista().remove(item);
                    return;
                }
            }
        }

    }

}
