package day5_minor_test2;

import java.util.Scanner;

public class CurrencyConverter {

    /*
     * o Task: Write a program that converts an amount of money from one currency to
     * another based on user input (e.g., USD to EUR).
     * o Objective: Work with user input, arithmetic operations, and conditional
     * logic.
     * o Skills: Input/output, conditional statements.
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Define exchange rates
            final double USD_TO_EUR = 0.84;
            final double USD_TO_GBP = 0.72;
            final double USD_TO_JPY = 109.65;

            System.out.println("Currency Converter");
            System.out.println("1. USD to EUR");
            System.out.println("2. USD to GBP");
            System.out.println("3. USD to JPY");
            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();

            System.out.print("Enter the amount in USD: ");
            double amount = scanner.nextDouble();

            double convertedAmount = 0;
            String targetCurrency = "";

            if (choice == 1) {
                convertedAmount = amount * USD_TO_EUR;
                targetCurrency = "EUR";
            } else if (choice == 2) {
                convertedAmount = amount * USD_TO_GBP;
                targetCurrency = "GBP";
            } else if (choice == 3) {
                convertedAmount = amount * USD_TO_JPY;
                targetCurrency = "JPY";
            } else {
                System.out.println("Invalid choice. Please run the program again.");
                scanner.close();
                return;
            }
      
            System.out.printf("%.2f USD is equal to %.2f %s%n", amount, convertedAmount, targetCurrency);
        }

        
    }
}
