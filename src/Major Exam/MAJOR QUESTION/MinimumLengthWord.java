import java.util.Scanner;

public class MinimumLengthWord {

    // 2. Minimum Length Word in a String
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] words = s.split(" ");

        String minWord = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < minWord.length()) {
                minWord = words[i];
            }
        }

        System.out.println(minWord);

        sc.close();
    }
}
