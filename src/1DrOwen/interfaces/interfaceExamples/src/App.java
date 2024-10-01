public class App {

    // Main method: the entry point of the program
    public static void main(String[] args) {
        
        // Create an instance of the Dog class, passing the name "Buddy" to the constructor.
        // Since Dog is a subclass of Animal, we can store the object in an Animal variable.
        Animal dog = new Dog("Buddy");

        // Create an instance of the Car class, passing the model "Tesla" to the constructor.
        // Since Car is a subclass of Vehicle, we can store the object in a Vehicle variable.
        Vehicle car = new Car("Tesla");

        // Create an instance of ActionHandler, a class that implements the Actionable interface.
        // This object will be used to trigger actions (sound for animals and movement for vehicles).
        ActionHandler actionHandler = new ActionHandler();

        // Call the 'triggerSound' method of the ActionHandler object.
        // This method expects an Animal object, and here it is passed the Dog object 'dog'.
        // The method will invoke the sound behavior for the Dog ("Buddy barks").
        actionHandler.triggerSound(dog);

        // Call the 'sleep' method of the Dog object.
        // This is a concrete method defined in the Animal abstract class that outputs "Buddy is sleeping."
        dog.sleep();

        // Call the 'moveVehicle' method of the ActionHandler object.
        // This method expects a Vehicle object, and here it is passed the Car object 'car'.
        // The method will invoke the move behavior for the Car ("Tesla is moving").
        actionHandler.moveVehicle(car);

        // Call the 'stop' method of the Car object.
        // This is a concrete method defined in the Vehicle abstract class that outputs "Tesla stops."
        car.stop();
    }
}
