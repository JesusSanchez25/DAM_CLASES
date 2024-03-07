package clasesAnidadas.ejercicioCasa.model;

import clasesAnidadas.ejercicioCasa.utils.Orientacion;
import clasesAnidadas.ejercicioCasa.utils.TerrenoException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Terreno {

    //Crea una aplicación para poder gestionar la construcción de una casa. Para ello crea las siguientes clases:
    //
    //- Terreno, la cual constará de los siguientes atributos y métodos:
    //    - Casa
    //    - m2
    //    - orientacion: un enum que puede tener los valores de norte, sur, este y oeste
    //    - valoración: precio en el que la casa está valorada

    //    - constructores(): los que consideres necesarios
    //    - revalorizarTerreno(): incrementará un 25% de su precio si hay una casa construida en el terreno,
    //    un 30% si además la casa es de más de 100m2 y un 50% si además tiene piscina
    //    - construirCasa(): construirá una casa en el terreno
    //    - getter y setter

    private Casa casa;
    private int m2, precio;
    private Orientacion orientacion;

    public Terreno() {
    }

    public Terreno(int m2, int precio, Orientacion orientacion) {
        // this.casa = casa; LA CASA NO, NO SE PUEDE PEDIR POR
        // PARÁMETROS PORQUE NO HA SIDO CREADA TODAVÍA
        this.m2 = m2;
        this.precio = precio;
        this.orientacion = orientacion;
        this.metrosDisponibles = m2;
    }

    public void construirCasa(int metros) throws TerrenoException{

        if (metros <= this.m2){
            casa = new Casa(metros);
            revalorizarTerreno();
            System.out.println("Casa construida con éxito en el terreno");
        } else {
            throw new TerrenoException("Esto no se puede construir porque hay poco terreno");
        }

    }

    public void revalorizarTerreno(){
        // Al construir una casa debes revalorizar el terreno según los parámetros de este método

        if (casa != null && casa.m2>=100){this.precio *= 1.3;}
        else if (casa != null) {this.precio *= 1.25;}

        if (casa.piscina){
            this.precio += this.precio*1.5;

        }
    }

    public void construirHabitacion(int metros){
        casa.construirHabitacion(metros);
    }

    public void construirAnexo(){}

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    class Casa{
        //- Existirá una clase anidad Casa con los siguientes atributos y métodos:
        //    - m2
        //    - piscina
        //    - habitaciones
        //    - constructores()
        //    - construirHabitación(metros): el parámetro indicará los m2 que ocupará dentro de la casa.
        //    Hay que comprobar que se puede construir la habitación siempre y cuando tenga m2 suficientes en la casa
        //    - construirPiscina(): creará una piscina en el terreno si no la hay ya
        //    - construirAnexo(metros): construirá un edificio extra en el terreno, siempre y cuando se pueda.
        //    Los m2 indican los metros que ocupará en el terreno.

        private int m2, habitaciones, metrosDisponibles;
        private boolean piscina;

        public Casa() {
        }

        public Casa(int m2) {
            this.m2 = m2;
            this.habitaciones = 1;
            metrosDisponibles = m2;
        }


        public void construirHabitacion(int metros) throws TerrenoException{
            if (metros>metrosDisponibles){
                throw new TerrenoException("No hay espacio suficiente para crear la habitacion");
            }
        }

        public void construirAnexo(int metros) throws TerrenoException{



            if (metros > metrosDisponibles) {
                throw new TerrenoException("No se puede construir el anexño");
            } else {
                Terreno.this.metrosDisponibles -= metros;
            }
            }
        }
        public int getM2() {
            return m2;
        }

        public void setM2(int m2) {
            this.m2 = m2;
        }

        public int getHabitaciones() {
            return habitaciones;
        }

        public void setHabitaciones(int habitaciones) {
            this.habitaciones = habitaciones;
        }

        public boolean isPiscina() {
            return piscina;
        }

        public void setPiscina(boolean piscina) {
            this.piscina = piscina;
        }
    }


}
