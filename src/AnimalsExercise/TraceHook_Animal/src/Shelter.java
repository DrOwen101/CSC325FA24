public class Shelter {
	private Animal[] animals;
	
	public Shelter(Animal[] animals) {
		this.animals = animals;
	}
	
	public void displayAnimals() {
		for (Animal animal : animals) {
			animal.speak();
			animal.legCount();
			animal.findBreed();
			System.out.println(" ");
		}
	}
}
