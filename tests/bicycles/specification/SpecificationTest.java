package bicycles.specification;

import bicycles.Bicycle;
import bicycles.BikeRide;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.rides.BikeRideFast;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideSlow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecificationTest {

    // Testing RoadBike rides including; Normal, Fast and Slow rides.
    @Test
    public void shouldTakeRoadBikeRideOne() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(52, bicycle.currentSpeed());
    }

    @Test
    public void shouldTakeRoadBikeBikeRideSlow() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideSlow(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(38, bicycle.currentSpeed());
    }

    @Test
    public void shouldTakeRoadBikeBikeBikeRideFast() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideFast(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(85, bicycle.currentSpeed());
    }

    // Testing MoutainBike rides including; Normal, Fast and Slow rides.
    @Test
    public void shouldTakeMountainBikeRideOne() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(26, bicycle.currentSpeed());
    }

    @Test
    public void shouldTakeMountainBikeRideSlow() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        BikeRide bikeRide = new BikeRideSlow(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(22, bicycle.currentSpeed());
    }

    @Test
    public void shouldTakeMountainBikeRideFast() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        BikeRide bikeRide = new BikeRideFast(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(41, bicycle.currentSpeed());
    }
}
