package day12_minor_test3;

import java.util.Scanner;

/*
 * Write a Java program that checks whether a given year is a leap year. A year
is a leap year if:
○ It is divisible by 4,
○ If it is divisible by 100, it should also be divisible by 400.
 */
public class Leap_Year_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
