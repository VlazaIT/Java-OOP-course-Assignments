package TaskSet2;

public class TicketReservationSystem {
    public static void main(String[] args) {
        int totalSeats = 10; // Total seats in the theater
        Theater theater = new Theater(totalSeats);

        // Array of customer names for simulation purposes
        String[] customerNames = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hank", "Irene", "Jack"};

        // Create and start customer threads
        for (int i = 0; i < customerNames.length; i++) {
            int seatsToReserve = 1 + (int)(Math.random() * 4); // Random number of seats to reserve (1 to 4)
            Thread customerThread = new Thread(new Customer(theater, seatsToReserve, customerNames[i]));
            customerThread.start();
        }
    }
}

