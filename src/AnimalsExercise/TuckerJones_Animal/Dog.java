public class Dog extends Animal
{
    private short legAmount;
    private String sound;

    public Dog(String sound, short legAmount)
    {
        this.sound = sound;
        this.legAmount = legAmount;
    }
    public void makeSound()
    {
        System.out.println("Dog says " + sound);
    }

    public void move()
    {
        System.out.println("Dog walks on " + legAmount + " legs");
    }

}



