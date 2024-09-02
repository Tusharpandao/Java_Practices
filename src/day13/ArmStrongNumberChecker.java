package day13;
import java.util.Scanner;

public class ArmStrongNumberChecker {

    /*
     * 7. Armstrong Number Check: Write a method to check if a given number is an
     * Armstrong number.
     */

      public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  // 1634
        int originalNumber = number;
        int sum = 0;
        int power=0;

        for (int i=number;i !=0 ;i /=10 )
			{
				power++;
			}
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, power);
            number /= 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}
