
package day24;
import java.util.Scanner;

public class Solution {

    public static int minProject(int[] errorScore, int compP, int othQ) {
        int answer = 0;
        int maxError = 0; 

        // Find the maximum error score among all team members
        for (int score : errorScore) {
            maxError = Math.max(maxError, score);
        }

        // If the maximum error is 0, no projects are needed
        if (maxError == 0) {
            return 0;
        }

        // Calculate the number of projects required to reduce the maximum error to 0
        answer = (int) Math.ceil((double) maxError / compP);

        // Adjust the answer considering the impact of 'othQ' on other team members
        answer += (int) Math.ceil((double) (answer - 1) * othQ / compP);

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for errorScore
        int errorScore_size = in.nextInt(); 
        int[] errorScore = new int[errorScore_size]; 
        for(int idx = 0; idx < errorScore_size; idx++) {
            errorScore[idx] = in.nextInt();
        }

        // Input for compP
        int compP = in.nextInt();

        // Input for othQ
        int othQ = in.nextInt();

        int result = minProject(errorScore, compP, othQ); 
        System.out.print(result);

        in.close(); // Close the scanner to prevent resource leaks
    }
}