public class Student {
    // Attributes
    private String firstName;
    private String lastName;
    private String major;
 
    // Constructor
    public Student(String firstName, String lastName, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }

    // Getter and Setter methods for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter methods for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter methods for major
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
