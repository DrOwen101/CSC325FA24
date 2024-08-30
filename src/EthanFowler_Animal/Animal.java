public abstract class Animal {
    public String sound;
    public short legs;

    public void makeSound(String sound) {
        System.out.println(sound);
    }
    public String toString() {
        return "This animal moves on " + legs + " legs and makes a " + sound + " sound.";
    }
}