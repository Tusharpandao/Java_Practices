package com.booststar.day5_minor_test2;

public class MatrixAddition {

    /*
     * o Task: Write a program that adds two matrices of the same size.
     * o Objective: Work with multi-dimensional arrays and loops.
     * o Skills: Arrays, loops, arithmetic operations.
     */

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        
        int[][] result = new int[rows][columns];
        
        // Adding matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        // Printing the result
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
