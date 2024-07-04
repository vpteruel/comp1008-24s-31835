public class Account {

    // props

    private String accountNumber;
    private String accountName;
    private double balance;

    // getters and setters

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    // constructors

    public Account(String accountNumber, String accountName, double balance) {
        if (isValidAccountNumber(accountNumber)) {
            this.accountNumber = accountNumber;
        } else {
            throw new IllegalArgumentException("Invalid account number: Alphanumeric characters only");
        }

        if (isValidAccountName(accountName)) {
            this.accountName = accountName;
        } else {
            throw new IllegalArgumentException("Invalid account name: Alphabetical characters, spaces and hyphens only");
        }

        if (isValidBalance(balance)) {
            this.balance = balance;
        } else {
            throw new IllegalArgumentException("Invalid balance: Must be non-negative");
        }
    }

    // methods

    private boolean isValidAccountNumber(String accountNumber) {
        return accountNumber.matches("[a-zA-Z0-9]+");
    }

    private boolean isValidAccountName(String accountName) {
        return accountName.matches("^[a-zA-Z\\s-]+$");
    }

    private boolean isValidBalance(double balance) {
        return balance >= 0;
    }
}
