package TaskSet1;

// Module 3.1. Task 1.

public class Car {
    private float speed;
    private float gasolineLevel;
    private String typeName;
    private float tankCapacity;
    private float topSpeed;

    private static final float ACCELERATION_CONSUMPTION_RATE = 0.5f; // Gasoline consumed on acceleration
    private static final float DECELERATION_CONSUMPTION_RATE = 0.2f; // Gasoline consumed on deceleration

    public Car(String typeName, float tankCapacity, float topSpeed) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;
    }

    public void accelerate() {
        if (gasolineLevel > ACCELERATION_CONSUMPTION_RATE && speed < topSpeed) {
            speed = Math.min(speed + 10, topSpeed);
            gasolineLevel -= ACCELERATION_CONSUMPTION_RATE;
        }
    }

    public void decelerate(int amount) {
        if (gasolineLevel > DECELERATION_CONSUMPTION_RATE) {
            speed = Math.max(speed - amount, 0);
            gasolineLevel -= DECELERATION_CONSUMPTION_RATE;
        }
    }
    float getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = tankCapacity;
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

    protected void setSpeed(float speed) {
        if (speed >= 0 && speed <= topSpeed) {
            this.speed = speed;
        }
    }

    protected void setGasolineLevel(float gasolineLevel) {
        if (gasolineLevel >= 0 && gasolineLevel <= tankCapacity) {
            this.gasolineLevel = gasolineLevel;
        }
    }
}