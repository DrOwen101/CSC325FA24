import java.util.ArrayList;

class Task {
    // Unique variables to each task needed here

    // Constructor to initialize Task object with a name and duration
    public Task(String name, int duration) {
        
        // Initially, the task is not completed
    }
}

class TaskTracker {
    // List to store Task objects

    // Constructor to initialize TaskTracker object with an empty task list
    public TaskTracker() {
        
    }

    // Method to add a new task to the task list
    public void addTask(Task task) {

    }

    // Method to mark a task as completed based on its index in the list
    public void markTaskAsComplete(int index) {
        
    }

    // Method to display all tasks in the task list
    public void displayTasks() {
        
    }

    // Method to calculate the total duration of completed tasks
    public int calculateTotalDuration() {
        int totalDuration = 0;
        // loop logic goes here

        return totalDuration;
    }

    // Method to calculate the average duration of completed tasks
    public double calculateAverageDuration() {
        
    }

    // Method to find the maximum duration among completed tasks
    public int findMaxDuration() {
        
    }
}

public class TaskMasterApp {
    public static void main(String[] args) {
        // Create Task objects
        Task task1 = new Task("Complete Assignment", 30);
        //more tasks go here

        // Create TaskTracker object called "tracker"

        // Add tasks to the task list

        // Display tasks in the task list

        // Mark tasks as completed

        // Display calculated statistics
        System.out.println("Total Duration of Completed Tasks: " + tracker.calculateTotalDuration() + " minutes");
        System.out.println("Average Duration of Completed Tasks: " + tracker.calculateAverageDuration() + " minutes");
        System.out.println("Maximum Duration among Completed Tasks: " + tracker.findMaxDuration() + " minutes");
    }
}
