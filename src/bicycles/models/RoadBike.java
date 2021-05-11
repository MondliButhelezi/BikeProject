package bicycles.models;

import bicycles.Bicycle;

public class RoadBike implements Bicycle {
    private int speed;

    @Override
    public void accelerate() {
        speed += 11;
    }

    @Override
    public void brake() {
        speed -= 4;
    }

    @Override
    public int currentSpeed() {
        System.out.println("Your current speed is " + speed + " km/h");
        return speed;
    }

    @Override
    public void stop() {
        speed = 0;
    }
}
