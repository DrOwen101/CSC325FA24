//In this interface we use methods from both the Dog class and the Vehicle Class

interface Actionable {
    void triggerSound(Animal animal);  // Uses abstract class Animal
    void moveVehicle(Vehicle vehicle); // Uses abstract class Vehicle
}
