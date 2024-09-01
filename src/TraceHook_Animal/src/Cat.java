public class Cat extends Animal{
	private String sound;
	private String numLegs;
	private String breed;
	public Cat(String sound, String numLegs, String breed){
		this.sound = sound;
		this.numLegs = numLegs;
		this.breed = breed;
	}

	void speak() {
		System.out.println("This animal makes this sound: " + sound);
	}

	void legCount() {
		System.out.println("This animal walks on " + numLegs + " legs");
	}

	void findBreed() {
		System.out.println("This animal is a " + breed + " breed");
	}
}
