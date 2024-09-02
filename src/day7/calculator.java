package day7;

import java.util.Scanner;

public class calculator {

    static Scanner scanner = new Scanner(System.in);
    static boolean isRunning = true;

    /**
     * The main entry point of the calculator application. Displays a menu of
     * options for the user to choose from, including addition, subtraction,
     * multiplication, and division. Allows the user to exit the application.
     */
    public static void main(String[] args) {

        System.out.println("\nWelcome to the calculator");

        while (isRunning) {

            System.out.println();
            System.out.println(" 1. Addition");
            System.out.println(" 2. Subtraction");
            System.out.println(" 3. Multiplication");
            System.out.println(" 4. Division");
            System.out.println(" 5. modulo");
            System.out.println(" 6. power");

            System.out.println(" 7. square root");
            System.out.println(" 8. factorial ");
            System.out.println(" 9. trigonometric function");
            System.out.println(" 10. logarithm type");
            System.out.println(" 11. Exit");
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();
            function(choice);

        }
    }

    public static void function(int choice) {

        switch (choice) {
            case 1:
                System.out.println("Enter first numbers to add");
                int num1 = scanner.nextInt();
                System.out.println("Enter second number to add");
                int num2 = scanner.nextInt();

                System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
                break;

            case 2:
                System.out.println("Enter first numbers to add");
                int firstValue = scanner.nextInt();
                System.out.println("Enter second number to add");
                int secondValue = scanner.nextInt();

                System.out.println("The Subtraction of " + firstValue + " and " + secondValue + " is "
                        + (firstValue - secondValue));
                break;
            case 3:
                System.out.println("Enter first number to multiply");
                int num3 = scanner.nextInt();
                System.out.println("Enter second number to multiply");
                int num4 = scanner.nextInt();
                System.out.println("The product of " + num3 + " and " + num4 + " is " + (num3 * num4));
                break;

            case 4:
                System.out.println("Enter the dividend");
                double dividend = scanner.nextDouble();
                System.out.println("Enter the divisor");
                double divisor = scanner.nextDouble();
                if (divisor != 0) {
                    System.out.println(
                            "The result of " + dividend + " divided by " + divisor + " is " + (dividend / divisor));
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
            case 5:
                System.out.println("Enter first number");
                int num5 = scanner.nextInt();
                System.out.println("Enter second number");
                int num6 = scanner.nextInt();
                System.out.println(num5 + " modulo " + num6 + " is " + (num5 % num6));
                break;
            case 6:
                System.out.println("Enter base number");
                double base = scanner.nextDouble();
                System.out.println("Enter exponent");
                double exponent = scanner.nextDouble();
                System.out
                        .println(base + " raised to the power of " + exponent + " is " + Math.pow(base, exponent));
                break;
            case 7:
                System.out.println("Enter a number to find its square root");
                double number = scanner.nextDouble();
                if (number >= 0) {
                    System.out.println("The square root of " + number + " is " + Math.sqrt(number));
                } else {
                    System.out.println("Error: Cannot calculate square root of a negative number");
                }
                break;
            case 8:
                System.out.println("Enter a non-negative integer to calculate its factorial");
                int n = scanner.nextInt();
                if (n < 0) {
                    System.out.println("Error: Factorial is not defined for negative numbers");
                } else {
                    long factorial = 1;
                    for (int i = 2; i <= n; i++) {
                        factorial *= i;
                    }
                    System.out.println("The factorial of " + n + " is " + factorial);
                }
                break;
            case 9:
                System.out.println("Choose a trigonometric function:");
                System.out.println("1. Sin");
                System.out.println("2. Cos");
                System.out.println("3. Tan");
                System.out.println("4. Back");
                int trigChoice = scanner.nextInt();
                System.out.println("Enter angle in degrees");
                double angle = Math.toRadians(scanner.nextDouble());
                switch (trigChoice) {
                    case 1:
                        System.out.println("Sin(" + Math.toDegrees(angle) + "°) = " + Math.sin(angle));
                        break;
                    case 2:
                        System.out.println("Cos(" + Math.toDegrees(angle) + "°) = " + Math.cos(angle));
                        break;
                    case 3:
                        System.out.println("Tan(" + Math.toDegrees(angle) + "°) = " + Math.tan(angle));
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;
            case 10:
                System.out.println("Choose logarithm type:");
                System.out.println("1. Log base 10");
                System.out.println("2. Natural log (base e)");
                System.out.println("3. Back");
                int logChoice = scanner.nextInt();
                System.out.println("Enter a positive number");
                double logNumber = scanner.nextDouble();
                if (logNumber <= 0) {
                    System.out.println("Error: Logarithm is only defined for positive numbers");
                } else {
                    switch (logChoice) {
                        case 1:
                            System.out.println("Log10(" + logNumber + ") = " + Math.log10(logNumber));
                            break;
                        case 2:
                            System.out.println("Ln(" + logNumber + ") = " + Math.log(logNumber));
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                }
                break;

            case 11:
                System.out.println("Thank you for using the calculator. Goodbye!");
                isRunning = false;
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

    }
}
