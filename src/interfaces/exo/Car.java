package interfaces.exo;

// Car class implementing ElectricVehicle interface
public class Car implements ElectricVehicle {

    // Implement start method
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    // Implement stop method
    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    // Implement charge method
    @Override
    public void charge() {
        System.out.println("Car is charging");
    }
}