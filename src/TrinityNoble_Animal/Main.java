package TrinityNoble_Animal;
//Done by: Trinity Noble
//01.09.24
//CS325-01-FA24
public class Main {
    public static void main(String[] args) {
        //creating instances of both cat and dog to run the methods.
        Animal d = new Dog();
        Animal c = new Cat();
        //printing the information gathered by the methods
        c.sound();
        c.num_legs();
        ///////////////////////////////////////////
        System.out.println(" ");
        d.sound();
        d.num_legs();
    }
}
