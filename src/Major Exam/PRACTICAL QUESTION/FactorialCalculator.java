public class FactorialCalculator {

    // 3. Write a Java program to find the factorial of a number.
    public static void main(String[] args) {
        int number = 5;
        long factorial = 1;

        // Calculate factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i; // factorial = factorial * i
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}