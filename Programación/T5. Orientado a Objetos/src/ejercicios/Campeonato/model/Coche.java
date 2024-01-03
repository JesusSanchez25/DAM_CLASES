package ejercicios.Campeonato.model;

public class Coche {
    // la dirección tiene Parado, Recto, Izquierda y Derecha
    private int cv,velocidad, km, cc, puntos;
    private String direccion, matricula, nombre;
    private char categoria;
    // A -> cv> 200
    // B -> cv= entre 150-200
    // C -> cv< 150



    // CONSTRUCTOR
    public Coche(){}

    public Coche(String nombre, String matricula, int cv, int cc){

        this.nombre = nombre;
        this.matricula = matricula;
        this.cv = cv;
        this.cc = cc;
        this.direccion = "parado";
        categoria = categorizarCoche(cv);

        // No es necesario poner km = 0 porque es un tipo primitivo y es 0
        km = 0;





    }

    private char categorizarCoche (int cv){
        if (cv>=200){
            return  'A';
        } else if (cv>150){
            return  'B';
        } else {
            return 'C';
        }

    }

    public void mostrarDatos (){
        System.out.println("Nombre: " + nombre);
        System.out.println("matricula: " + matricula);
        System.out.println("cv: " + cv);
        System.out.println("cc: " + cc);
        System.out.println("dirección: " + direccion);
        System.out.println("km: " + km);
        System.out.println("velocidad: " + velocidad);
        System.out.println("categoría: " + categoria);


    }

    public void acelerar (int velocidad){
        this.velocidad += velocidad;

        if (this.velocidad>velocidadMax()){
            this.velocidad = velocidadMax();
        }

        // modificarDirección - 0 izq, 1 recto, 2 derecha
        int numeroGirar = (int) (Math.random()*3);
        switch (numeroGirar){

            case 0 -> this.direccion = "izquierda";
            case 1 -> this.direccion = "recto";
            case 2 -> this.direccion = "derecha";

        }


        int kmAvanza = this.velocidad;
        this.km += kmAvanza;

        // Pone el coche recto
        girar();

    }

    public int velocidadMax (){
        switch (categoria){

            case 'A' -> {return 300;}
            case 'B' -> {return 250;}
            case 'C' -> {return 200;}
            default  -> {return -1;}

        }


    }


    public void frenar (int velocidadFreno){
        this.velocidad -= velocidadFreno;

        if(this.velocidad<=0){
            this.velocidad=0;
            this.direccion = "parado";
        }

    }


    public void girar (){

        // Si está girado lo pone recto
        if (!this.direccion.equalsIgnoreCase("recto")){
            this.direccion = "recto";
        }


    }


    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getCategoria() {
        return categoria;
    }


}
