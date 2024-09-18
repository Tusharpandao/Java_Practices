package day21;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        // Autoboxing: converting primitive to wrapper object
        int primitiveInt = 5;
        Integer wrapperInt = primitiveInt; // Automatic conversion from int to Integer

        // Unboxing: converting wrapper object to primitive
        Integer wrapperInt2 = 10;
        int primitiveInt2 = wrapperInt2; // Automatic conversion from Integer to int

        // Display results
        System.out.println("Autoboxing: Primitive int " + primitiveInt + " converted to Integer object " + wrapperInt);
        System.out.println("Unboxing: Integer object " + wrapperInt2 + " converted to primitive int " + primitiveInt2);
    }
}
