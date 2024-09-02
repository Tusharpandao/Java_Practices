package com.booststar.day9;

import java.util.Scanner;

public class Tax_Calculation {

    /*
     * Write a Java program that calculates the tax based on income.
     * Use the following tax brackets:
     * Income up to $10,000: No tax
     * Income $10,001 - $30,000: 10% tax
     * Income $30,001 - $70,000: 20% tax
     * Income above $70,000: 30% tax
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your income: $");
        double income = scanner.nextDouble();

        double tax = 0;

        if (income <= 10000) {
            tax = 0;
        } else if (income <= 30000) {
            tax = (income - 10000) * 0.10;
        } else if (income <= 70000) {
            tax = 20000 * 0.10 + (income - 30000) * 0.20;
        } else {
            tax = 20000 * 0.10 + 40000 * 0.20 + (income - 70000) * 0.30;
        }

        System.out.printf("Your tax amount is: $%.2f%n", tax);

        scanner.close();
    }
}
