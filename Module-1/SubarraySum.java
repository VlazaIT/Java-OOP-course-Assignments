// Module 1.4. Task 2

import java.util.Scanner;

public class SubarraySum {
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

        /* System.out.println("Your array: ");
        for (int i=0; i<arraySize; i++) {
            System.out.println(numberArray[i] + " ");
        }*/

        int maxSum = Integer.MIN_VALUE; // keep track of the maximum subarray sum
        int currentSum = 0;             // keep track of the current subarray sum
        int start = 0;                  // keep track of the starting index
        int end = 0;                    // keep track of the ending index
        int tempStart = 0;              // keep track of the starting index of the current subarray

        for (int i = 0; i < arraySize; i++) {
            currentSum += numberArray[i];
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: " + (start + 1) + "-" + (end + 1));
    }
}
