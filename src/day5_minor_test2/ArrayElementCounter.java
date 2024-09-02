package day5_minor_test2;
public class ArrayElementCounter {
    /*
     * o Task: Create a program that counts the occurrence of a specific element in
     * an array.
     * o Objective: Understand array handling and loop iteration.
     * o Skills: Arrays, loops.
     */

     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 4, 2};
         int target = 2;
         int count = 0;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == target) {
                 count++;
             }
         }
         System.out.println("The number of occurrences of " + target + " is " + count);
     }
}