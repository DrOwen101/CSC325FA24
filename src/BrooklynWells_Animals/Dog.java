package BrooklynWells_Animals;

public class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof!");
    }
    
    @Override
    void moving() {
        System.out.println("4 Legs");
    }
}
