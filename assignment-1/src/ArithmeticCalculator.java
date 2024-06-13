import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user for two numbers and an arithmetic operator
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter an arithmetic operator (+, -, *, /, %, ^): ");
        char operator = scanner.next().charAt(0);

        // Performing the arithmetic operation based on the operator
        double result = 0;

        // if (operator == '+') {
        // result = num1 + num2;
        // } else if (operator == '-') {
        // result = num1 - num2;
        // } else if (operator == '*') {
        // result = num1 * num2;
        // } else if (operator == '/') {
        // result = num1 / num2;
        // } else if (operator == '%') {
        // result = num1 % num2;
        // } else if (operator == '^') {
        // result = Math.pow(num1, num2);
        // }

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
        }

        // Printing the result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
