package bicycles.specification;

public class BicycleSpecification {

    private int accelerationSpeed;
    private int brakeSpeed;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
    }

    // Getter for acceleration speed
    public int getAccelerationSpeed() {
        return accelerationSpeed;
    }

    // Getter for brake speed
    public int getBrakeSpeed() {
        return brakeSpeed;
    }
}
