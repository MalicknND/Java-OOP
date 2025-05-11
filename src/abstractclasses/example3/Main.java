package abstractclasses.example3;

/*Abstract Class can contain both abstract methods and concrete methods

Abstract methods are methods that are declared without a body, and are meant to be implemented in subclasses
Concrete methods are methods that have a body, and can be directly used in the abstract class*/

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.area();
    }
}