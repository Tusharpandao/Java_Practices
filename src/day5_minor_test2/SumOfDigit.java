package com.booststar.day5_minor_test2;

public class SumOfDigit {
    /*
     * o Task: Write a program that calculates the sum of the digits of a given
     * integer.
     * o Objective: Practice loops and modular arithmetic.
     * o Skills: Loops, arithmetic operations.
     */

    public static int sumOfDigits(int number) {
        int sum = 0;
        
        // Convert negative numbers to positive
        number = Math.abs(number);
        
        while (number > 0) {
            sum += number % 10;  // Add the last digit to the sum
            number /= 10;        // Remove the last digit
        }
        
        return sum;
    }

    public static void main(String[] args) {
        // Example usage
        int testNumber = 12345;
        int result = sumOfDigits(testNumber);
        System.out.println("Sum of digits in " + testNumber + " is: " + result);
    }
}
