package TaskSet2.TicketReservationSystem;

class Theater {
    private int availableSeats;

    public Theater(int totalSeats) {
        this.availableSeats = totalSeats;
    }

    public synchronized boolean reserveSeats(int numberOfSeats, String customerName) {
        if (numberOfSeats <= availableSeats) {
            availableSeats -= numberOfSeats;
            System.out.println("Customer " + customerName + " reserved " + numberOfSeats + " tickets.");
            return true;
        } else {
            System.out.println("Customer " + customerName + " couldn't reserve " + numberOfSeats + " tickets.");
            return false;
        }
    }
}

