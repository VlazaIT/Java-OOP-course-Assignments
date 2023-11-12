package TaskSet1;

// Task 1.

public class SportsCar extends Car {

    private static final float SPORTS_ACCELERATION_CONSUMPTION_RATE = 1.0f; // Higher gasoline consumption on acceleration
    private static final float SPORTS_DECELERATION_CONSUMPTION_RATE = 0.3f; // Higher gasoline consumption on deceleration

    public SportsCar(String typeName, float tankCapacity, float topSpeed) {
        super(typeName, tankCapacity, topSpeed);
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > SPORTS_ACCELERATION_CONSUMPTION_RATE && getSpeed() < getTopSpeed()) {
            setSpeed(Math.min(getSpeed() + 20, getTopSpeed())); // Increased acceleration
            setGasolineLevel(getGasolineLevel() - SPORTS_ACCELERATION_CONSUMPTION_RATE);
        }
    }

    @Override
    public void decelerate(int amount) {
        if (getGasolineLevel() > SPORTS_DECELERATION_CONSUMPTION_RATE) {
            setSpeed(Math.max(getSpeed() - (amount * 2), 0)); // Increased deceleration
            setGasolineLevel(getGasolineLevel() - SPORTS_DECELERATION_CONSUMPTION_RATE);
        }
    }

}
