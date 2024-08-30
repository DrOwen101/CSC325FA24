
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a list of Student objects
        List<Student> students = new ArrayList<>();

        // Add Student objects to the list
        students.add(new Student("Jason", "Owen", "CS"));
        students.add(new Student("Trinity ", "Noble", "CS"));
        students.add(new Student("Susan", "Stewart", "CIS"));
        students.add(new Student("Trace", "Hook", "CS"));
        students.add(new Student("Brooklyn", "Wells", "CS"));
        students.add(new Student("Alana", "Garcia", "CS"));  //my instance
        students.add(new Student("Ethan", "Fowler", "CS"));
        students.add(new Student("Mark", "Sharovarov", "CS"));
        students.add(new Student("Ethan", "Sexton", "CS"));
        students.add(new Student("William", "Ashford", "CS"));
        students.add(new Student("Abbie", "George", "CS"));

        // Loop through the list and output information about each student
        for (Student student : students) {
            System.out.println("Name: " + student.getFirstName() + " " + student.getLastName() + " is a " + student.getMajor() + " major.");
        }
    }
}