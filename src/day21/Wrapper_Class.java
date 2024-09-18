package day21;

public class Wrapper_Class {
    public static void main(String[] args) {
        // Creating a primitive type
        int primitiveValue = 42;

        // Creating a wrapper class object
        Integer wrapperObject = Integer.valueOf(primitiveValue); // Explicit boxing

        // Alternatively, using autoboxing
        Integer autoboxedObject = primitiveValue; // Compiler does this automatically

        // Printing values
        System.out.println("Primitive value: " + primitiveValue);
        System.out.println("Wrapper object: " + wrapperObject);
        System.out.println("Autoboxed object: " + autoboxedObject);
    }
}
