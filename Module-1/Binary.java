// Module 1.3. Task 2.

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryNumber;

        do {
            System.out.print("Give a number: ");
            binaryNumber = scanner.nextLine();

            double number = 0.0;
            for (int i = 0; i < binaryNumber.length(); i++) {
                if (binaryNumber.charAt(i) == '1') {
                    number += Math.pow(2.0, binaryNumber.length() - 1 - i);
                }
            }
            System.out.println("The decimal number for the binary number entered is: "+ (int)number);
        } while (binaryNumber.length() != 0);
    }
}
