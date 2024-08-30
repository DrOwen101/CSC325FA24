public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[2];
		animals[0] = new Dog("Woof", "4", "Golden Retriever");
		animals[1] = new Cat("Meow", "4", "English Shorthair");
		Shelter shelter = new Shelter(animals);
		shelter.displayAnimals();
	}
}