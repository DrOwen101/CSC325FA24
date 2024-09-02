package KoenTanner_Animal;

public class Main {
    public static void main(String[] args) {
        Animal Dog = new Dog();
        System.out.print("Dogs go ");
        Dog.makeSound();

        System.out.print("Dogs walk on ");
        Dog.move();

        Animal Cat = new Cat();
        System.out.print("Cats go ");
        Cat.makeSound();

        System.out.print("Cats walk on ");
        Cat.move();
    }    

}
