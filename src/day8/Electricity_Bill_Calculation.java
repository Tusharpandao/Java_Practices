package day8;

import java.util.Scanner;

public class Electricity_Bill_Calculation {
    
    /*Write a Java program that calculates the monthly electricity bill based on the number of units consumed.
0-100 units: $0.10 per unit
101-300 units: $0.15 per unit
Above 300 units: $0.20 per unit
If consumption exceeds 500 units, apply an additional 10% surcharge.
Print the total bill amount.
 */
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();
        
        double bill = 0;
        
        if (units <= 100) {
            bill = units * 0.10;
        } else if (units <= 300) {
            bill = 100 * 0.10 + (units - 100) * 0.15;
        } else {
            bill = 100 * 0.10 + 200 * 0.15 + (units - 300) * 0.20;
        }
        
        if (units > 500) {
            bill += bill * 0.10; // 10% surcharge
        }
        
        System.out.printf("Your electricity bill is: $%.2f%n", bill);
        
        scanner.close();
    }

}
