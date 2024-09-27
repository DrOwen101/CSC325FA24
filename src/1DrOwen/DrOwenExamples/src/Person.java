class Person {
    protected String name;
    public Person(String name) {
        this.name = name;
    }
    public void work() {
        System.out.println(name + " is working.");
    }
    public void rest() {
        System.out.println(name + " is resting.");
    }
}

