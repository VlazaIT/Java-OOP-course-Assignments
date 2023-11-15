package TaskSet2;

// Task 3

public class ElectricMotorcycle extends AbstractVehicle {
    private String color;

    public ElectricMotorcycle(String color) {
        super("Electric");
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Type: Electric Motorcycle\n" + super.getInfo() + "\nColor: " + color;
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }
}
