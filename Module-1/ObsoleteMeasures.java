// Module 1.2. Task 3.

import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Weight (g): ");
        double weight = Integer.parseInt(reader.nextLine());

        double weight_leiviskä = weight / 13.28 / 32 / 20;
        double weight_naula = (weight_leiviskä - (int)(weight_leiviskä))*20;
        double weight_luoti = (weight_naula - (int)(weight_naula))*32;

        System.out.printf((int)(weight) + " grams is " + (int)(weight_leiviskä) + " leiviskä, " + (int)(weight_naula) + " naula, and %.2f luoti.\n", weight_luoti);
        reader.close();
    }
}
