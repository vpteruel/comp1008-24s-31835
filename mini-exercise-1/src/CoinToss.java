import java.util.Random;
import java.util.Scanner;

public class CoinToss {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;
        char choice;

        do {
            boolean result = flipCoin();
            
            if (result) {
                System.out.println("Result: Heads");
                headsCount++;
            } else {
                System.out.println("Result: Tails");
                tailsCount++;
            }

            System.out.print("Do you want to flip the coin again? (Enter 'Y' to continue or 'N' to stop): ");
            choice = scanner.next().charAt(0);

        } while (Character.toUpperCase(choice) == 'Y');

        // Display the counts of heads and tails
        System.out.println("Number of heads: " + headsCount);
        System.out.println("Number of tails: " + tailsCount);

        scanner.close();
    }

    // Method to simulate coin tossing
    public static boolean flipCoin() {
        Random random = new Random();
        return random.nextBoolean(); // true for heads, false for tails
    }
}
