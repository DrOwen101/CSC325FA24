package CSC325FA24.EthanSexton_Animal;

public class testProgram {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();
        for(Animal animal : animals) //For each animal object in the animals array, using animal as the loop variable
        {
            animal.displayLegs();
            animal.makeNoise();
        }
        

    }
    
}
