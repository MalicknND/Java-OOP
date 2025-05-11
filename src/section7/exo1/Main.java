package section7.exo1;

/*Interfaces are used when we want to define a contract that must be implemented by multiple classes.
*
* Abstract classes are used when we want to provide a common base class with some common behavior.
* */

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.printInfo();
    }
}