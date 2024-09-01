package JohnEnglish_Animal;

public class Cat {
    public String sound;
    public int legs;

    // Constructors
    public Cat(String sound, int legs) {
        this.sound = sound;
        this.legs = legs;
    }
    
    public Cat() {}
    
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
        System.out.println("This cat has " + getLegs() + " legs.");
    }

}
