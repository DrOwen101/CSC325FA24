package BrooklynWells_Animals;

public class Main {
    public static void main(String[] args) {
        Animal Dog = new Dog();
        System.out.print("Dogs go: ");
        Dog.sound();
        
        System.out.print("Dogs walk with: ");
        Dog.moving();
        
        
        Animal Cat = new Cat();
        System.out.print("\nCats go: ");
        Cat.sound();
        
        System.out.print("Cats walk with: ");
        Cat.moving();
        
        
        
    }

}
