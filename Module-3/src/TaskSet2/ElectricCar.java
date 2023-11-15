package TaskSet2;

// Task 3

public class ElectricCar extends AbstractVehicle {
    private String color;

    public ElectricCar(String color) {
        super("Electric");
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Type: Electric Car\n" + super.getInfo() + "\nColor: " + color;
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging...");
    }

}
