public class CurrentAccount extends Account implements Depositable, Withdrawable {

    private double transactionFee;

    public CurrentAccount(
            String accountNumber,
            String holderName,
            double balance,
            double transactionFee) {

        super(accountNumber, holderName, balance);
        this.transactionFee = transactionFee;
    }

    @Override
    public void accountType() {
        System.out.println("Current Account");
    }

    @Override
    public double calculateInterest(double rate) {
        return 0;
    }

    @Override
    public void depositMoney(double amount) {
        balance += amount;
        System.out.println("Money deposited into Current Account.");
    }

    @Override
    public void withdrawMoney(double amount) {

        if (amount + transactionFee <= balance) {

            withdrawalMessage();

            balance -= amount + transactionFee;
            System.out.println("Withdrawal successful.");
            System.out.println("Transaction fee: " + transactionFee);
        } 
        else {
            withdrawalMessage();
            System.out.println("Insufficient balance.");
        }
    }

    // Child-specific method
    public void showTransactionFee() {
        System.out.println("Transaction Fee: " + transactionFee);
    }
}