// Module 1.4. Task 1

import java.util.Random;
import java.util.Scanner;
public class NameGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] firstNames = {"Bob", "Elisa", "Lilly", "Will"};
        //System.out.println(firstNames.length);
        String[] lastNames = {"Smith", "Potter", "Johnson", "Seagull", "Heikkinen"};
        //System.out.println(lastNames.length);

        System.out.print("How many random names do you want? ");
        int nameNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < nameNumber; i++) {
            String randomName = firstNames[random.nextInt(firstNames.length)];
            String randomSurname = lastNames[random.nextInt(lastNames.length)];
            System.out.println(i+1 + ". " + randomName + " " + randomSurname);
        }
    }
}
