package day12_minor_test3;

/*Write a Java program that demonstrates the use of both pre-increment and
post-increment operators. Use a loop to show how the values change with
each iteration. */
public class UnaryOperators {

    public static void main(String[] args) {
        int preIncrement = 0;
        int postIncrement = 0;

        System.out.println("Demonstrating pre-increment and post-increment operators:");
        System.out.println("Iteration | Pre-increment | Post-increment");
        System.out.println("----------+---------------+----------------");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-9d | %-14d | %d\n", i + 1, ++preIncrement, postIncrement++);
        }

        System.out.println("\nFinal values:");
        System.out.println("Pre-increment: " + preIncrement);
        System.out.println("Post-increment: " + postIncrement);
    }
}
