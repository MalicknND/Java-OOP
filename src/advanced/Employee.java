package advanced;

/*Advanced Classes and Objects - Access modifiers
In this exercise, you will practice using different access modifiers in Java. You will complete the Employee class by declaring fields with different access levels and implementing methods to interact with these fields.

Declare a public field named name to store the employee's name.

Declare a private field named salary to store the employee's salary.

Declare a field named department with the default access modifier to store the employee's department.

Implement a public method named displayDetails that prints the employee's name, salary, and department.

Provide a 'getter' method for the 'salary' field (getSalary())

Provide a 'setter' method for the 'salary' field (setSalary(double salary))

*/

public class Employee {

    // TODO: Declare a public field for name (String)
    // TODO: Declare a private field for salary (double)
    // TODO: Declare a field with default access modifier for department (String)


    public String name; // Public field
    private double salary; // Private field
    String department; // Default access modifier

    // TODO: Implement a public method to display employee details
    /*
        Format:

        Name: [name]
        Salary: [salary]
        Department: [department]
    */
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    // TODO: Implement a getter for private field salary
    public double getSalary() {
        return salary;
    }
    // TODO: Implement a setter for private field salary
    public void setSalary(double salary){
        this.salary = salary;
    }
}
