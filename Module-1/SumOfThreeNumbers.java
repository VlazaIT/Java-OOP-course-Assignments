// Module 1.1. Task 3

import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third) + "\nThe product of the numbers is " + (first * second * third) + "\nThe average of the numbers is " + String.format("%.2f",((double)(first + second + third)/3)));
        // I have done every required action (product and average) directly from the printing. I have used \n for moving the text to the next row, String.format to cut the average to 2 characters only, and double to change the average to the double format.
    }
}