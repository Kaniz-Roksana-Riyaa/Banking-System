public interface Depositable {

    double MINIMUM_DEPOSIT = 100;

    void depositMoney(double amount);

    default void depositMessage() {
        System.out.println("Deposit operation started.");
    }

    static void bankMessage() {
        System.out.println("Welcome to the deposit service.");
    }

    private void helper() {
        System.out.println("Private interface helper.");
    }
}