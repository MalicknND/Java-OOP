package advanced;

/*Advanced Classes and Objects - 'static' keyword
In this exercise, you will practice using the static keyword in Java. You need to:

Define a static variable PI with the value of 3.14 in the MathHelper class.

Define a static method square in the MathHelper class that takes an integer and returns its square.

In the main method, print the value of the static variable PI and the result of calling the static method square with the argument 5.

Uncomment the lines in the main method to test your implementation.*/

public class MathHelper {

    // TODO: Define a static variable called 'PI' with the value of 3.14
    // TODO: Define a static method 'square' that takes an integer and returns its square
    static double PI = 3.14;
    static int square (int num){
        return num * num;
    }

    public static void main(String[] args) {
        // TODO: Uncomment the lines below after implementing the static variable and method
        System.out.println("The value of PI is: " + MathHelper.PI);
        int result = MathHelper.square(5);
        System.out.println("The square of 5 is: " + result);
    }
}
