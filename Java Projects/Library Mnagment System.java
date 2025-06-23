import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title, author;
    int id;
    boolean isAvailable;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void display() {
        System.out.println("ID: " + id + " | Title: " + title + " | Author: " + author + " | Available: " + (isAvailable ? "Yes" : "No"));
    }
}

public class LibrarySystem {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> viewBooks();
                case 3 -> borrowBook();
                case 4 -> returnBook();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option.");
            }
        } while (choice != 5);
    }

    static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        books.add(new Book(id, title, author));
        System.out.println("Book added.");
    }

    static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book b : books) {
            b.display();
        }
    }

    static void borrowBook() {
        System.out.print("Enter Book ID to borrow: ");
        int id = scanner.nextInt();
        for (Book b : books) {
            if (b.id == id) {
                if (b.isAvailable) {
                    b.isAvailable = false;
                    System.out.println("You borrowed: " + b.title);
                } else {
                    System.out.println("Book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    static void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int id = scanner.nextInt();
        for (Book b : books) {
            if (b.id == id) {
                if (!b.isAvailable) {
                    b.isAvailable = true;
                    System.out.println("Book returned.");
                } else {
                    System.out.println("Book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
