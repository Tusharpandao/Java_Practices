import java.util.*;

// 6. Keyboard Faulty Key Interpretation

public class FaultyKeyboardInterpretation {

    public static boolean isValidInterpretation(String intended, String interpreted) {
        int i = 0, j = 0;
        int n = intended.length(), m = interpreted.length();

        while (i < n && j < m) {
            if (intended.charAt(i) == interpreted.charAt(j)) {
                char currentChar = intended.charAt(i);

                int countIntended = 0;
                while (i < n && intended.charAt(i) == currentChar) {
                    countIntended++;
                    i++;
                }

                int countInterpreted = 0;
                while (j < m && interpreted.charAt(j) == currentChar) {
                    countInterpreted++;
                    j++;
                }

                if (countInterpreted < countIntended) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return i == n && j == m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        // Process each pair
        for (int k = 0; k < N; k++) {
            String intended = sc.nextLine().trim();
            String interpreted = sc.nextLine().trim();

            boolean result = isValidInterpretation(intended, interpreted);

            // Output result
            System.out.println(result ? "true" : "false");
        }

        sc.close();
    }
}
