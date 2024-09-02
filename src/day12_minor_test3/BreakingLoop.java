package day12_minor_test3;

import java.util.Scanner;

/*Create a program that prompts the user to enter a series of numbers. The
program should terminate when the user enters a negative number and then
display the sum of all positive numbers entered. */
public class BreakingLoop {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter a series of numbers. Enter a negative number to terminate.");

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            sum += number;
        }

        System.out.println("Sum of all positive numbers entered: " + sum);
        scanner.close();
    }
}
