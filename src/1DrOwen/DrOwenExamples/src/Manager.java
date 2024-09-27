class Manager extends Person {
    public Manager(String name) {
        super(name);
    }
    public void scheduleEvaluation() {
        System.out.println(name + " is scheduling.");
    }
}

