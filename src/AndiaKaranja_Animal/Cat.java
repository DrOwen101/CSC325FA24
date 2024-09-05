package AndiaKaranja_Animal;


    public class Cat extends Animal {
        String sound; 
        int legs; 
    
        public Cat(String sound, int legs){
            this.sound = sound; 
            this.legs = legs; 
        }
    
        public void sound(){
            System.out.println("A cat makes the sound " + sound);
        }
    
        public void move(){
            System.out.println("A cat moves on " +  legs + " legs");
        }
    }
