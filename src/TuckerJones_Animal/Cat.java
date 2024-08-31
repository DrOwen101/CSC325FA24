public class Cat extends Animal
{
    private short legAmount;
    private String sound;

    public Cat(String sound, short legAmount)
    {
        this.sound = sound;
        this.legAmount = legAmount;
    }
    public void makeSound()
    {
        System.out.println("Cat says " + sound);
    }

    public void move()
    {
        System.out.println("Cat walks on " + legAmount + " legs");
    }
}


