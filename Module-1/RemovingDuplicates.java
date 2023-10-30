// Module 1.4. Task 3

import java.util.Scanner;

public class RemovingDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter integers into the array: ");

        int [] numberArray = new int[arraySize];

        for (int i=0; i<arraySize; i++) {
            System.out.print("Enter integer " + (i+1) + ": ");
            numberArray[i] = Integer.parseInt(scanner.nextLine());
        }

        int[] uniqueNumbers = new int[arraySize];
        int uniqueCount = 0;

        for (int i = 0; i < arraySize; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (numberArray[i] == uniqueNumbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueNumbers[uniqueCount] = numberArray[i];
                uniqueCount++;
            }
        }

        System.out.println("The array without duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueNumbers[i] + " ");
        }
    }
}
