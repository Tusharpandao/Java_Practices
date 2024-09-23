// 20.	Write a Java program to implement a Singleton design pattern.

class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) { // Ensure thread-safety
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void displayMessage() {
        System.out.println("Hello from Singleton!");
    }
}

// Example usage
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.displayMessage(); // Output: Hello from Singleton!
        singleton2.displayMessage(); // Output: Hello from Singleton!

        System.out.println(singleton1 == singleton2); // Output: true (same instance)
    }
}