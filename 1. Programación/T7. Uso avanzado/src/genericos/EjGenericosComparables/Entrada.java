package genericos.EjGenericosComparables;

public class Entrada {

    public static void main(String[] args) {

        MiColeccion coleccionCoches = new MiColeccion<Coche>();
        Coche coche = new Coche("Tesla","334Q", 200);
        Coche coche2 = new Coche("Tesla","334Q", 250);
        Coche coche3 = new Coche("Tesla","334Q", 150);
        Coche coche4 = new Coche("Tesla","334Q", 50);

        coleccionCoches.agregarElemento(coche);
        coleccionCoches.agregarElemento(coche2);
        coleccionCoches.agregarElemento(coche3);
        coleccionCoches.agregarElemento(coche4);

        System.out.println("El coche con más caballos es: " + ((Coche)coleccionCoches.encontrarMaximo()).getMarca());


        MiColeccion coleccionUsuarios = new MiColeccion<Usuario>();
        Usuario usuario = new Usuario("Paco","NoRubio","p@gmail.com",23);
        Usuario usuario2 = new Usuario("Paquito","NoRubio","p@gmail.com",33);
        Usuario usuario3 = new Usuario("Pedro","NoRubio","p@gmail.com",2);
        Usuario usuario4 = new Usuario("Juan","NoRubio","p@gmail.com",202);

        coleccionUsuarios.agregarElemento(usuario);
        coleccionUsuarios.agregarElemento(usuario2);
        coleccionUsuarios.agregarElemento(usuario3);
        coleccionUsuarios.agregarElemento(usuario4);

        System.out.println("La persona más vieja es: " + ((Usuario)coleccionUsuarios.encontrarMaximo()).getNombre());



    }

}
