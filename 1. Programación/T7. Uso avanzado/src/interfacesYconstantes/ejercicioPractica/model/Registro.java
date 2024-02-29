package interfacesYconstantes.ejercicioPractica.model;

public class Registro {

    private int temperatura;
    private int hora, minuto, dia, mes, anio;
    private Estaciones_ENUM estacion;

    public Registro() {
    }

    public Registro(int temperatura, int hora, int minuto, int dia, int mes, int anio, Estaciones_ENUM estacion) {
        this.temperatura = temperatura;
        this.hora = hora;
        this.minuto = minuto;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.estacion = estacion;

        if (temperatura > estacion.getTemperaturaMedia()){
            System.out.println("La temperatura introducida es superior a la media de ese mes");
            System.out.println("Desea continuar?");

        } else {
            System.out.println("Temperatura introducida correctamente");
        }
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Estaciones_ENUM getEstacion() {
        return estacion;
    }

    public void setEstacion(Estaciones_ENUM estacion) {
        this.estacion = estacion;
    }
}

