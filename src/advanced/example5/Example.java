package advanced.example5;

// how instance initialization Block work

public class Example {

    int x;
    int y;

    {
        x = 10;
        y = 20;
    }

    public Example() {
        System.out.println("In Constructor");
    }
}