package AnimalsExercise.EthanSexton_Animal;

public class Cat extends Animal{
    public Cat()
    {
        setLegs("4");
        setSound("meow");
    }

    public Cat(String sound, String legs) //In case someone's cat makes other noise/has more or less legs
    {
        setLegs(legs);
        setSound(sound);    
    }
}
