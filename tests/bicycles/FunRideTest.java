package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FunRideTest {

    @Test
    public void shouldGetBikesType () {
      // declaring maximum allowed rides per trip.
      FunRide firstTrip = new FunRide(4);
        Tandem tandem = new Tandem();
        RoadBike roadBike = new RoadBike();
        MountainBike mountainBike = new MountainBike();

      // declaring the rides types and number that are going for a ride.
      firstTrip.accept(tandem);
      firstTrip.accept(roadBike);
      firstTrip.accept(mountainBike);
      firstTrip.accept(tandem);
      firstTrip.accept(roadBike);
      firstTrip.accept(mountainBike);

      assertEquals(2,firstTrip.getCountForType(BicycleType.TANDEM));
      assertEquals(1,firstTrip.getCountForType(BicycleType.ROADBIKE));
      assertEquals(1,firstTrip.getCountForType(BicycleType.MOUNTAINBIKE));

      System.out.println("Number of Tandem bicycle type inside the ride is: " + firstTrip.getCountForType(BicycleType.TANDEM));
      System.out.println("Number of Roadbike bicycle type inside the ride is: " + firstTrip.getCountForType(BicycleType.ROADBIKE));
      System.out.println("Number of Mountain bicycle type inside the ride is: " + firstTrip.getCountForType(BicycleType.MOUNTAINBIKE));

    }
}
