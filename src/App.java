
public class App {
    public static void main(String[] args) throws Exception {
         // Create a new student object with name JasonOwen

        Student jasonOwen = new Student("Jason", "Owen", "CS");

        Student rickMorty = new Student("Rick", "Morty", "Quantum Physics");

         // Output information about the jasonOwen object
         System.out.println("Name: " + jasonOwen.getFirstName() + " " + jasonOwen.getLastName() + " is a " + jasonOwen.getMajor() + " major.");

         // Output information about the rickMorty object
         System.out.println("Name: " + rickMorty.getFirstName() + " " + rickMorty.getLastName() + " is a " + rickMorty.getMajor() + " major.");
    }
}
