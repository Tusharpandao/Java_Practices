import java.util.Scanner;

//5. Maximum Sum of SubArray of Size `K`

public class MaximumSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int windowSum = 0;
        for (int i = 0; i < K; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for (int i = K; i < N; i++) {
            windowSum += arr[i] - arr[i - K];

            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println(maxSum);

        sc.close();
    }
}
