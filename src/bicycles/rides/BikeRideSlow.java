package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideSlow implements BikeRide {
    public final Bicycle bicycle; // creating an instance variable and Importing methods from Bicycle class

    public BikeRideSlow(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void ride(Bicycle bicycle) {
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }
}
