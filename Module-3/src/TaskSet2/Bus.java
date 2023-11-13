package TaskSet2;

// Task 1

public class Bus extends AbstractVehicle {

    private int capacity;

    public Bus(String fuel, int capacity) {
        super(fuel);
        this.capacity = capacity;
    }

//    @Override
//    public void start() {
//        System.out.println("Bus is starting...");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("Bus is stopping...");
//    }

    @Override
    public String getInfo() {
        return "Type: Bus\n" + super.getInfo() + "\nCapacity: " + capacity + " passengers";
    }
}
