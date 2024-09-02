package day7;

public class Ticket_Pricing_System {
    public static double getTicketPrice(int age) {
        double price;
        
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else if (age <= 12) {
            price = 5.00; // Child ticket price
        } else if (age <= 59) {
            price = 10.00; // Adult ticket price
        } else {
            price = 7.50; // Senior ticket price
        }
        
        return price;
    }
    
    public static void main(String[] args) {
        System.out.println("Ticket price for age 8: $" + getTicketPrice(8));
        System.out.println("Ticket price for age 25: $" + getTicketPrice(25));
        System.out.println("Ticket price for age 65: $" + getTicketPrice(65));
    }
}
