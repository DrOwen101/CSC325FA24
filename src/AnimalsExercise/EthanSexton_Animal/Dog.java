package AnimalsExercise.EthanSexton_Animal;

public class Dog extends Animal {
    //Constructors
    public Dog()
    {
        setLegs("4");
        setSound("woof");
    }

    public Dog(String sound, String legs) //In case someone's dog makes other noise/has more or less legs
    {
        setLegs(legs);
        setSound(sound);    
    }
}
