package KoenTanner_Animal;

public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }

    @Override
    void move() {
        System.out.println("4 legs");
    }

}
