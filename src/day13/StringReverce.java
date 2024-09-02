package day13;
public class StringReverce {
    

    /* 6. String Reversal: Create a method to reverse a given string.
     
     */

     public static void main(String[] args) {
        String str = "Hello, World!";
         String reversedStr = reverseString(str);
         System.out.println("Reversed string: " + reversedStr); 
     }
     public static String reverseString(String str) {
         StringBuilder reversed = new StringBuilder();
         for (int i = str.length() - 1; i >= 0; i--) {
             reversed.append(str.charAt(i));
         }
         return reversed.toString();
     }
}
