package day12_minor_test3;

/*Write a program that prints all even numbers from 1 to 50. Use a continue
statement to skip odd numbers. */
public class ContinueWithEvenNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                continue; // Skip odd numbers
            }
            System.out.print(i + " ");
        }
    }
    
}
