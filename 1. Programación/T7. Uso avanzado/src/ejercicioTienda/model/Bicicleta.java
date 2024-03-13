package ejercicioTienda.model;

import ejercicioTienda.Utils.TamanioBici;
import ejercicioTienda.Utils.TipoBici;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public abstract class Bicicleta {
    //Desarrolla una aplicación que tenga las siguientes características:
    //
    //1. Una clase bicicleta con las siguientes características
    //    1. Atributos
    //        1. tipo: string – mtb, carretera, paseo
    //        2. velocidades: int
    //        3. pulgadas: int
    //        4. tamanio: string – S, M, L
    //        5. estado: boolean
    //    2. Métodos
    //        1. constructores()
    //        2. mostrarDatos()
    //        3. reparar(): el método devolverá un integer o un double (nada más), dependiendo de la creación de la bici.
    //        El método será abstracto.
    //        4. getters / setters

    private TipoBici tipo;
    private TamanioBici tamanio;
    private int velocidades, pulgadas;
    private boolean estado;

    public Bicicleta() {
    }



    public Bicicleta(TipoBici tipo, TamanioBici tamanio, int velocidades, int pulgadas, boolean estado) {
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.velocidades = velocidades;
        this.pulgadas = pulgadas;
        this.estado = estado;
    }


    public void mostrarDatos(){
        System.out.println("Tipo: " + tipo.getNombre());
        System.out.println("Tamaño: " + tamanio.getNombre());
        System.out.println("Velocidades: " + velocidades);
        System.out.println("Pulgadas: " + pulgadas);
        System.out.println("Estado: " + estado);
    }

    //3. reparar(): el método devolverá un integer o un double (nada más), dependiendo de la creación de la bici.
    //        El método será abstracto.

    public abstract double reparar();

    public TipoBici getTipo() {
        return tipo;
    }

    public void setTipo(TipoBici tipo) {
        this.tipo = tipo;
    }

    public TamanioBici getTamanio() {
        return tamanio;
    }

    public void setTamanio(TamanioBici tamanio) {
        this.tamanio = tamanio;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
