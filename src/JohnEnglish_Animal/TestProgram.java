package JohnEnglish_Animal;

public class TestProgram {
    public static void main(String[] args) {

        // Instantiates objects of the different Animal subclasses
        Dog dog1 = new Dog("Woof!", 4);
        Cat cat1 = new Cat("Meow!", 4);
        
        // Outputs Animal atributes
        System.out.println();
        dog1.makeSound();
        dog1.legCount();
        System.out.println();
        cat1.makeSound();
        cat1.legCount();
        System.out.println();

    }
}
