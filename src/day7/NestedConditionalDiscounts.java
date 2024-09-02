package day7;
import java.util.Scanner;

public class NestedConditionalDiscounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer type (regular/premium/vip): ");
        String customerType = scanner.nextLine().toLowerCase();

        System.out.print("Enter purchase amount: $");
        double purchaseAmount = scanner.nextDouble();

        double discount = 0;

        if (customerType.equals("regular")) {
            if (purchaseAmount >= 100) {
                discount = 0.05; // 5% discount for regular customers with purchases $100 or more
            }
        } else if (customerType.equals("premium")) {
            if (purchaseAmount >= 200) {
                discount = 0.10; // 10% discount for premium customers with purchases $200 or more
            } else if (purchaseAmount >= 100) {
                discount = 0.07; // 7% discount for premium customers with purchases between $100 and $199.99
            }
        } else if (customerType.equals("vip")) {
            if (purchaseAmount >= 300) {
                discount = 0.15; // 15% discount for VIP customers with purchases $300 or more
            } else if (purchaseAmount >= 200) {
                discount = 0.12; // 12% discount for VIP customers with purchases between $200 and $299.99
            } else if (purchaseAmount >= 100) {
                discount = 0.10; // 10% discount for VIP customers with purchases between $100 and $199.99
            }
        }

        double discountAmount = purchaseAmount * discount;
        double finalPrice = purchaseAmount - discountAmount;

        System.out.printf("Discount: %.2f%%\n", discount * 100);
        System.out.printf("Discount amount: $%.2f\n", discountAmount);
        System.out.printf("Final price: $%.2f\n", finalPrice);

        scanner.close();
    }
}
