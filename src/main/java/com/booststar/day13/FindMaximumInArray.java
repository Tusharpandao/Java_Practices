package com.booststar.day13;
public class FindMaximumInArray {

    /* 9. Find Maximum in Array: Implement a method to find the maximum value in
an array of integers. */

public static int findMaximum(int[] array) {
    if (array == null || array.length == 0) {
        throw new IllegalArgumentException("Array is empty or null");
    }
    
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] > max) {
            max = array[i];
        }
    }
    return max;
}

public static void main(String[] args) {
    int[] numbers = {23, 55, 67, 99, 102, 45, 78, 85};
    int maxValue = findMaximum(numbers);
    System.out.println("The maximum value in the array is: " + maxValue);
}
}
