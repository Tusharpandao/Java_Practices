package day17;

// Example 2: Using Members Function:
// Parent Class
class Person {
    void sleep() {
        System.out.println("Sleeping.");
    }
}

// Child Class 1
class Chef extends Person {
    void cook() {
        System.out.println("Cooking.");
    }
}

// Child class 2
class Driver extends Person {
    void drive() {
        System.out.println("Driving.");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {
        Chef chef = new Chef();

        Driver driver = new Driver();
        chef.sleep(); // Inherited method from Parent Class
        chef.cook(); // Method of Child Class 1
        driver.sleep(); // Inherited method from Parent Class
        driver.drive(); // Method of Child Class 2driver.sleep(); // Inherited method from Parent Class
        driver.drive(); // Method of Child Class 2
    }
}