package classes;

// is a blueprint for creating objects
// an object is an instance of a class
public class Car {
 int speed;
 int gear;

 void changeGear(int newGear) {
  gear = newGear;
 }

 void speedUp(int increment) {
  speed += increment;
 }

 void applyBreakes(int increment) {
  speed -= increment;
 }

 int getSpeed() {
  return speed;
 }
}
