public class ArraySum {

    // 2. Write a program to find the sum of all elements in an array.
    public static void main(String[] args) {
        int[] numbers = { 5, 12, 3, 8, 1 };

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("The sum of all elements in the array is: " + sum);
    }
}