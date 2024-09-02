package com.booststar.day5_minor_test2;


public class NumberToWordsConverter {
        /*
     * o Task: Create a program that converts a given number (e.g., 123) into its
     * word equivalent (e.g., "One Hundred Twenty-Three").
     * o Objective: Understand string manipulation and mapping of numbers to words.
     * o Skills: Conditional statements, string handling.
     */
    private static final String[] ONES = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    
    private static final String[] TENS = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    
    private static final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};
    
    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero";
        }
        
        String words = "";
        int index = 0;
        
        while (number > 0) {
            if (number % 1000 != 0) {
                words = convertHundreds(number % 1000) + THOUSANDS[index] + " " + words;
            }
            number /= 1000;
            index++;
        }
        
        return words.trim();
    }
    
    private static String convertHundreds(int number) {
        String current = "";
        
        if (number >= 100) {
            current += ONES[number / 100] + " Hundred ";
            number %= 100;
        }
        
        if (number >= 20) {
            current += TENS[number / 10] + " ";
            number %= 10;
        }
        
        if (number > 0) {
            current += ONES[number] + " ";
        }
        
        return current;
    }
    
    public static void main(String[] args) {
        System.out.println(convertToWords(123)); // Output: One Hundred Twenty Three
        System.out.println(convertToWords(45678)); // Output: Forty Five Thousand Six Hundred Seventy Eight
        System.out.println(convertToWords(1000000)); // Output: One Million
    }
}
