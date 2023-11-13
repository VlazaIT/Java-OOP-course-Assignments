package TaskSet2;

// Task 1

public class Car extends AbstractVehicle {
    private String color;

    public Car(String fuel, String color) {
        super(fuel);
        this.color = color;
    }
//    @Override
//    public void start() {
//        System.out.println("Car is starting...");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("Car is stopping...");
//    }

    @Override
    public String getInfo() {
        return "Type: Car\n" + super.getInfo() + "\nColor: " + color;
    }

}
