package day17;
// Superclass

class Person {
    void speak() {
        System.out.println("Speaking.");
    }
}

// Subclass
class Student extends Person {
    void study() {
        System.out.println("Studying.");
    }
}

public class java_Inheritance {
    public static void main(String[] args) {
        Student student = new Student();
        student.speak(); // Inherited method
        student.study(); // Subclass method
    }
}