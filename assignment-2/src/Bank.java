import java.util.ArrayList;
import java.util.List;

public class Bank {

    // props

    private String name;
    private String branchLocation;
    private List<Account> accounts;

    // getters and setters

    public String getName() {
        return name;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    // constructors

    public Bank(String name, String branchLocation) {
        this.name = name;
        this.branchLocation = branchLocation;
        this.accounts = new ArrayList<>();
    }

    // methods

    public Account getAccountByNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void addAccount(String accountNumber, String accountName, double balance) {
        try {
            Account account = new Account(accountNumber, accountName, balance);
            accounts.add(account);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void viewAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            System.out.println("Account Details:");
            for (Account account : accounts) {
                System.out.println("  - Account Number: " + account.getAccountNumber());
                System.out.println("  - Account Name: " + account.getAccountName());
                System.out.println("  - Balance: $" + account.getBalance());
                System.out.println(); // add an empty line for better readability between accounts
            }
        }
    }

    public void viewAccountDetails(String accountNumber) {
        Account account = getAccountByNumber(accountNumber);
        if (account != null) {
            System.out.println("Account Details:");
            System.out.println("  - Account Number: " + account.getAccountNumber());
            System.out.println("  - Account Name: " + account.getAccountName());
            System.out.println("  - Balance: $" + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public boolean deleteAccount(String accountNumber) {
        Account account = getAccountByNumber(accountNumber);
        if (account != null) {
            return accounts.remove(account);
        } else {
            return false;
        }
    }

    public void showSummary() {
        int numAccounts = accounts.size();
        double totalBalance = 0;
        for (Account account : accounts) {
            totalBalance += account.getBalance();
        }
        double averageBalance = totalBalance / (numAccounts > 0 ? numAccounts : 1);

        System.out.println("Summary:");
        System.out.println("  - Number of Accounts: " + numAccounts);
        System.out.println("  - Total Balance: $" + totalBalance);
        System.out.printf("  - Average Balance: $%.2f\n", averageBalance);
    }
}
