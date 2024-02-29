package interfacesYconstantes.EjercicioTrabajadores;

import interfacesYconstantes.EjercicioTrabajadores.model.*;

public class Entrada {

    public static void main(String[] args) {

        Asalariado asalariado = new Asalariado("Hola", "Hola" ,"hola", 123, 123, true);
        Autonomo autonomo = new Autonomo("hola", "Hola", "123213", 123, 213, false);
        Jefe jefe = new Jefe("peter", "fra cs", "dfs12M", 123, 213213, 50);
        Directivo directivo = new Directivo("directivo", "peter", "12312M", 213);
        Accionista accionista = new Accionista("accionista", "francis", "sdafM", 123);

        Empresa empresa = new Empresa();

        empresa.agregarPersona(asalariado);
        empresa.agregarPersona(jefe);
        empresa.agregarPersona(autonomo);
        empresa.agregarPersona(directivo);
        empresa.agregarPersona(accionista);


        empresa.realizarVotacion();
    }






    }



