package TaskSet1;

// Module 3.1. Task 2.

public class Bus extends Car {
    private int passengerCapacity;
    private int currentPassengerCount;

    public Bus(String typeName, float tankCapacity, float topSpeed, int passengerCapacity) {
        super(typeName, tankCapacity, topSpeed);
        this.passengerCapacity = passengerCapacity;
        this.currentPassengerCount = 0;
    }

    public void passengerEnter(int numberOfPassengers) {
        if (currentPassengerCount + numberOfPassengers <= passengerCapacity) {
            currentPassengerCount += numberOfPassengers;
            System.out.println(numberOfPassengers + " passengers entered. Current passenger count: " + currentPassengerCount);
        } else {
            System.out.println("Cannot enter. Exceeds capacity. Current passenger count: " + currentPassengerCount + ", Capacity: " + passengerCapacity);
        }
    }

    public void passengerExit(int numberOfPassengers) {
        if (numberOfPassengers <= currentPassengerCount) {
            currentPassengerCount -= numberOfPassengers;
            System.out.println(numberOfPassengers + " passengers exited. Current passenger count: " + currentPassengerCount);
        } else {
            System.out.println("Cannot exit. More passengers trying to exit than are on the bus. Current passenger count: " + currentPassengerCount);
        }
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getCurrentPassengerCount() {
        return currentPassengerCount;
    }

    public static void main(String[] args) {
        Bus newBus = new Bus("School Bus", 100, 120, 80);

        newBus.passengerEnter(55);
        newBus.passengerEnter(26);

        newBus.passengerExit(6);
    }
}




