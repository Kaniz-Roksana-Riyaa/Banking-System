public class SavingsAccount extends Account
        implements Depositable, Withdrawable {

    private double interestRate;

    public SavingsAccount(
            String accountNumber,
            String holderName,
            double balance,
            double interestRate) {

        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    // Method overriding
    @Override
    public void accountType() {
        System.out.println("Savings Account");
    }

    // Method overriding
    @Override
    public double calculateInterest(double rate) {
        return balance * interestRate / 100;
    }

    // Interface method
    @Override
    public void depositMoney(double amount) {
        balance += amount;
        System.out.println("Money deposited into Savings Account.");
    }

    // Interface method
    @Override
    public void withdrawMoney(double amount) {

        if (amount <= balance) {
            balance -= amount;
            withdrawalMessage();
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Child-specific method
    public void showInterestRate() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}