package controller;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.in;

public class OperacionesJSON {

    public void lecturaAPI(){

        String urlString = "https://www.thesportsdb.com/api/v1/json/3/all_leagues.php";
        BufferedReader bufferedReader = null;
        try {
            URL url = new URL(urlString);
            //NO HACER UN NEW HTTPURLCONNECTION
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String linea = "";
            StringBuilder lecturatotal = new StringBuilder();

            while ((linea = bufferedReader.readLine()) != null){
                lecturatotal.append(linea);
            }

            JSONObject json = new JSONObject(lecturatotal.toString());
            JSONArray ligas = json.getJSONArray("leagues");

            for (int i = 0; i < ligas.length(); i++) {
                JSONObject liga = ligas.getJSONObject(i);
                if ((liga.getString("strSport")).equals("Soccer")){
                    System.out.println(ligas.getJSONObject(i).getString("strLeague"));
                }
            }
            Scanner scanner = new Scanner(in);
            System.out.println("\n\n\nDe que liga quieres ver los equipos?");
            String buscarLiga = scanner.nextLine();
            // https://www.thesportsdb.com/api/v1/json/3/search_all_teams.php?l=Belgian%20First%20Division%20A





        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
