package buscarURL_Basico.controller;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import static java.lang.System.in;

public class OperacionesJSON {

    public void lecturaAPI(){

        String urlString = "";
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

            //IMPORTANTE PASAR EL STRING BUILDER A STRING
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
            urlString = "https://www.thesportsdb.com/api/v1/json/3/search_all_teams.php?l=" + buscarLiga;
            url = new URL(urlString);


            connection = (HttpURLConnection) url.openConnection();
            System.out.println(connection.getURL());
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            linea = "";
            lecturatotal = new StringBuilder();

            while ((linea = bufferedReader.readLine()) != null){
                lecturatotal.append(linea);
            }

            json = new JSONObject(lecturatotal.toString());
            JSONArray equipos = json.getJSONArray("teams");

            for (int i = 0; i < equipos.length(); i++) {
                if (equipos.getJSONObject(i).getString("strStadium").equals("Estadio Diego Armando Maradona")){
                    System.out.println(equipos.getJSONObject(i).getString("strTeam"));

                }
            }




        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
