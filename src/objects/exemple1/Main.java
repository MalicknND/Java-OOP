package objects.exemple1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = "Malick Ndiaye";
        person1.age = 26;

        person2.name = "Amy SEYE";
        person2.age = 27;


        System.out.println("Person 1: " + person1.name);
        System.out.println("Person 1: " + person2.age);

        System.out.println("Person 2: " + person2.name);
        System.out.println("Person 2: " + person2.age);
    }
}
