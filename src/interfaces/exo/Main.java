package interfaces.exo;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.charge();
        myCar.honk();
        myCar.stop();

        Vehicle.displayType();  // Static method call on interface
    }
}
