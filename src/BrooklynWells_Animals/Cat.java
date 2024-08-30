package BrooklynWells_Animals;

public class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Mrrow");
    }
    @Override
    void moving() { 
        System.out.println("4 legs");
    }

}
