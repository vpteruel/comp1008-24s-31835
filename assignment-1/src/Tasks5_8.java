import java.util.Scanner;

public class Tasks5_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user for the number of elements in the array
        System.out.print("Enter the number of elements you would like in the array: ");
        int numElements = scanner.nextInt();

        // Creating an integer array with the specified number of elements
        int[] array = new int[numElements];

        // Calling task6 method with the array as parameter
        task6(array);
        task5();

        scanner.close();
    }

    // Task 5: Print "Hello, World!"
    public static void task5() {
        System.out.println("Hello, World!");
    }

    // Task 6: Populate the elements of the array and print the sum
    public static void task6(int[] array) {
        Scanner scanner = new Scanner(System.in);

        // Loop to populate each index of the array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number for index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Closing the scanner
        scanner.close();

        // Calling task7 method with the sum of elements as parameter
        task7(array);
    }

    // Task 7: Print whether the sum is even or odd
    public static void task7(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of elements in the array: " + sum);

        if (sum % 2 == 0) {
            System.out.println("The sum is even.");
        } else {
            System.out.println("The sum is odd.");
        }
    }
}
