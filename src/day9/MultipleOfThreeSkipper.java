package day9;



public class MultipleOfThreeSkipper {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 5, 6, 9, 11, 12, 15, 18, 20, 21, 24 };

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                System.out.println("Multiple of 3 found: " + numbers[i]);
                i += 2; // Skip the next two iterations
                continue;
            }
            System.out.println("Processing: " + numbers[i]);
        }
    }
}
