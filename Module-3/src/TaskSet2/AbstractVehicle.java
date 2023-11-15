package TaskSet2;

// Task 2.

public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    public String fuelType;
    public double fuelEfficiency;

    public AbstractVehicle(String fuelType, double fuelEfficiency) {
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle is stopping...");
    }

    @Override
    public String getInfo() {
        return "Fuel Type: " + fuelType;
    }

    @Override
    public void charge() {
        System.out.println("This vehicle cannot be charged.");
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }
}
