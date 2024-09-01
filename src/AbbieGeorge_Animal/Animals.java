package AbbieGeorge_Animal;

public abstract class Animals{
    abstract String animalType();
    abstract String noise();
    abstract int movement();

    public void printInfo(){
        System.out.println("This animal is a " + animalType() + ". The sound it makes is a " + noise() + " and it has " + movement() + " legs.");
    }
    
}

class Dog extends Animals {
    
    public String animalType(){
        return "dog";
    }

    public String noise(){
    return "bark";
    }

    public int movement(){
        return 4;
    }

}

class Cat extends Animals {
    
    public String animalType(){
        return "cat";
    }
    
    public String noise(){
    return "meow";
    }

    public int movement(){
        return 4;
    }

}

class Main {
    public static void main(String[]args){
        Animals Dog = new Dog();
        Animals Cat = new Cat();

        Dog.printInfo();
        Cat.printInfo();
    }
}
