package DavidMoss_Animal;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        System.out.println("Dog: " + dog.makeSound());
        dog.move();
        
        System.out.println("Cat: " + cat.makeSound());
        cat.move();
    }
}