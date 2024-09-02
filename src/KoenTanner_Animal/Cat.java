package KoenTanner_Animal;

public class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }

    @Override
    void move() {
        System.out.println("4 Legs");
    }

}
