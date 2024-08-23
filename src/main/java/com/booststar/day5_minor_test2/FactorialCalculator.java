package com.booststar.day5_minor_test2;

import java.util.Scanner;

public class FactorialCalculator {

    /*
     * o Task: Write a program that calculates the factorial of a given number using
     * both iterative and recursive methods.
     * o Objective: Understand loops, recursion, and function design.
     * o Skills: Loops, recursion, conditional statements.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to get factorial : ");

        int num = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= num; i++) {

            factorial *= i;

        }
        System.out.println(factorial);

        scanner.close();
    }
}
