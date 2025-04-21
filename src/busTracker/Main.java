package busTracker;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[] busIds = {"Bus1", "Bus2", "Bus3"};
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        Random random = new Random();

        try (FileWriter fw = new FileWriter("gps_data.csv")){
        for (String busId : busIds) {
            LocalDateTime fecha = LocalDateTime.of(2025, 4, 21, 8, 0); //Fecha concreta (21/04/2025 8:00)
            for (int i = 0; i < 60; i++) {
                double lat = 37.35 + random.nextDouble() * 0.1; //La latitud de Sevilla está entre 37.35 y 37.45
                double lon = -6.0 + random.nextDouble() * 0.1; //La longitud de Sevilla está entre -6.00 y -5.90
                double speed = random.nextDouble() * 50; //Velocidad entre 0 y 50 km/h.

                String timestamp = fecha.format(dtf);
                GPSData gpsData = new GPSData(busId, timestamp, lat, lon, speed);
                fw.write(gpsData.toString() + "\n");
            }
        }
        fw.close();
        System.out.println("Datos GPS simulados guardados en gps_data.csv");
    } catch (IOException e) {
            e.printStackTrace();
        }
}}
