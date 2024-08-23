package com.booststar.day5_minor_test2;


public class PalindromeChecker {
/*
     * o Task: Write a program that checks if a given string is a palindrome (reads
     * the same forward and backward).
     * o Objective: Learn string manipulation and comparison.
     * o Skills: Conditional statements, loops, string handling.
     */

    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = cleanStr.length() - 1;
        
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String[] testStrings = {
            "121"
        };

        for (String str : testStrings) {
            System.out.println("\"" + str + "\" is " + 
                (isPalindrome(str) ? "a palindrome" : "not a palindrome"));
        }
    }
}
