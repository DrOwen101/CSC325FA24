abstract class Vehicle {
    String model;

    public Vehicle(String model) {
        this.model = model;
    }

    // Abstract method
    public abstract void move();

    // Concrete method
    public void stop() {
        System.out.println(model + " stops.");
    }
}
