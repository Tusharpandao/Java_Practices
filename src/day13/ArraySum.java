package com.booststar.day13;

public class ArraySum {

    /*5. Array Sum: Write a method to calculate the sum of all elements in an array. */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = sumOfArray(arr);
        System.out.println("Sum of array elements: " + sum);
    }
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
}
