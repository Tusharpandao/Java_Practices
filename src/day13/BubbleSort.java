package com.booststar.day13;

public class BubbleSort {
    /* 8. Bubble Sort: Implement a method to sort an array of integers using the
bubble sort algorithm. */

public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap elements
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

public static void main(String[] args) {
    int[] arr = {64, 34, 25, 12, 22, 11, 90};
    System.out.println("Original array:");
    printArray(arr);

    bubbleSort(arr);

    System.out.println("Sorted array:");
    printArray(arr);
}

public static void printArray(int[] arr) {
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
}
    
}
