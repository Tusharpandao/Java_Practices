public class LargestNumberFinder {

    // 9. Write a Java program to find the largest of three numbers.
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 25;
        int num3 = 8;

        int largest = findLargest(num1, num2, num3);

        System.out.println("The largest number is: " + largest);
    }

    public static int findLargest(int a, int b, int c) {
        int largest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }

        return largest;
    }
}