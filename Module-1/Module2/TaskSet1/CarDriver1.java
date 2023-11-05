// Module 2.1 Task 4.

package Module2.TaskSet1;

public class CarDriver1 {
    public static void main(String[] args) {
        Car1 myCar = new Car1("Toyota Corolla");

        // Fill up the tank before starting
        myCar.fillTank();

        // Accelerate the car to at least the minimum cruise control speed
        while (myCar.getSpeed() < myCar.getMinCruiseControlSpeed()) {
            myCar.accelerate();
        }
        System.out.println("Current speed is: " + myCar.getSpeed() + " km/h.");

        // Set the target speed for cruise control
        if (myCar.setCruiseControlTargetSpeed(149)) {
            System.out.println("Target speed set successfully.");
        } else {
            System.out.println("Failed to set target speed.");
        }

        // Turn on cruise control
        if (myCar.turnOnCruiseControl()) {
            System.out.println("Cruise control activated. Target speed: " + myCar.getCruiseControlTargetSpeed() + " km/h");
            // Accelerate until cruise control speed is reached
            while (myCar.getSpeed() < myCar.getCruiseControlTargetSpeed()) {
                myCar.accelerate();
            }
            System.out.println("Current speed: " + myCar.getSpeed() + " km/h after accelerating with cruise control on.");
        } else {
            System.out.println("Could not activate cruise control. Make sure the speed is within the allowed range and there is gasoline.");
        }

        // Decelerate and check if cruise control turns off when speed drops below target
        myCar.decelerate(10);
        if (!myCar.isCruiseControlOn()) {
            System.out.println("Cruise control turned off after decelerating. Current speed: " + myCar.getSpeed() + " km/h.");
        }
    }
}










