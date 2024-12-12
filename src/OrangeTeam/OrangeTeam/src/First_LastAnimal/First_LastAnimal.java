public abstract class Animal 
{
    public abstract void makeSound();
    public abstract void move();
}

public class Dog extends Animal {
    
    public void makeSound()
    {
        System.out.println("The dog barks.");
    }

    
    public void move() 
    {
        System.out.println("The dog moves on 4 legs.");
    }
}

public class Cat extends Animal 
{
    
    public void makeSound() 
    {
        System.out.println("The cat meows.");
    }

    
    public void move() 
    {
        System.out.println("The cat moves on 4 legs.");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println("Dog:");
        dog.makeSound();
        dog.move();

        System.out.println("\nCat:");
        cat.makeSound();
        cat.move();
    }
}
