// Here we implement the interface ina class and use Dog and Car instances

class ActionHandler implements Actionable {

    @Override
    public void triggerSound(Animal animal) {
        animal.sound();  // Calls the abstract method 'sound' of Animal
    }

    @Override
    public void moveVehicle(Vehicle vehicle) {
        vehicle.move();  // Calls the abstract method 'move' of Vehicle
    }
}
