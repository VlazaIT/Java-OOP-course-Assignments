package TaskSet2;

// Task 1,2,3.

    public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car1 = new Car("petrol", "white");
        Vehicle motorcycle1 = new Motorcycle("petrol", "blue");
        Vehicle bus = new Bus("diesel", 85);
        Vehicle electricCar = new ElectricCar("green");
        Vehicle electricMotorcycle = new ElectricMotorcycle("yellow");

        System.out.println("Vehicle Demonstration\n");

        demoExecution(car1);
        demoExecution(motorcycle1);
        demoExecution(bus);
        demoExecution(electricCar);
        demoExecution(electricMotorcycle);
    }

    private static void demoExecution(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
        if (vehicle instanceof ElectricVehicle electric) {
            electric.charge();
        }
        System.out.println(vehicle.getInfo() + "\n");
    }
}
