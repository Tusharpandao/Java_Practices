public class MethodOverloadingDemo {

    public static void display() {
        System.out.println("Displaying with no parameters");
    }

    public static void display(int number) {
        System.out.println("Displaying an integer: " + number);
    }

    public static void display(int num1, int num2) {
        System.out.println("Displaying two integers: " + num1 + " and " + num2);
    }

    public static void display(String message) {
        System.out.println("Displaying a String: " + message);
    }

    public static void main(String[] args) {
        display();
        display(10);
        display(5, 8);
        display("Hello, world!");
    }
}