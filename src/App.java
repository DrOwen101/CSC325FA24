
public class App {
    public static void main(String[] args) throws Exception {
         // Create a new student object with name JasonOwen
         StudentName jasonOwen = new StudentName("Jason", "Owen", 29);

         // Output information about the object
         System.out.println("Name: " + jasonOwen.getFirstName() + " " + jasonOwen.getLastName());
         System.out.println("Age: " + jasonOwen.getAge());
    }
}
