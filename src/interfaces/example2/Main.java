package interfaces.example2;

/*Interface is a blueprint for a class

interface defines a set of methods that a class must contain
a class can implement multiple interfaces
to define an interface in Java, we use the keyword 'interface' followed by the name of the interface
interface can only contain method signatures and constants
interface cannot contain instance variables or instance methods with a body
an interface can extend another interface*/

public class Main {

    public static void main(String[] args) {
        Driveable driveable = new Car();
        driveable.start();
        driveable.stop();
    }
}