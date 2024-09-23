class User extends Person {
    public User(String name) {
        super(name);
    }
    public void logIn() {
        System.out.println(name + " is logging in.");
    }
}