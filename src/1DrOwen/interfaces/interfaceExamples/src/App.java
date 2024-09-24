public class App {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Vehicle car = new Car("Tesla");

        ActionHandler actionHandler = new ActionHandler();

        // Trigger sound for Dog
        actionHandler.triggerSound(dog);
        dog.sleep();  // Concrete method from the abstract class Animal

        // Move the Car
        actionHandler.moveVehicle(car);
        car.stop();  // Concrete method from the abstract class Vehicle
    }
}
