package com.booststar.day5_minor_test2;

public class QuadraticEquationSolver {

    /*
     * o Task: Write a program that solves a quadratic equation (ax^2 + bx + c = 0)
     * and prints its roots.
     * o Objective: Practice conditional logic and work with mathematical
     * operations.
     * o Skills: Conditional statements, arithmetic operations.
     */

     public static void main(String[] args) {
        double a = 1;
        double b = 5;
        double c = 6;
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }
     }
        
}
