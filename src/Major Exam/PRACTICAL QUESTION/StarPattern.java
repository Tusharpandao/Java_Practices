public class StarPattern {
    // 10. Write a program to print the following star pattern:
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}