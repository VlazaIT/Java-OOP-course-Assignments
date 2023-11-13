package TaskSet2;

// Task 1

public class Motorcycle extends AbstractVehicle {

    private String color;

    public Motorcycle(String fuel, String color) {
        super(fuel);
        this.color = color;
    }

//    @Override
//    public void start() {
//        System.out.println("Motorcycle is starting...");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("Motorcycle is stopping...");
//    }

    @Override
    public String getInfo() {
        return "Type: Motorcycle\n" + super.getInfo() + "\nColor: " + color;
    }
}
