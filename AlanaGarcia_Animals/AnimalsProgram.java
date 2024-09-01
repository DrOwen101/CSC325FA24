/* Alana Garcia
 * CSC325
 * 9/1/2024
 */

public class AnimalsProgram {
    public static void main(String[] args) throws Exception {
        Animals aDog = new Dog();
        Animals aCat = new Cat();

        aDog.sound();
        aDog.movement();

        aCat.sound();
        aCat.movement();
    }
}
