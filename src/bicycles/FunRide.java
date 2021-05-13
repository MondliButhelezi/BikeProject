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
    private List<Bicycle> BicycleList = new ArrayList<Bicycle>();

    public void accept(Bicycle bicycle) { // accepts number of bikes that will go for a ride.
        // getBicycle enables to use the method from BicycleType enum to...
        // ...be used inside the accept method, and enables addition to the BicycleList.

        if (BicycleList.size() >= maxAllowedRides ) {
            System.out.println("You have reached the maximum of rides allowed, please try again later.");
        } else {
                BicycleList.add(bicycle);
                System.out.println("You have added a bike ride to the bicycle list.");
            }
    }

    public int getEnteredCount(BicycleType tandem) { // counts the number of bikes that have entered the ride and returns the number.
        return BicycleList.size();
    }

    public int getCountForType (BicycleType bikeType) { // tells how many of a certain bike type entered the ride.
        int rideCount = 0;
        String getBicycle = bikeType.getBikeRideType();

        for (Bicycle bike : BicycleList) {
//            System.out.println(bike.bicycle().getBikeRideType());
            if (bike.bicycle().getBikeRideType() == getBicycle) {
                rideCount++;
            }
        }
        return rideCount;
    }

}

