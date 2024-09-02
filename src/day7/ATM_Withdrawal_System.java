package day7;
import java.util.Scanner;

public class ATM_Withdrawal_System {
    private static final int[] DENOMINATIONS = {100, 50, 20, 10}; // Available bill denominations
    private static double balance = 1000.00; // Initial balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the ATM");
        System.out.println("Your current balance is: $" + balance);
        
        System.out.print("Enter withdrawal amount: $");
        double amount = scanner.nextDouble();
        
        if (checkBalance(amount) && isDenominationValid(amount)) {
            processWithdrawal(amount);
        }
        
        scanner.close();
    }
    
    private static boolean checkBalance(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Your balance is $" + balance);
            return false;
        }
        return true;
    }
    
    private static boolean isDenominationValid(double amount) {
        int cents = (int)(amount * 100);
        for (int denomination : DENOMINATIONS) {
            cents %= (denomination * 100);
        }
        if (cents != 0) {
            System.out.println("Invalid amount. Please enter an amount that's a multiple of available denominations.");
            return false;
        }
        return true;
    }
    
    private static void processWithdrawal(double amount) {
        balance -= amount;
        System.out.println("Please take your cash. Your new balance is $" + balance);
    }
}
