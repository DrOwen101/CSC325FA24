package DavidMoss_Animal;

public abstract class Animal {
    public abstract String makeSound();
    public abstract int getLegs();
    
    public void move() {
        System.out.println("This animal moves on " + getLegs() + " legs.");
    }
}
