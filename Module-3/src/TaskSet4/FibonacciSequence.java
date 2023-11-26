package TaskSet4;

// Task 2.

import java.io.*;
import java.math.*;

public class FibonacciSequence {
    public static void main(String[] args) {
        // The file path for the CSV file
        String filePath = "fibonacci_sequence.csv";

        // Generating and writing the Fibonacci sequence to the CSV file
        try (FileWriter writer = new FileWriter(filePath)) {
            // Start with the first two numbers of the sequence
            BigInteger a = BigInteger.ZERO;
            BigInteger b = BigInteger.ONE;
            writer.append(a.toString()).append("\n"); // Write the first number to the file

            // Generate the next 99 numbers
            for (int i = 1; i < 100; i++) {
                writer.append(b.toString()).append("\n");
                BigInteger next = a.add(b);
                a = b;
                b = next;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Output the file path
        System.out.println("The Fibonacci sequence has been written to " + filePath);
    }
}
