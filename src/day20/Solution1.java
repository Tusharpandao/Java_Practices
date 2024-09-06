package day20;

import java.util.Scanner;

public class Solution1 {
    public static int sum(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length you want sum  : ");
        int length = sc.nextInt();
        if (length < arr.length) {
            int sum = 0;
            for (int i = 0; i <= length; i++) {
                sum = sum + arr[i];
            }
            sc.close();
            return sum;
        } else {
            System.err.println("given n length is greater then array");
            sc.close();
            return 0;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = sum(arr);
        System.out.println(sum);
    }
}
