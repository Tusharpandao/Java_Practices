package day20;
import java.util.Scanner;

public class Solution2 {

    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the target value
            if (arr[i] == x) {
                // If a match is found, return the index
                return i;
            }
        }

        // If no match is found after iterating through the entire array, return -1
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of test cases: ");
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            
            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();

            
            int[] arr = new int[n];

            
            System.out.print("Enter the elements of the array separated by spaces: ");
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

           
            System.out.print("Enter the value to search for: ");
            int x = scanner.nextInt();

            
            int index = linearSearch(arr, x);

            // Print the result based on the index
            if (index != -1) {
                System.out.println("The element " + x + " is found at index " + index);
            } else {
                System.out.println("The element " + x + " is not present in the array.");
            }
        }

        scanner.close();
    }
}