package TaskSet2.TicketReservationSystem;

class Customer implements Runnable {
    private Theater theater;
    private int seatsToReserve;
    private String name;

    public Customer(Theater theater, int seatsToReserve, String name) {
        this.theater = theater;
        this.seatsToReserve = seatsToReserve;
        this.name = name;
    }

    @Override
    public void run() {
        theater.reserveSeats(seatsToReserve, name);
    }
}

