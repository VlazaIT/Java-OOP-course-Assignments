public class Car {
    private float speed;
    private float gasolineLevel;
    private String typeName;
    private float tankCapacity;
    private float topSpeed;

    // Cruise control fields
    private boolean cruiseControlOn;
    private float cruiseControlTargetSpeed;
    private static final float MIN_CRUISE_CONTROL_SPEED = 30; // Assuming a minimum speed for cruise control
    private static final float MAX_CRUISE_CONTROL_SPEED = 150; // Assuming a maximum speed for cruise control

    public Car(String typeName) {
        this(typeName, 50, 180);
    }

    public Car(String typeName, float tankCapacity, float topSpeed) {
        this.speed = 0;
        this.gasolineLevel = tankCapacity; // Assuming a full tank at the beginning
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;
        this.cruiseControlOn = false;
    }

    public void accelerate() {
        if (gasolineLevel > 0 && !cruiseControlOn) {
            // Standard acceleration
            speed = Math.min(speed + 10, topSpeed);
        } else if (cruiseControlOn) {
            // Adjust speed towards the target speed if cruise control is on
            if (speed < cruiseControlTargetSpeed) {
                speed = Math.min(speed + 10, cruiseControlTargetSpeed);
            }
        }
    }

    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            speed = Math.max(speed - amount, 0);
            if (cruiseControlOn && speed < cruiseControlTargetSpeed) {
                // If speed drops below target speed, turn off cruise control
                cruiseControlOn = false;
            }
        }
    }

    public boolean setCruiseControlTargetSpeed(float targetSpeed) {
        if (targetSpeed >= MIN_CRUISE_CONTROL_SPEED && targetSpeed <= MAX_CRUISE_CONTROL_SPEED) {
            this.cruiseControlTargetSpeed = targetSpeed;
            return true;
        }
        return false;
    }

    public float getCruiseControlTargetSpeed() {
        return cruiseControlTargetSpeed;
    }

    public boolean turnOnCruiseControl() {
        if (speed >= MIN_CRUISE_CONTROL_SPEED && speed <= topSpeed && gasolineLevel > 0) {
            cruiseControlOn = true;
            return true;
        }
        return false;
    }

    public void turnOffCruiseControl() {
        cruiseControlOn = false;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }

    public float getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        gasolineLevel = tankCapacity;
    }

    public float getGasolineLevel() {
        return gasolineLevel;
    }

    public float getTankCapacity() {
        return tankCapacity;
    }

    public float getTopSpeed() {
        return topSpeed;
    }

    public float getMinCruiseControlSpeed() {
        return MIN_CRUISE_CONTROL_SPEED;
    }
}
