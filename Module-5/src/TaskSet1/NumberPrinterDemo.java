package TaskSet1;

public class NumberPrinterDemo {
    public static void main(String[] args) {
        int maxNumber = 20;

        // Create Runnable objects
        Runnable oddPrinter = new OddNumberPrinter(maxNumber);
        Runnable evenPrinter = new EvenNumberPrinter(maxNumber);

        // Create threads
        Thread oddThread = new Thread(oddPrinter);
        Thread evenThread = new Thread(evenPrinter);

        // Start threads
        oddThread.start();
        evenThread.start();

        // Wait for both threads to finish
        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final message
        System.out.println("Printing complete.");
    }
}


