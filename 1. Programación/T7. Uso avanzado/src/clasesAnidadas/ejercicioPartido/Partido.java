package clasesAnidadas.ejercicioPartido;


import Estaticos.model.Equipo;

public class Partido {

    //1. (Partido anidada)
    //Crea una clase Partido con las siguientes características:
    //
    //- equipoLocal y equipo visitante de tipo Equipo (clase anidada interna)
    //- jugado booleano.
    //- golesLocal, golesVisitante int
    //

    private boolean jugado;
    private int golesLocal, golesVisitante;
    private Equipo equipoLocal, equipoVisitante;

    public Partido() {
    }

    public Partido( String nombreLocal, String nombreVisitante) {

        equipoLocal = new Equipo(nombreLocal);
        equipoVisitante = new Equipo(nombreVisitante);
    }

    public void mostrarResultado(){
        System.out.printf("%s: %d vs %s: %d", equipoLocal.getNombre(), golesLocal, equipoVisitante.getNombre(), golesVisitante);
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public void iniciarPartido(){

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                agregarGoles("local");
                agregarGoles("visitante");
            }

        }

    }

    //Y los siguientes métodos
    //
    //- setter y getter
    //- agregarGolesLocal(): sumará un número aleatorio de goles entre 0 - 2 al equipo local
    //- agregarGolgesVisitante(): sumará un número aleatorio de goles entre 0 - 2 al equipo visitante
    //- mostrarResultado(): mostrará por pantalla un mensaje con el resultado actual del partido NombreVisitante: X - NombreLocal: X
    //

    public void agregarGoles(String equipo){
       if (equipo.equalsIgnoreCase("local")){
           golesLocal += (int)(Math.random()*3);
       } else if(equipo.equalsIgnoreCase("Visitante")){
           golesVisitante += (int)(Math.random()*3);

       }
    }



    public boolean isJugado() {
        return jugado;
    }

    public void setJugado(boolean jugado) {
        this.jugado = jugado;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public class Equipo {

        private String nombre;

        public Equipo(String nombre) {
            this.nombre = nombre;

            if (Partido.this.getEquipoLocal() == null){
                setEquipoLocal(this);
            } else {
                setEquipoLocal(this);

            }
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Equipo(){


        }
    }

    //Y los siguientes métodos
    //
    //- setter y getter
    //- agregarGolesLocal(): sumará un número aleatorio de goles entre 0 - 2 al equipo local
    //- agregarGolgesVisitante(): sumará un número aleatorio de goles entre 0 - 2 al equipo visitante
    //- mostrarResultado(): mostrará por pantalla un mensaje con el resultado actual del partido NombreVisitante: X - NombreLocal: X
    //
    //Crea una clase anidad Equipo con las siguientes características:
    //
    //- int puntos
    //- String nombre
    //
    //Y los siguientes métodos
    //
    //- constructor que pida por parámetros la clasificación y el nombre
    //- setter y getter
    //
    //Una clase entrada que tenga los siguiente
    //
    //- Creación de un partido
    //- Creación de dos equipos y asignados al partido
    //    - Barcelona, posición1, equipo local
    //    - Real Madrid, posición1, equipo visitante
    //- Simular el comportamiento de un parido:
    //    - En cada parte se podrán hacer 3 ataques por parte de cada equipo
    //    - Un partido consta de dos partes
    //    - En cada parte se deberá mostrar el resultado.
    //    - El equipo que se le sumarán tres puntos. Si hay empate se sumará un punto a cada uno
    //- Imprime la clasificación con el siguiente formato: 1º Barcelona 3 puntos, 2º Real Madrid 0 puntos
    //- Repite unas cuantas veces el mismo partido y comprueba si la clasificación ha cambiado




}

