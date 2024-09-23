public class PalindromeChecker {

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = isPalindrome(str);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Palindrome
    }
}