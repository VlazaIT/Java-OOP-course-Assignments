// Module 1.3. Task 3.

import java.util.Scanner;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number1;
        int number2;

        do {
            System.out.print("Provide the first number: ");
            number1 = Integer.parseInt(reader.nextLine());
            System.out.print("Provide the second number: ");
            number2 = Integer.parseInt(reader.nextLine());

            if (number1 >= number2) {
                System.out.println("The first number should be less than the second number.");
            }
            if (number1 <= 0 || number2 <= 0) {
                System.out.println("Both numbers should be non-negative, and greater than 0.");
            }
        } while ((number1 >= number2) || (number1 <= 0) || (number2 <= 0));

        System.out.println("Prime numbers between " + number1 + " and " + number2 + " are:");
        for (int i = number1; i <= number2; i++) {
            if (i > 1) {
                int j;
                for (j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        break;
                    }
                }
                if (j * j > i) {
                    System.out.println(i);
                }
            }
        }
    }
}