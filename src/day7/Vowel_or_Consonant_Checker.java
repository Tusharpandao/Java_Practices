package day7;
import java.util.Scanner;

public class Vowel_or_Consonant_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        letter = Character.toLowerCase(letter);

        if (letter >= 'a' && letter <= 'z') {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a vowel.");
            } else {
                System.out.println(letter + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a letter.");
        }

        scanner.close();
    }
}
