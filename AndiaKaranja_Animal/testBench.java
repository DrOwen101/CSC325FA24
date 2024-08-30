public class testBench {
    public static void main(String[] args){
        Cat mycat = new Cat("Meow", 4); 
        Dog mydog = new Dog("Woof", 4); 

        mycat.sound(); 
        mydog.sound(); 

        mycat.move(); 
        mydog.move(); 
    }

}
