import java.util.Scanner;

public class MaxSumPath {

    // 3. Maximum Sum Path Across Two Sorted Arrays

    public static int maxSumPath(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;
        int result = 0, sum1 = 0, sum2 = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                sum1 += arr1[i++];
            else if (arr1[i] > arr2[j])
                sum2 += arr2[j++];
            else {
                result += Math.max(sum1, sum2) + arr1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        while (i < m)
            sum1 += arr1[i++];
        while (j < n)
            sum2 += arr2[j++];

        result += Math.max(sum1, sum2);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }
        scanner.close();

        int maxSum = maxSumPath(arr1, arr2);
        System.out.println(maxSum);
    }
}