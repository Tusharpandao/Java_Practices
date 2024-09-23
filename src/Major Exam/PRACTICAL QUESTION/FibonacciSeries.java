public class FibonacciSeries {
    // 5. Write a Java program to print the Fibonacci series up to a given
    // number.

    public static void main(String[] args) {
        int n = 10;

        int first = 0, second = 1;

        System.out.print("Fibonacci series up to " + n + ": ");

        while (first <= n) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}