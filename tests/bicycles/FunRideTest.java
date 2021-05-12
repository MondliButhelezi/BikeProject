package bicycles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FunRideTest {

    @Test
    public void shouldGetAmountOfRoadBikesType () {
      // declaring maximum allowed rides per trip.
      FunRide firstTrip = new FunRide(3);

      // declaring the rides types and number that are going for a ride.
      firstTrip.accept(BicycleType.TANDEM);
      firstTrip.accept(BicycleType.ROADBIKE);
      firstTrip.accept(BicycleType.MOUNTAINBIKE);
      firstTrip.accept(BicycleType.ROADBIKE);
      firstTrip.accept(BicycleType.ROADBIKE);
      firstTrip.accept(BicycleType.TANDEM);
      firstTrip.accept(BicycleType.MOUNTAINBIKE);
      firstTrip.accept(BicycleType.ROADBIKE);

      assertEquals(2,firstTrip.getCountForType(BicycleType.ROADBIKE));
    }

    @Test
    public void shouldGetAmountOfMountainBikesType () {
        FunRide firstTrip = new FunRide(5);

        firstTrip.accept(BicycleType.TANDEM);
        firstTrip.accept(BicycleType.ROADBIKE);
        firstTrip.accept(BicycleType.MOUNTAINBIKE);
        firstTrip.accept(BicycleType.ROADBIKE);
        firstTrip.accept(BicycleType.ROADBIKE);
        firstTrip.accept(BicycleType.TANDEM);
        firstTrip.accept(BicycleType.MOUNTAINBIKE);
        firstTrip.accept(BicycleType.ROADBIKE);

        assertEquals(2,firstTrip.getCountForType(BicycleType.MOUNTAINBIKE));
    }

    @Test
    public void shouldGetAmountOfTandemBikesType () {
        FunRide firstTrip = new FunRide(2);

        firstTrip.accept(BicycleType.TANDEM);
        firstTrip.accept(BicycleType.ROADBIKE);
        firstTrip.accept(BicycleType.MOUNTAINBIKE);
        firstTrip.accept(BicycleType.ROADBIKE);
        firstTrip.accept(BicycleType.ROADBIKE);
        firstTrip.accept(BicycleType.TANDEM);
        firstTrip.accept(BicycleType.MOUNTAINBIKE);
        firstTrip.accept(BicycleType.ROADBIKE);

        assertEquals(2,firstTrip.getCountForType(BicycleType.TANDEM));
    }
}
