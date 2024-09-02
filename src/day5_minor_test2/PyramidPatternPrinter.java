package com.booststar.day5_minor_test2;

public class PyramidPatternPrinter {

    /*
      • Task: Create a program that prints a pattern of stars or numbers (e.g., a
      pyramid or diamond shape).
      • Objective: Get familiar with nested loops and output formatting.
      • Skills: Nested loops, conditional statements.
           *
          * *
         * * *
        * * * *
       * * * * *
     */

    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(" *");

            }
            System.out.println();
        }

    }
}