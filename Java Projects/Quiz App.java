import java.util.Scanner;

public class QuizApp {
    static Scanner scanner = new Scanner(System.in);
    static String[] questions = {
        "What is the capital of France?",
        "Which language is used for Android development?",
        "Which keyword is used to create a class in Java?"
    };
    static String[][] options = {
        {"1. Paris", "2. London", "3. Rome", "4. Madrid"},
        {"1. Python", "2. Java", "3. C++", "4. Swift"},
        {"1. function", "2. define", "3. class", "4. method"}
    };
    static int[] answers = {1, 2, 3}; // correct option numbers

    public static void main(String[] args) {
        int score = 0;
        System.out.println("=== Simple Quiz App ===");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQ" + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer (1-4): ");
            int userAnswer = scanner.nextInt();
            if (userAnswer == answers[i]) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("\nYour Score: " + score + "/" + questions.length);
    }
}
