
abstract class Animal{ 
   
    private String legs;
    private String sound;
   
    
    public Animal(String legs, String sound)
    {
        this.legs = legs;
        this.sound = sound;
    }
    public Animal(){}
    
    public String getLegs()
    {
        return legs;
    }
    public void setLegs(String legs)
    {
        this.legs = legs;
    }
    public String getSound()
    {
        return sound;
    }
    public void setSound(String sound)
    {
        this.sound = sound;
    } 
    

    public void displayLegs()
    {
        System.out.println(getLegs());
    }
    public void makeNoise()
    {
        System.out.println(getSound());
        
    }
    
}