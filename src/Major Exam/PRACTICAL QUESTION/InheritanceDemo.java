class Animal {
    // 17. Write a Java program to demonstrate the use of inheritance by creating a
    // base class Animal and subclass Dog.

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking...");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat(); // Inherited from Animal
        dog.sleep(); // Inherited from Animal
        dog.bark(); // Specific to Dog
    }
}