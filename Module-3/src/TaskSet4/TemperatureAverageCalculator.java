package TaskSet4;

// Task 1.

import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*;

public class TemperatureAverageCalculator {
    public static void main(String[] args) {
        String urlString = "https://users.metropolia.fi/~jarkkov/temploki.csv";
        String targetDate = "01.01.2023";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        try {
            URL url = new URL(urlString);
            try (InputStreamReader inputStream = new InputStreamReader(url.openStream());
                 BufferedReader reader = new BufferedReader(inputStream)) {

                String line = reader.readLine();
                double totalTemperature = 0;
                int count = 0;

                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(";");
                    String datePart = parts[0];
                    String[] dateAndTime = datePart.split("\\s+"); // Split by whitespace to separate date and time
                    String dateString = dateAndTime[0];

                    if (dateString.equals(targetDate)) {
                        String[] temperatureParts = parts[1].split("\t"); // Split by tab to get temperature values
                        String temperatureWithComma = temperatureParts[0];
                        String temperature = temperatureWithComma.replace(',', '.'); // Replace comma with dot
                        double outsideTemp = Double.parseDouble(temperature.split(";")[0]); // Get the part before semicolon
                        totalTemperature += outsideTemp;
                        count++;
                    }
                }

                if (count > 0) {
                    double averageTemperature = totalTemperature / count;
                    System.out.println("Average temperature for " + targetDate + " is: " + String.format("%.3f", averageTemperature) + " degrees based on " + count + " measurements");
                } else {
                    System.out.println("No data available for " + targetDate);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

