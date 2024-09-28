package day9;

public class PositiveNumberAverage {
    public static void main(String[] args) {
        int[] numbers = {-2, 5, 8, -1, 12, 3, 7, -4, 6};
        int sum = 0;
        int count = 0;

        for (int number : numbers) {
            if (number > 0) {
                sum += number;
                count++;
                
                double average = (double) sum / count;
                if (average < 10) {
                    System.out.println("Low");
                    break;
                }
            }
        }

        if (count > 0) {
            double finalAverage = (double) sum / count;
            System.out.printf("The average of positive numbers is: %.2f%n", finalAverage);
        } else {
           System.out.println("No positive numbers found in the array.");
        }
    }
}
