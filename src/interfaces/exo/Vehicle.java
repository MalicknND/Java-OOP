package interfaces.exo;

// Vehicle interface with start, stop, honk, and displayType methods
public interface Vehicle {

    // Define start method
    void start();

    // Define stop method
    void stop();

    // Default honk method
    default void honk() {
        System.out.println("Honking...");
    }

    // Static displayType method
    static void displayType() {
        System.out.println("Vehicle Type");
    }
}