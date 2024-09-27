public class App {
    public static void main(String[] args) {
        User user1 = new User("Buddy");
        user1.work();
        user1.rest();
        user1.logIn();
        Manager boss1 = new Manager("Candice");
        boss1.work();
        boss1.rest();
        boss1.scheduleEvaluation();
    }
}
