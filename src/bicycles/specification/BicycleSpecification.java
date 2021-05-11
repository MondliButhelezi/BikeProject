package bicycles.specification;

import bicycles.BicycleType;

public class BicycleSpecification {

    private int accelerationSpeed;
    private int brakeSpeed;
    private BicycleType bicycleType;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;
    }

    // Getter for acceleration speed
    public int getAccelerationSpeed() {
        return accelerationSpeed;
    }

    // Getter for brake speed
    public int getBrakeSpeed() {
        return brakeSpeed;
    }

    // Getter for bicycleType
    public BicycleType getBicycleType() {
        return bicycleType;
    }
}
