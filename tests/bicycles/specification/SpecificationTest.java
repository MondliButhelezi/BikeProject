package bicycles.specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
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
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.ROADBIKE);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(47, bicycle.currentSpeed());
        assertEquals(BicycleType.ROADBIKE,roadBikeSpec.getBicycleType());
    }

    @Test
    public void shouldTakeRoadBikeBikeRideSlow() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.ROADBIKE);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideSlow(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(21, bicycle.currentSpeed());
        assertEquals(BicycleType.ROADBIKE,roadBikeSpec.getBicycleType());
    }

    @Test
    public void shouldTakeRoadBikeBikeBikeRideFast() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.ROADBIKE);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideFast(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(69, bicycle.currentSpeed());
        assertEquals(BicycleType.ROADBIKE,roadBikeSpec.getBicycleType());
    }

    // Testing MoutainBike rides including; Normal, Fast and Slow rides.
    @Test
    public void shouldTakeMountainBikeRideOne() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MOUNTAINBIKE);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(19, bicycle.currentSpeed());
        assertEquals(BicycleType.MOUNTAINBIKE,mountainBikeSpec.getBicycleType());
    }

    @Test
    public void shouldTakeMountainBikeRideSlow() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MOUNTAINBIKE);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        BikeRide bikeRide = new BikeRideSlow(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(6, bicycle.currentSpeed());
        assertEquals(BicycleType.MOUNTAINBIKE,mountainBikeSpec.getBicycleType());
    }

    @Test
    public void shouldTakeMountainBikeRideFast() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MOUNTAINBIKE);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        BikeRide bikeRide = new BikeRideFast(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(29, bicycle.currentSpeed());
        assertEquals(BicycleType.MOUNTAINBIKE,mountainBikeSpec.getBicycleType());
    }

    // Testing Tandem-Bike rides including; Normal, Fast and Slow rides.
    @Test
    public void shouldTakeTandemBikeRideOne() {
        BicycleSpecification tandemSpec = new BicycleSpecification(12, -7, BicycleType.TANDEM);
        Bicycle bicycle = new BicycleFromSpec(tandemSpec);
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(46, bicycle.currentSpeed());
        assertEquals(BicycleType.TANDEM,tandemSpec.getBicycleType());
    }

    @Test
    public void shouldTakeTandemBikeRideSlow() {
        BicycleSpecification tandemSpec = new BicycleSpecification(12, -7, BicycleType.TANDEM);
        Bicycle bicycle = new BicycleFromSpec(tandemSpec);
        BikeRide bikeRide = new BikeRideSlow(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(15, bicycle.currentSpeed());
        assertEquals(BicycleType.TANDEM,tandemSpec.getBicycleType());
    }

    @Test
    public void shouldTakeTandemBikeRideFast() {
        BicycleSpecification tandemSpec = new BicycleSpecification(12, -7, BicycleType.TANDEM);
        Bicycle bicycle = new BicycleFromSpec(tandemSpec);
        BikeRide bikeRide = new BikeRideFast(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(70, bicycle.currentSpeed());
        assertEquals(BicycleType.TANDEM,tandemSpec.getBicycleType());
    }
}
