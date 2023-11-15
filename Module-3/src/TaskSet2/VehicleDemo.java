package TaskSet2;

// Task 1,2,3,4.

    public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car1 = new Car("petrol", "white", 22.0);
        Vehicle motorcycle1 = new Motorcycle("petrol", "blue", 43.0);
        Vehicle bus = new Bus("diesel", 85, 47.0);
        Vehicle electricCar = new ElectricCar("green", 0.15);
        Vehicle electricMotorcycle = new ElectricMotorcycle("yellow", 0.24);

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
        if (vehicle instanceof ElectricVehicle) {
            ((ElectricVehicle) vehicle).charge();
            System.out.println("Energy Efficiency: " + vehicle.calculateFuelEfficiency() + " kWh/km");
        } else {
            System.out.println("Fuel Efficiency: " + vehicle.calculateFuelEfficiency() + " mpg");
        }
        System.out.println(vehicle.getInfo() + "\n");
    }
}
