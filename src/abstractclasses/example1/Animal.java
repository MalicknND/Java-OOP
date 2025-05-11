package abstractclasses.example1;

/*An abstract class is a class that cannot be instantiated, meaning that you cannot create an object from it directly.
 However, you can extend an abstract class and create objects from the subclasses. An abstract class provides a blueprint for its subclasses.

An abstract class is a class that cannot be instantiated directly.
An abstract class provides a blueprint for its subclasses.
An abstract class can have both abstract methods and concrete methods.
Abstract methods are methods without a body, and concrete methods are methods with a body.*/
public abstract class Animal {

    String name;
    int age;
    String type;

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public abstract void makeSound();
}