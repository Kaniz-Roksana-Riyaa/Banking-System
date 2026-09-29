import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();

    // Add account
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Display all accounts
    public void displayAccounts() {

        for (Account account : accounts) {

            account.accountType();
            account.displayInfo();

        }
    }

    // Static method
    public static void bankInfo() {
        System.out.println("\nWelcome to ABC Bank.");
    }

    // Find account
    public Account findAccount(String accountNumber) {

        for (Account account : accounts) {

            if (account.accountNumber.equals(accountNumber)) {
                return account;
            }
        }

        return null;
    }
}