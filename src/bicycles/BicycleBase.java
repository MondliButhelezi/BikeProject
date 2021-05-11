package bicycles;

public abstract class BicycleBase implements Bicycle {
    private int speed;

    protected void changeSpeed(int speedChange) {
        speed += speedChange;
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

