package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModelsTest {

    @Test
    public void MountainBikeTest() {
        MountainBike mountain = new MountainBike();
        mountain.accelerate();
        mountain.brake();
        assertEquals(2,mountain.currentSpeed());
    }

    @Test
    public void RoadBikeTest() {
        RoadBike road = new RoadBike();
        road.accelerate();
        road.brake();
        assertEquals(7,road.currentSpeed());
    }
}
