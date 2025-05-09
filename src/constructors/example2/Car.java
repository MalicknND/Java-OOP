package constructors.example2;

/*A parameterized constructor is one that you define explicitly in your class with parameters to initialize instance variables with given values.
It allows you to provide different values to distinct objects.*/

public class Car {

    private String make;
    private String model;
    private int year;

    // Parameterized constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void printInfo() {
        System.out.println("make: " + make);
        System.out.println("model: " + model);
        System.out.println("year: " + year);
    }
}