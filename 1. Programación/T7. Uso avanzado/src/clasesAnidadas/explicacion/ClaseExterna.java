package clasesAnidadas.explicacion;

public class ClaseExterna {

    private String datoUNo;
    private int datoDos;
    private ClaseInterna claseInterna;


    public ClaseExterna() {
    }

    public ClaseExterna(String datoUNo, int datoDos) {
        this.datoUNo = datoUNo;
        this.datoDos = datoDos;
    }

    public void mostrarDatosExterno(){
        System.out.println("datoUno: " + datoUNo);
        System.out.println("datoDos: " + datoDos);
    }

    public void ejecutarHijo(ClaseInterna claseInterna){
        claseInterna.mostrarDatosInternos();
    }


    public String getDatoUNo() {
        return datoUNo;
    }

    public void setDatoUNo(String datoUNo) {
        this.datoUNo = datoUNo;
    }

    public int getDatoDos() {
        return datoDos;
    }

    public void setDatoDos(int datoDos) {
        this.datoDos = datoDos;
    }

    public ClaseInterna getClaseInterna() {
        return claseInterna;
    }

    public void setClaseInterna(ClaseInterna claseInterna) {
        this.claseInterna = claseInterna;
    }

    public class ClaseInterna{

        private  String datoUnoInterno;
        private  int datoDosInterno;

        private ClaseExterna claseExterna;

        public ClaseInterna(String datoUnoInterno, int datoDosInterno, ClaseExterna claseExterna){
           this.datoUnoInterno = datoUnoInterno;
           this.datoDosInterno = datoDosInterno;
           this.claseExterna = claseExterna;
           claseExterna.setClaseInterna(this);

        }

        public void mostrarDatosInternos(){
            System.out.println("datoUno: " + datoUnoInterno);
            System.out.println("datoDos: " + datoDosInterno);
        }

        public void mostrarPadre(){
            ClaseExterna.this.mostrarDatosExterno();
        }



    }




}
