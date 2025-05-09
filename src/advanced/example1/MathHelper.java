package advanced.example1;
/* The static keyword in java is used to indicate that a member belongs a class rather than to an instance of the class
* in other words, a static member is shared by all objects of the class rather than being to specific object
*
* staatic keyword can also be used with variables, which are called static or class variables. they are shared by all instances of the class,
* and are accessed using the class name, just like static methods
* */

public class MathHelper {

    static double PI = 3.141;

    static int square(int num) {
        return num * num;
    }
}
