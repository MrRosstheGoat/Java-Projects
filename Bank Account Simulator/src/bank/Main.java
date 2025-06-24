package bank;
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Tanatswa", 500);
        acc.displayBalance();
        acc.deposit(200);
        acc.withdraw(100);
        acc.displayBalance();
    }
    
}