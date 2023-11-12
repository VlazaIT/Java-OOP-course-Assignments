// Module 2.1 Task 2.

package Module2.TaskSet1;

public class Car {
    private float speed;
    private float gasolineLevel;
    private String typeName;
    private float tankCapacity;
    private float topSpeed;


    public Car(String typeName) {
        this(typeName, 50, 181);
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.tankCapacity = 50;
        this.topSpeed = 181;
    }

    public Car(String typeName, float tankCapacity, float topSpeed) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;
    }

    public void accelerate() {
        if (gasolineLevel > 0 && speed < topSpeed) {
            if (speed + 10 > topSpeed) {
                speed = topSpeed;
            } else {
                speed += 10;
            }
        } else{
            speed = 0;
        }
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    float getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    float getGasolineLevel() {
        return gasolineLevel;
    }

    float getTankCapacity() {
        return tankCapacity;
    }

    float getTopSpeed() {
        return topSpeed;
    }
}