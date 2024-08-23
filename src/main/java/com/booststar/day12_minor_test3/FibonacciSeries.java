package com.booststar.day12_minor_test3;

/*Implement a program that prints the first 10 numbers in the Fibonacci series
using a while loop. */
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print
        int first = 0, second = 1;
        int count = 0;

        System.out.println("First " + n + " numbers in the Fibonacci series:");

        while (count < n) {
            System.out.print(first + " ");
            
            int next = first + second;
            first = second;
            second = next;
            
            count++;
        }
    }
    
}
