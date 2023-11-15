package TaskSet2;

// Task 3

public class ElectricCar extends AbstractVehicle {
    private String color;
    private double energyEfficiency;

    public ElectricCar(String color, double energyEfficiency) {
        super("Electric", 0);
        this.color = color;
        this.energyEfficiency = energyEfficiency;
    }

    @Override
    public String getInfo() {
        return "Type: Electric Car\n" + super.getInfo() + "\nColor: " + color;
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging...");
    }

    @Override
    public double calculateFuelEfficiency() {
        return energyEfficiency;
    }
}
