public class Main {

    public static void main(String[] args) {

        // Static method
        Bank.bankInfo();

        // Creating objects
        SavingsAccount savings =
                new SavingsAccount(
                        "S001",
                        "Riya",
                        10000,
                        5);

        CurrentAccount current =
                new CurrentAccount(
                        "C001",
                        "Joya",
                        20000,
                        100);

        // Creating Bank object
        Bank bank = new Bank();

        // Adding accounts
        bank.addAccount(savings);
        bank.addAccount(current);

        System.out.println("=== ALL ACCOUNTS ===\n");

        bank.displayAccounts();

        System.out.println("=== DEPOSIT ===\n");

        savings.deposit(2000);

        System.out.println();

        System.out.println("=== WITHDRAW ===\n");

        current.withdrawMoney(5000);

        System.out.println();

        
//polymorphism 

        Account account;

        account = new SavingsAccount(
                "S002",
                "Karim",
                15000,
                6);

        account.accountType();

        account = new CurrentAccount(
                "C002",
                "Rahim",
                25000,
                100);

        account.accountType();

        System.out.println();

        System.out.println("=== DOWNCASTING ===");

        Account a = new SavingsAccount(
                "S003",
                "Kaniz",
                12000,
                5);

        a.displayInfo();

        SavingsAccount s = (SavingsAccount) a;

        s.showInterestRate();

        System.out.println();

        System.out.println("=== INTERFACE ===");

        savings.depositMessage();
        current.withdrawalMessage();

        Depositable.bankMessage();

        System.out.println();

        System.out.println("=== CALCULATING INTEREST ===");

        double interest = savings.calculateInterest(5);

        System.out.println("Interest: " + interest);
    }
}