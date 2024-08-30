package KalebGore_Animal;

public class Dog extends KalebGore_Animal.Animal {
	@Override
	public void makeSound() {
		System.out.println("Woof");
	}

	@Override
	public void move() {
		System.out.println("Running on four legs");
	}

}
