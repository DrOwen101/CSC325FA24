package JacksonCash_Animal;

abstract class Animal {
    abstract String sound();
    abstract String moving();
}
class Dog extends Animal {
    
    String sound() {
        return "\"Woof!\"";
    }
    String moving() {
        return "four";
    }
}
class Cat extends Animal {
    String sound() {
        return "\"Meow!\"";
    }
    String moving() {
        return "four";
    }
}
class Main {
    public static void main(String[] args) {
        Animal dog=new Dog();
        Animal cat=new Cat();
        System.out.println("A dog says " + dog.sound() + " and moves on " + dog.moving() + " legs.");
        System.out.println("A cat says " + cat.sound() + " and moves on " + cat.moving() + " legs.");
    }
}