package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide {

    private final int maxAllowedRides;

    // constructor specifying max allowed rides, to be entered in test.
    public FunRide(int maxAllowedRides) {
        this.maxAllowedRides = maxAllowedRides;
    }

    // An array list that has roadBike, mountainBike and tandem.
    // This list is created by methods stored in BicycleType enum.
    private List<String> BicycleList = new ArrayList<>();

    public void accept(BicycleType bikeType) { // accepts number of bikes that will go for a ride.
        String getBicycle = bikeType.getBikeRideType();
        // getBicycle enables to use the method from BicycleType enum to...
        // ...be used inside the accept method, and enables addition to the BicycleList.

        if (BicycleList.size() >= maxAllowedRides) {
            System.out.println("You have reached the maximum of rides allowed, please try again later.");
        } else {
            this.BicycleList.add(getBicycle);
            System.out.println("You have added another bicycle type");
        }
    }

    public int getEnteredCount(BicycleType tandem) { // counts the number of bikes that have entered the ride and returns the number.
        System.out.println("The number of bikes that have entered rides is " + BicycleList.size());
        return BicycleList.size();
    }

    public int getCountForType (BicycleType bikeType) { // tells how many of a certain bike type entered the ride.
        int rideCount = 0;
        String getBicycle = bikeType.getBikeRideType();

        for (int bike=0; bike < BicycleList.size(); bike++) {
            if (BicycleList.get(bike) == getBicycle) {
                rideCount++;
            }
        }
        return rideCount;
    }

}

