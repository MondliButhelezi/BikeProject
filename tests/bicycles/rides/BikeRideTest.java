package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BikeRide;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BikeRideTest {

    // Normal Bike ride test *********************
    @Test
    public void shouldTakeMountainBikeRide() {
        Bicycle bicycle = new MountainBike();
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(14,bikeRide.currentSpeed());
    }

    @Test
    public void shouldTakeRoadBikeRide() {
        Bicycle bicycle = new RoadBike();
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(36,bikeRide.currentSpeed());
    }

    @Test
    public void shouldTakeTandemBikeRide() {
        Bicycle bicycle = new Tandem();
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(34,bikeRide.currentSpeed());
    }

    //Fast Bike RideTest *****************************
    @Test
    public void shouldFastTakeMountainBikeRide() {
        Bicycle bicycle = new MountainBike();
        BikeRideFast bikeRide = new BikeRideFast(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(29,bikeRide.currentSpeed());
    }

    @Test
    public void shouldTakeFastRoadBikeRide() {
        Bicycle bicycle = new RoadBike();
        BikeRideFast bikeRide = new BikeRideFast(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(69,bikeRide.currentSpeed());
    }

    @Test
    public void shouldTakeFastTandemBikeRide() {
        Bicycle bicycle = new Tandem();
        BikeRideFast bikeRide = new BikeRideFast(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(70,bikeRide.currentSpeed());
    }

    //Slow BikeRide test ***************
    @Test
    public void shouldTakeSlowMountainBikeRide() {
        Bicycle bicycle = new MountainBike();
        BikeRideSlow bikeRide = new BikeRideSlow(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(11,bikeRide.currentSpeed());
    }

    @Test
    public void shouldTakeSlowRoadBikeRide() {
        Bicycle bicycle = new RoadBike();
        BikeRideSlow bikeRide = new BikeRideSlow (bicycle);
        bikeRide.ride(bicycle);
        assertEquals(32,bikeRide.currentSpeed());
    }

    @Test
    public void shouldTakeSlowTandemBikeRide() {
        Bicycle bicycle = new Tandem();
        BikeRideSlow bikeRide = new BikeRideSlow (bicycle);
        bikeRide.ride(bicycle);
        assertEquals(27,bikeRide.currentSpeed());
    }
}
