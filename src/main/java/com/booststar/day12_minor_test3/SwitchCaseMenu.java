package com.booststar.day12_minor_test3;

/*Develop a simple menu-driven program using a switch-case statement. The
menu should include operations like addition, subtraction, multiplication, and
division. The program should take user input for the operation and two
numbers to perform the calculation. */


    
import java.util.Scanner;

public class SwitchCaseMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                System.out.println("Thank you for using the calculator. Goodbye!");
                break;
            }
            
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            switch (choice) {
                case 1:
                    System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, num1 + num2);
                    break;
                case 2:
                    System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, num1 - num2);
                    break;
                case 3:
                    System.out.printf("Result: %.2f * %.2f = %.2f%n", num1, num2, num1 * num2);
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, num1 / num2);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
        
        scanner.close();
    }
}
