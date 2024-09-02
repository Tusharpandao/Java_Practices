
package day7;
import java.util.Scanner;
public class ComplexLoanEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your annual income: ");
        double income = scanner.nextDouble();

        System.out.print("Enter your credit score: ");
        int creditScore = scanner.nextInt();

        boolean isEligible = checkLoanEligibility(age, income, creditScore);

        if (isEligible) {
            System.out.println("Congratulations! You are eligible for the loan.");
        } else {
            System.out.println("Sorry, you are not eligible for the loan.");
        }

        scanner.close();
    }

    private static boolean checkLoanEligibility(int age, double income, int creditScore) {
        if (age >= 18 && age <= 65) {
            if (income >= 30000) {
                if (creditScore >= 700) {
                    return true;
                } else if (creditScore >= 600 && income >= 50000) {
                    return true;
                } else {
                    System.out.println("Credit score too low.");
                    return false;
                }
            } else {
                System.out.println("Income too low.");
                return false;
            }
        } else {
            System.out.println("Age not within eligible range.");
            return false;
        }
    }
}
