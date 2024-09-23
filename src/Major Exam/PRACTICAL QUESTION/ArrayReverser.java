public class ArrayReverser {

    // 6. Write a Java program to reverse an array.

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println("Original array: ");
        printArray(numbers);

        reverseArray(numbers);

        System.out.println("\nReversed array: ");
        printArray(numbers);
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}