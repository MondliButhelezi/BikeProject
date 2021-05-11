package bicycles.specification;

import bicycles.BicycleBase;

public class BicycleFromSpec extends BicycleBase {

    private final BicycleSpecification container; //container to import BicycleSpecification class properties.

    //Create a constructor to get a "container" of acceleration and brake values from BicycleSpecification class.
    public BicycleFromSpec(BicycleSpecification container) {
        this.container= container;
    }

    // Setter for setAcceleration
    @Override
    public void accelerate() {
        changeSpeed(container.getAccelerationSpeed());
    }

    //Setter for setAcceleration
    @Override
    public void brake() {
        changeSpeed(container.getBrakeSpeed());
    }
}
