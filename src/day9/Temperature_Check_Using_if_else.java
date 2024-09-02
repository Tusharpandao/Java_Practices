package com.booststar.day9;

import java.util.Scanner;

public class Temperature_Check_Using_if_else {
    /*
Write a Java program that takes the temperature as input and uses if-else statements
 to print whether it is "Cold" (below 15°C), "Warm" (between 15°C and 25°C), or "Hot" (above 25°C).
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Celsius: ");
        double temperature = scanner.nextDouble();
        
        if (temperature < 15) {
            System.out.println("Cold");
        } else if (temperature >= 15 && temperature <= 25) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }
        
        scanner.close();
    }
}
