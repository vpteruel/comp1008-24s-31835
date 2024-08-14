package finalexam.question4;

public class NumberChecker {

    public static void checkOddNumber(int number) throws Exception {
        if (number % 2 != 0) {
            throw new Exception("The number " + number + " is odd.");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }

    public static void main(String[] args) {
        int[] numbersToCheck = {2, 7, 4, 9, 10};

        for (int number : numbersToCheck) {
            try {
                checkOddNumber(number);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
