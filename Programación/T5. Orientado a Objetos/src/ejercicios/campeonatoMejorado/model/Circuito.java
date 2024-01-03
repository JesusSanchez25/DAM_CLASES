package ejercicios.campeonatoMejorado.model;


import java.util.ArrayList;

public class Circuito {
    private String nombre;

    private int kmTotales, vueltas, record, curvas;

    private ArrayList<Integer> localizacionCurvas;






    public Circuito(){}

    public Circuito(String nombre, int kmTotales, int vueltas, int curvas){
        this.nombre = nombre;
        this.kmTotales = kmTotales;
        this.vueltas = vueltas;
        this.curvas = curvas;
        this.localizacionCurvas = new ArrayList<Integer>();
        // record = 0;

        // Se asigna automáticamente la localización de las curvas en el circuito según el número de curvas que haya
        int distanciaEntreCurvas;

        try {distanciaEntreCurvas = this.kmTotales/this.curvas;} catch (Exception e){distanciaEntreCurvas = 0;}


        // Divide el circuito en el número de curvas y asigna curvas de forma equitativa en tod el circuito
        // El +1 pq hay 1 curva que está al final y no se usa
        for (int i = 0; i < this.curvas+1; i++) {
            localizacionCurvas.add((distanciaEntreCurvas)*(i+1));
        }



        }








    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
    }

    public int getVueltas() {
        return vueltas;
    }

    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public int getCurvas() {
        return curvas;
    }

    public void setCurvas(int curvas) {
        this.curvas = curvas;
    }

    public ArrayList<Integer> getLocalizacionCurvas() {
        return localizacionCurvas;
    }

    public void setLocalizacionCurvas(ArrayList<Integer> localizacionCurvas) {
        this.localizacionCurvas = localizacionCurvas;
    }
}


