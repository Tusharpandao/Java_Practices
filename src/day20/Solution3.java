package day20;
import java.util.Scanner;

public class Solution3 {
    public static void swapAlternate(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            if (i < arr.length - 1) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];

            System.out.print("Enter the elements of the array: ");
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            swapAlternate(arr);

            System.out.print("The modified array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}