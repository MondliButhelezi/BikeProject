package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BikeRideTest {

    @Test
    public void bikeRideShouldRide() {
        Bicycle bicycle = new Bicycle();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();

//        System.out.println(bikeRide.Velocity());
        assertEquals(14,bikeRide.Velocity());
    }
}
