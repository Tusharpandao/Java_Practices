package com.booststar.day12_minor_test3;
import java.util.Scanner;

public class ArithmeticOperationswithUserInput {

    /*
     * Write a program that takes two integer inputs from the user and performs all
     * basic arithmetic operations (addition, subtraction, multiplication, division,
     * and
     * modulus) on them. Display the results of each operation
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Addition
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));

        // Subtraction
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));

        // Multiplication
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));

        // Division
        if (num2 != 0) {
            System.out.println("Division: " + num1 + " / " + num2 + " = " + ((double) num1 / num2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Modulus
        if (num2 != 0) {
            System.out.println("Modulus: " + num1 + " % " + num2 + " = " + (num1 % num2));
        } else {
            System.out.println("Modulus by zero is not allowed.");
        }

        scanner.close();
    }
}