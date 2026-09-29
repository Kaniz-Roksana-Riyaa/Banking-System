public interface Withdrawable {

    void withdrawMoney(double amount);

    default void withdrawalMessage() {
        System.out.println("Withdrawal operation started.Wait for Confirmation...");
    }
}