package objects.example3;

public class Main {
    public static void main(String[] args) {
        // Création d'un nouvel objet Car
        Car myCar = new Car();
        myCar.modelYear = 1969;
        myCar.modelName = "Mustang";

        // anotherCar pointe vers le même objet que myCar
        Car anotherCar = myCar;

        // Affiche les informations de myCar
        System.out.println("myCar modelName: " + myCar.modelName);
        System.out.println("myCar modelYear: " + myCar.modelYear);

        // Affiche les informations de anotherCar (c'est le même objet que myCar)
        System.out.println("anotherCar modelName: " + anotherCar.modelName);
        System.out.println("anotherCar modelYear: " + anotherCar.modelYear);

        // Ici, myCar pointe vers un nouvel objet Car différent du premier
        myCar = new Car();
        myCar.modelYear = 2010;
        myCar.modelName = "Camaro";

        // Affiche les informations du nouvel objet référencé par myCar
        System.out.println("myCar modelName: " + myCar.modelName);
        System.out.println("myCar modelYear: " + myCar.modelYear);

        // anotherCar pointe toujours vers l'ancien objet (celui avec Mustang 1969)
        System.out.println("anotherCar modelName: " + anotherCar.modelName);
        System.out.println("anotherCar modelYear: " + anotherCar.modelYear);
    }
}
