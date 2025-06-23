import java.util.Scanner;

public class ATM {
    static double balance = 1000.00;
    static int pin = 1234;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter PIN: ");
        int enteredPin = scanner.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN. Access denied.");
            return;
        }

        int choice;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Balance: $" + balance);
                case 2 -> {
                    System.out.print("Enter deposit amount: ");
                    double dep = scanner.nextDouble();
                    balance += dep;
                    System.out.println("Deposited $" + dep);
                }
                case 3 -> {
                    System.out.print("Enter withdrawal amount: ");
                    double wd = scanner.nextDouble();
                    if (wd <= balance) {
                        balance -= wd;
                        System.out.println("Withdrew $" + wd);
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter new PIN: ");
                    int newPin = scanner.nextInt();
                    pin = newPin;
                    System.out.println("PIN changed.");
                }
                case 5 -> System.out.println("Thank you for using the ATM.");
                default -> System.out.println("Invalid option.");
            }

        } while (choice != 5);
    }
}
