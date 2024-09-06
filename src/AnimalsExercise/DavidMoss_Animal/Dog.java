package DavidMoss_Animal;

public class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Bark";
    }

    @Override
    public int getLegs() {
        return 4;
    }
}
