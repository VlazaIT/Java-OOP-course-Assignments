package TaskSet1;

// Task 1.

public class Driving {
    public static void main(String[] args) {

        Car regularCar = new Car("Regular TaskSet1.Car", 40, 180);
        SportsCar sportsCar = new SportsCar("Sports TaskSet1.Car", 40, 250); // Example with higher top speed

        // Fill the tanks
        regularCar.fillTank();
        sportsCar.fillTank();

        // Accelerate both cars to top speed
        while (regularCar.getSpeed() < regularCar.getTopSpeed()) {
            regularCar.accelerate();
            System.out.println(regularCar.getTypeName() + ": speed is " + regularCar.getSpeed() + " km/h, gasoline level: " + regularCar.getGasolineLevel());
        }
        while (sportsCar.getSpeed() < sportsCar.getTopSpeed()) {
            sportsCar.accelerate();
            System.out.println(sportsCar.getTypeName() + ": speed is " + sportsCar.getSpeed() + " km/h, gasoline level: " + sportsCar.getGasolineLevel());
        }

        // Decelerate both cars to 0
        while (regularCar.getSpeed() > 0) {
            regularCar.decelerate(10);
            System.out.println(regularCar.getTypeName() + ": speed is " + regularCar.getSpeed() + " km/h, gasoline level: " + regularCar.getGasolineLevel());
        }
        while (sportsCar.getSpeed() > 0) {
            sportsCar.decelerate(20);
            System.out.println(sportsCar.getTypeName() + ": speed is " + sportsCar.getSpeed() + " km/h, gasoline level: " + sportsCar.getGasolineLevel());
        }    }
}
