public class Main 
{
    public static void main(String[] args) {
        {
            Dog d = new Dog("Woof", (short)4);
            Cat c = new Cat("Meow", (short)4);

            d.makeSound();
            d.move();

            c.makeSound();
            c.move();
        }
    }    
}