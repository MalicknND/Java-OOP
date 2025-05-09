package advanced.example3;

import advanced.example2.Student;

// Private modifier
public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.id = 1001;
        // Compilation error
        student.displayId();
    }
}