package day5_minor_test2;
public class PasswordStrengthChecker {
    /*
     * o Task: Write a program that checks the strength of a password based on its
     * length, the inclusion of numbers, and special characters.
     * o Objective: Work with strings and conditional checks.
     * o Skills: String handling, conditional statements.
     */

     public static void main(String[] args) {
        String password = "Password123!";
         boolean hasNumber = false;
         boolean hasSpecialChar = false;
         for (char c : password.toCharArray()) {
             if (Character.isDigit(c)) {
                 hasNumber = true;
             } else if (!Character.isLetterOrDigit(c)) {
                 hasSpecialChar = true;
             }
         }
         if (password.length() >= 8 && hasNumber && hasSpecialChar) {
             System.out.println("Password is strong.");
         } else {
             System.out.println("Password is weak.");
         }
     }
}
