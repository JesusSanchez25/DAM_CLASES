package ejercicios.ejercicioClase2;

import ejercicios.ejercicioClase2.controler.Empresa;

public class Entrada {

    public static void main(String[] args) {


        Empresa empresa = new Empresa();

        empresa.agregarTrabajador();
        empresa.agregarTrabajador();

        empresa.despedirTrabajador(empresa.hayJefe());

    }


}
