package interfaces.example6;

public class Car implements Vehicle {

    private double speed;

    public Car(double speed) {
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }
}
