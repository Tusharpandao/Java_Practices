package day13;
public class FibonacciSeries {

    /* 2. Fibonacci Series: Create a method to print the first n Fibonacci */
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print
        int first = 0, second = 1;
        int count = 0;

        System.out.println("First " + n + " numbers in the Fibonacci series:");

        while (count < n) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

            count++;
        }
    }

}
