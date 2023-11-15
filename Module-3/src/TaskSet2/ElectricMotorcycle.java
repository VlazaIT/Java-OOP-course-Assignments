package TaskSet2;

// Task 3

public class ElectricMotorcycle extends AbstractVehicle {
    private String color;
    private double energyEfficiency; // Energy efficiency in kWh/km

    public ElectricMotorcycle(String color, double energyEfficiency) {
        super("Electric",0);
        this.color = color;
        this.energyEfficiency = energyEfficiency;
    }

    @Override
    public String getInfo() {
        return "Type: Electric Motorcycle\n" + super.getInfo() + "\nColor: " + color;
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }

    @Override
    public double calculateFuelEfficiency() {
        return energyEfficiency;
    }
}
