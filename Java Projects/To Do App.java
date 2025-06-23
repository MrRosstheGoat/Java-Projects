import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    static ArrayList<String> tasks = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> deleteTask();
                case 4 -> System.out.println("Exiting To-Do App...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }

    static void addTask() {
        System.out.print("Enter task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added.");
    }

    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Your Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    static void deleteTask() {
        viewTasks();
        if (!tasks.isEmpty()) {
            System.out.print("Enter task number to delete: ");
            int index = scanner.nextInt() - 1;
            if (index >= 0 && index < tasks.size()) {
                tasks.remove(index);
                System.out.println("Task deleted.");
            } else {
                System.out.println("Invalid task number.");
            }
        }
    }
}
