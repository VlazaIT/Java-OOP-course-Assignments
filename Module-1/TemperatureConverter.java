// Module 1.2. Task 1.

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Write down a temperature in °F: ");
        double temperature = (Double.parseDouble(reader.nextLine()) - 32)*5/9;

        System.out.printf("The temperature in °C is: %.1f\n", temperature);

        reader.close();
    }
}
