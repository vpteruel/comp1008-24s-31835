import java.util.Scanner;

public class BankRunner {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Enter Bank Name: ");
        String bankName = scanner.nextLine();

        System.out.print("Enter Branch Location: ");
        String branchLocation = scanner.nextLine();

        Bank bank = new Bank(bankName, branchLocation);

        System.out.println("Welcome to " + branchLocation + " of " + bankName);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Account");
            System.out.println("2. View Accounts");
            System.out.println("3. View Account Details");
            System.out.println("4. Delete Account");
            System.out.println("5. Summary");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    addAccount(bank);
                    break;
                case 2:
                    viewAccounts(bank);
                    break;
                case 3:
                    viewAccountDetails(bank);
                    break;
                case 4:
                    deleteAccount(bank);
                    break;
                case 5:
                    showSummary(bank);
                    break;
                case 6:
                    scanner.close();
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void addAccount(Bank bank) {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter Account Name: ");
        String accountName = scanner.nextLine();

        System.out.print("Enter Account Balance: ");
        double balance = scanner.nextDouble();

        bank.addAccount(accountNumber, accountName, balance);
    }

    private static void viewAccounts(Bank bank) {
        bank.viewAccounts();
    }

    private static void deleteAccount(Bank bank) {
        System.out.print("Enter Account Number to Delete: ");
        String accountNumber = scanner.nextLine();

        Account account = bank.getAccountByNumber(accountNumber);
        if (account != null) {
            System.out.println("Are you sure you want to delete account " + accountNumber + "? (y/N)");
            String confirmation = scanner.nextLine();
            if (confirmation.equalsIgnoreCase("y")) {
                bank.deleteAccount(accountNumber);
                System.out.println("Account deleted successfully.");
            } else {
                System.out.println("Account deletion cancelled.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void viewAccountDetails(Bank bank) {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        bank.viewAccountDetails(accountNumber);
    }

    private static void showSummary(Bank bank) {
        bank.showSummary();
    }
}