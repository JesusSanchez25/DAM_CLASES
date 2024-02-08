import model.*;

public class Entrada {

    public static void main(String[] args) {

        //Crear una empresa
        //2. Registrar un vehículo de cada tipo
        //3. Reparar todos los vehículos que estén en el stock y puedan ser reparados
        //4. Mostrar información de todos los vehículos
        //5. Vender 3 vehículos
        //6. Mostrar la caja de la tienda

        Empresa empresa = new Empresa();

        Bicicleta bicicleta = new Bicicleta(123, 321, "abc", "cde", Estado.Seminuevo, Tipo.carrera);
        Moto moto = new Moto(1234,321,"abc","cde",Estado.Nuevo,50,"efg");
        Coche coche = new Coche(12345,321,"Panda","Seat",Estado.Usado,200,200);
        Patinete patinete = new Patinete(123456,321,"abd","Xiaomi",Estado.Nuevo,600);

        empresa.registrarVehiculo(bicicleta);
        empresa.registrarVehiculo(moto);
        empresa.registrarVehiculo(coche);
        empresa.registrarVehiculo(patinete);

        empresa.repararTodo();

        empresa.mostrarTodosVehiculos();

        empresa.venderVehiculo(coche.getNumSerie());
        empresa.venderVehiculo(bicicleta.getNumSerie());
        empresa.venderVehiculo(moto.getNumSerie());

        empresa.verCaja();


    }
}