package CSC325FA24.EthanSexton_Animal;

abstract class Animal{ 

    private String sound;
    private String legs;

    //Constructors
    public Animal(String sound, String legs)
    {
        this.sound = sound;
        this.legs = legs;
    }
    public Animal(){}
    //Accessors and Mutators
    public String getSound()
    {
        return sound;
    }
    public void setSound(String sound)
    {
        this.sound = sound;
    } 
    public String getLegs()
    {
        return legs;
    }
    public void setLegs(String legs)
    {
        this.legs = legs;
    }
    
    //Printing Sound/Legs
    public void makeNoise()
    {
        System.out.println(getSound());
        
    }
    public void displayLegs()
    {
        System.out.println(getLegs());
    }
}
