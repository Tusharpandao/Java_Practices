package com.booststar.day8;

public class Maximum_value {
    
    /*Write a Java program to find the maximum value in an array of integers.
     If the maximum value is greater than 100, print "Large" and exit the loop. */
     public static void main(String[] args) {
        int[] numbers = {23, 55, 67, 99, 102, 45, 78, 85};
        int maxValue = numbers[0];

        for (int number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
            
            if (maxValue > 100) {
                System.out.println("Large");
                break;
            }
        }

        System.out.println("The maximum value is: " + maxValue);
    }

    }
