package advanced;

public class Person {

    private String name;
    private int age;

    // TODO: Add a getter for name
    public String getName(){
        return name;
    }

    // TODO: Add a setter for name

    public void setName(String name) {
        this.name = name;
    }

    // TODO: Add a getter for age

    public int getAge() {
        return age;
    }

    // TODO: Add a setter for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
