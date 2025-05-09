package constructors.example1;
/*Definition: Constructors are special methods in Java used to initialize objects.
Characteristics:
Same name as the class.
No return type, not even void.
Automatically called when an object is created.
Purpose: To set initial values of instance variables.*/
public class Person {

    String name;
    int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}