// Module 2.1 Task 2.

package Module2.TaskSet1;

public class CarDriver {

    public static void main(String[] args) {

        Car myCar = new Car("Toyota Corolla");
        Car yourCar = new Car("Ford Focus", 54, 155);
        System.out.println(yourCar.getTypeName() + " tank capacity is " + yourCar.getTankCapacity() + " , and top speed is: " + yourCar.getTopSpeed());
        yourCar.fillTank();

        while(yourCar.getSpeed() < yourCar.getTopSpeed()) {
            yourCar.accelerate();
            System.out.println(yourCar.getTypeName() + ": speed is " + yourCar.getSpeed() + " km/h");
        }

        while(yourCar.getSpeed() > 0) {
            yourCar.decelerate(15);
            System.out.println(yourCar.getTypeName() + ": speed is " + yourCar.getSpeed() + " km/h");
        }

//        myCar.fillTank();
//
//        while(myCar.getSpeed() < myCar.getTopSpeed()) {
//            myCar.accelerate();
//            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
//        }
//
//        while(myCar.getSpeed() > 0) {
//            myCar.decelerate(15);
//            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
//        }

    }
}