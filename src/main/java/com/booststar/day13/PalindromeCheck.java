package com.booststar.day13;

import java.util.Scanner;

public class PalindromeCheck {

    /*
     * 1. Palindrome Check: Create a method to check if a given string is a
     * palindrome.
     */ public static boolean isPalindrome(String str) {
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
        String testStrings = "tushar";

        System.out.println("\"" + testStrings + "\" is " +
                (isPalindrome(testStrings) ? "a palindrome String" : "not a  palindrome String"));
    }
}
