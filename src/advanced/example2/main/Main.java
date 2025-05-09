package advanced.example2.main;

/*Access Modifiers
* access modifiers determine the accessility of fiels and methods in a class and they are an essential par of encapsulation;
*
* */

// Public access modifier
import advanced.example2.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 100;
        student.displayId();
    }
}
