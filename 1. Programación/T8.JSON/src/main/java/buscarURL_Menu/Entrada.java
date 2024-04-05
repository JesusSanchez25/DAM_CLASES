package buscarURL_Menu;

import buscarURL_Menu.controller.OperacionesJSON;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.in;

public class Entrada {
    public static void main(String[] args) {

        OperacionesJSON operacionesJSON = new OperacionesJSON();
        Scanner scanner = new Scanner(in);

        operacionesJSON.mostrarTodasLigas(operacionesJSON.lecturaAPI("https://www.thesportsdb.com/api/v1/json/3/all_leagues.php"));
        System.out.println("Inserta una temporada en la que quieras ver la clasificación");
        String liga = scanner.nextLine();

        operacionesJSON.lecturaAPI("https://www.thesportsdb.com/api/v1/json/3/search_all_teams.php?l=" + liga);



    }
}
