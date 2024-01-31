package ejercicios.ejercicioClase3.model;

import ejercicios.ejercicioClase3.constantes.Constantes;

public class Nacional extends Llamada{

    char franja;

    public Nacional() {
    }

    public Nacional(int numOrigen, int numDestino, int duracion, char franja) {
        super(numOrigen, numDestino, duracion);
        this.franja = franja;

        // IMPORTANTE
        // Si no pongo esto el coste se calcula antes de establecer la franja, por lo tanto,
        // se pondia a cero
        setCoste(calcularCoste());

    }

    @Override
    public int calcularCoste() {


        switch (Character.toUpperCase(franja)){
            case 'A':
                return getDuracion()* Constantes.costeFranjaA;
            case 'B':
                return getDuracion()* Constantes.costeFranjaB;

            case 'C':
                return getDuracion()* Constantes.costeFranjaC;

            default:
                System.out.println("La franja introducida no existe");
                return 0;
        }

    }
}
