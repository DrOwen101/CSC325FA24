package KalebGore_Animal;

public class Cat extends KalebGore_Animal.Animal {
	@Override
	public void makeSound() {
		System.out.println("Meow");
	}

	@Override
	public void move() {
		System.out.println("Walking on four legs");
	}

}
