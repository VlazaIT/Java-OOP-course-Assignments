// Module 1.2. Task 2

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide the first length of the leg: ");
        double first = Double.parseDouble(scanner.nextLine());

        System.out.println("Provide the second length of the leg: ");
        double second = Double.parseDouble(scanner.nextLine());

        double hypotenuse = Math.sqrt(Math.pow(first, 2)+Math.pow(second, 2));

        System.out.printf("The hypotenuse of the right triangle is %.1f\n", hypotenuse);

        scanner.close();
    }
}
