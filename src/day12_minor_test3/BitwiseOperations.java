package day12_minor_test3;

import java.util.Scanner;
/*Implement a program that takes two integers as input and displays their
bitwise AND, OR, XOR, left shift, and right shift results. */

public class BitwiseOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.println("Bitwise AND: " + (num1 & num2));
        System.out.println("Bitwise OR: " + (num1 | num2));
        System.out.println("Bitwise XOR: " + (num1 ^ num2));
        System.out.println("Left shift of first number by 1: " + (num1 << 1));
        System.out.println("Right shift of second number by 1: " + (num2 >> 1));

        scanner.close();
    }
}
