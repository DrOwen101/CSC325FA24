package JohnEnglish_Animal;

public class Dog extends Animal{

    public String sound;
    public int legs;

    // Constructors
    public Dog(String sound, int legs) {
        this.sound = sound;
        this.legs = legs;
    }

    public Dog(){}

    // Getters
    public String getSound() {
        return sound;
    }

    public int getLegs() {
        return legs;
    }
    // Methods
    public void makeSound() {
        System.out.println(getSound());
    }

    public void legCount() {
        System.out.println("This dog has " + getLegs() + " legs.");
    }

}
