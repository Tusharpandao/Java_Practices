package com.booststar.day5_minor_test2;

import java.util.Scanner;
public class FibonacciSequenceGenerator {

    /*
     * o Task: Create a program that generates the first n numbers in the Fibonacci
     * sequence.
     * o Objective: Learn about loops and sequence generation.
     * o Skills: Loops, arithmetic operations.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int swapnum = 0;

        System.out.print(swapnum);
        for (int i = 2; i <= n; ++i) {
            swapnum = n1 + n2;
            System.out.print(" " + swapnum);
            n1 = n2;
            n2 = swapnum;
        }
        sc.close();
    }
}
