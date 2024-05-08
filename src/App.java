
public class App {
    public static void main(String[] args) throws Exception {
         // Create a new student object with name JasonOwen

        Student jasonOwen = new Student("Jason", "Owen", "CS");

         // Output information about the jasonOwen object
         System.out.println("Name: " + jasonOwen.getFirstName() + " " + jasonOwen.getLastName() + " is a " + jasonOwen.getMajor() + " major.");
    }
}
