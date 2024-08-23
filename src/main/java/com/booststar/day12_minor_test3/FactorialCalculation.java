package com.booststar.day12_minor_test3;

import java.util.Scanner;

/*Write a program that calculates the factorial of a given number using a for
loop. Factorial of n (denoted as n!) is the product of all positive integers less
than or equal to n. */
public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer to calculate its factorial: ");
        int n = scanner.nextInt();
        
        long factorial = calculateFactorial(n);
        
        System.out.println("The factorial of " + n + " is: " + factorial);
        
        scanner.close();
    }
    
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
}
