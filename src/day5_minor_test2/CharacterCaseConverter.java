package day5_minor_test2;
public class CharacterCaseConverter {
    /*
     * o Task: Create a program that converts a lowercase character to uppercase and
     * vice versa.
     * o Objective: Familiarize yourself with character handling in Java.
     * o Skills: Conditional statements, character handling.
     */

    public static char convertCase(char ch) {
        if (Character.isLowerCase(ch)) {
            return Character.toUpperCase(ch);
        } else if (Character.isUpperCase(ch)) {
            return Character.toLowerCase(ch);
        } else {
            return ch; // Return the character as is if it's not a letter
        }
    }

    public static void main(String[] args) {
        // Example usage
        char lowercaseChar = 'a';
        char uppercaseChar = 'Z';
        char nonLetterChar = '5';

        System.out.println("Lowercase 'a' to uppercase: " + convertCase(lowercaseChar));
        System.out.println("Uppercase 'Z' to lowercase: " + convertCase(uppercaseChar));
        System.out.println("Non-letter '5' remains unchanged: " + convertCase(nonLetterChar));
    }
}
