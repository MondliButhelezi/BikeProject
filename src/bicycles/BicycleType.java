package bicycles;

public enum BicycleType {
    ROADBIKE("ROADBIKE"),
    MOUNTAINBIKE("MOUNTAINBIKE"),
    TANDEM("TANDEM");

    // Methods below will be used as parameters of the three enums properties above.

    private final String bikeRideType;
    // final because I do want the value to change after being instantiated.

    BicycleType (String bikeRideType) {
        this.bikeRideType = bikeRideType;
    }

    public String getBikeRideType() {
        return bikeRideType;
    }
}
