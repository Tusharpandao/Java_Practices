package day5_minor_test2;
import java.util.Scanner;

public class SimpleInterestCalculator {
    /*
     o Task: Write a program to calculate the simple interest based on the
     principal, rate, and time provided by the user.
     o Objective: Work with basic arithmetic and understand the formula for simple interest.
     o Skills: Arithmetic operations, input/output.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        System.out.printf("Simple Interest: %.2f%n", simpleInterest);

        scanner.close();
    }
}
