public class Dog extends Animal {
    String sound; 
    int legs; 

    public Dog(String sound, int legs){
        this.sound = sound; 
        this.legs = legs; 
    }
    public void sound(){
        System.out.println("A dog makes the sound " + sound);
    }

    public void move(){
        System.out.println("A dog moves on " +  legs + " legs");
    }
}
