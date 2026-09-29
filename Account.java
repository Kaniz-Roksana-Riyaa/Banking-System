public class Account {

    protected String accountNumber;
    protected String holderName;
    protected double balance;

    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // No parameter + no return
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    // Parameter + no return
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // No parameter + return
    public double getBalance() {
        return balance;
    }

    // Parameter + return
    public double calculateInterest(double rate) {
        return balance * rate / 100;
    }

    // This will be overridden by child classes
    public void accountType() {
        System.out.println("General Bank Account");
    }

    // Method overloading
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited integer amount: " + amount);
    }
}