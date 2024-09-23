import java.util.ArrayList;
import java.util.Scanner;

//1. Leaders in an Array 

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> leaders = new ArrayList<>();

        int maxSoFar = arr[n - 1];
        leaders.add(maxSoFar);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxSoFar) {
                leaders.add(arr[i]);
                maxSoFar = arr[i];
            }
        }

        for (int i = 0; i < leaders.size(); i++) {
            System.out.print(leaders.get(i) + " ");
        }

        sc.close();
    }
}
