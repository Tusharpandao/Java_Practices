package com.booststar.day5_minor_test2;

import java.util.Scanner;

public class TriangleTypeChecker {
    /*
      o Task: Create a program that determines the type of a triangle (equilateral,
      isosceles, or scalene) based on the lengths of its sides.
      o Objective: Understand conditional logic and comparison operations.
      o Skills: Conditional statements, relational operators.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of the triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        String triangleType = determineTriangleType(side1, side2, side3);
        System.out.println("The triangle is " + triangleType);

        scanner.close();
    }

    public static String determineTriangleType(double side1, double side2, double side3) {
        if (side1 == side2 && side2 == side3) {
            return "equilateral";
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
