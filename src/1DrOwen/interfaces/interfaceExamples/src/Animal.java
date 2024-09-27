abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    // Abstract method
    public abstract void sound();

    // Concrete method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
