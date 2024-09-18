package day18;

class MathOperations {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        // calls the method with two integer parameters
        System.out.println("Sum of two integers: " + math.add(5, 40));
        // calls the overloaded method with three integer parameters
        System.out.println("Sum of three integers: " + math.add(45, 10, 15));
        // calls the overloaded method with two double parameters
        System.out.println("Sum of two doubles: " + math.add(45.5, 10.5));
    }
}
