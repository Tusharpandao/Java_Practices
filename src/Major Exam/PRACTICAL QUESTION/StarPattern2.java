public class StarPattern2 {
    // 13. Write a program to print the following star pattern:
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            if (i == 3) {
                System.out.print(" ~");
            }

            System.out.println();
        }
    }
}