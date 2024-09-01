package AbbieGeorge_Animal;

public abstract class Animals{
    abstract String noise();
    abstract int movement();

    public void printInfo(){
        System.out.println("This animal's sound is " + noise() + " and it has " + movement() + " legs.");
    }
    
}

class Dog extends Animals {
    
    public String noise(){
    return "Bark";
    }

    public int movement(){
        return 4;
    }

}

class Cat extends Animals {
    
    public String noise(){
    return "Meow";
    }

    public int movement(){
        return 4;
    }

}
