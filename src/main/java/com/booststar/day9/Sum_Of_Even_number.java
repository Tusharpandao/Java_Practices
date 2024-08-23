package com.booststar.day9;

public class Sum_Of_Even_number {
    

    /*Write a Java program to print the sum of all even numbers in an array of integers. 
    If the sum exceeds 50, stop calculating and print the sum. */

    public static void main(String[] args) {
        int[] numbers = {2, 7, 12, 5, 8, 3, 10, 6, 15, 4};
        int sum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
                if (sum > 50) {
                    break;
                }
            }
        }

        System.out.println("The sum of even numbers is: " + sum);
    }
}
