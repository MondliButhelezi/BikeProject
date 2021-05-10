package bicycles;

public class BikeRide {
    public final Bicycle bicycle; // creating an instance variable and Importing methods from Bicycle class

    public BikeRide(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    public int Velocity() {
        return this.bicycle.currentSpeed();
    }
}
