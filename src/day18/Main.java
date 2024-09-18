package day18;

// Superclass
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class to test run-time polymorphism
public class Main {
    public static void main(String[] args) {
        Animal myAnimal; // Reference of type Animal

        // myAnimal can reference an object of type Dog
        myAnimal = new Dog();
        myAnimal.makeSound(); // Outputs: Dog barks

        // myAnimal can reference an object of type Cat
        myAnimal = new Cat();
        myAnimal.makeSound(); // Outputs: Cat meows
    }
}
