package com.booststar.day13;

public class GreatestCommonDivisor {

    /*
     * 1. Greatest Common Divisor (GCD): Implement a method to find the greatest
     * common divisor of two integers.
     */

    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int gcd = findGCD(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
