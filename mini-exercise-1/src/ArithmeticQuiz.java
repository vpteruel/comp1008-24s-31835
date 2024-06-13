import java.util.Scanner;

public class ArithmeticQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            presentQuestion();
            
            System.out.print("Would you like another question? (Enter 'Y' to continue or 'N' to stop): ");
            choice = scanner.next().charAt(0);

        } while (Character.toLowerCase(choice) == 'Y');

        System.out.println("Thank you for playing!");
        scanner.close();
    }
    
    // Method to present an arithmetic problem and check the user's answer
    public static void presentQuestion() {
        Scanner scanner = new Scanner(System.in);
        boolean correctAnswer = false;
        
        // Generate random integers between 0 and 100
        int number1 = (int)(Math.random() * 101);
        int number2 = (int)(Math.random() * 101);
        int correctResult = number1 + number2;

        // Keep asking the question until the user gets it right
        while (!correctAnswer) {
            System.out.print("What is " + number1 + " + " + number2 + "? ");
            int userAnswer = scanner.nextInt();
            if (userAnswer == correctResult) {
                System.out.println("Correct!");
                correctAnswer = true;
            } else {
                System.out.println("Incorrect. Please try again.");
            }
        }
    }
}
