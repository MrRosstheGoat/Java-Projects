package bank;

public class BankAccount {
    String owner;
    double balance;
    
    BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }
    
    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    
    void withdraw(double amount){
        if (amount > balance)
            System.out.println("Insufficient balance");
        else{
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    
    void displayBalance(){
        System.out.println(owner + " 's balance: $" + balance);
    }
}