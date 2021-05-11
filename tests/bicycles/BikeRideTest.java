package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BikeRideTest {

    @Test
    public void shouldTakeMountainBikeRide() {
        Bicycle bicycle = new MountainBike();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        assertEquals(14,bikeRide.Velocity());
    }

    @Test
    public void shouldTakeRoadBikeRide() {
        Bicycle bicycle = new RoadBike();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        assertEquals(36,bikeRide.Velocity());
    }

    @Test
    public void shouldTakeTandemBikeRide() {
        Bicycle bicycle = new Tandem();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        assertEquals(34,bikeRide.Velocity());
    }
}
