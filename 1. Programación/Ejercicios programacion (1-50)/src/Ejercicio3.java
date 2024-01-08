public class Ejercicio3 {

    //Hágase un programa en el que se declare constantes locales con tu nombre completo,
    //la dirección de tu casa (sólo la calle), el número del portal, el piso, la letra del piso, el
    //código postal, la localidad, la provincia y el país. Muéstrese por consola dichos datos
    //almacenados en las constantes como si fuera la dirección a la que se enviaría una
    //carta. (Direccion)



    public static void main(String[] args) {

        //3. Hágase un programa en el que se declare constantes locales con tu nombre completo,
        //la dirección de tu casa (sólo la calle), el número del portal, el piso, la letra del piso, el
        //código postal, la localidad, la provincia y el país. Muéstrese por consola dichos datos
        //almacenados en las constantes como si fuera la dirección a la que se enviaría una
        //carta. (Direccion)


        new Ejercicio3().local();


    }

    public void local(){
        final String nombreCompleto = "Jesús Sánchez Pedraza";
        final String calle = "Inspector Juan Antonio Bueno";
        final String numeroPortal = "nº4";
        final String piso = ",5";
        final String letraPiso = "D";
        final String codigoPostal = "28923 ";
        final String localidad = "Alcorcón";
        final String provincia = "Madrid";
        final String país = "España";

        System.out.println("Sistema");
        System.out.println(nombreCompleto);
        System.out.println("C/" +calle + numeroPortal + piso + letraPiso);
        System.out.println(codigoPostal + localidad);
        System.out.println(provincia);
        System.out.println(país);


    }





    }

