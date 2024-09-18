package day17;

// Superclass
class Person {
    void speak() {
        System.out.println("Speaking.");
    }
}

// Subclass
class Employee extends Person {
    void work() {
        System.out.println("Working.");
    }

}

public class Single_Inheritance {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.speak();
        // Inherited method
        emp.work();
        // Subclass method
    }
}