package genericos.EjGenericosComparables;

public class Coche implements Comparable<Coche>{

    //Crea una clase llamada Coche con marca, modelo y cv.
    // Dicha clase implemente Comparable la cual se ordena por CV.
    // Dicha clase tendrá constructor, getter, setter y mostrar datos
    private String marca, modelo;
    private int cv;
    public Coche() {
    }

    public Coche(String marca, String modelo, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
    }

    public void mostrarDatos(){
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("cv: " + cv);
    }

    @Override
    public int compareTo(Coche o) {
        if (cv<o.getCv()){
            return -1;
        } else if(cv>o.getCv()){
            return 1;
        } else {
            return 0;
        }

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
}
