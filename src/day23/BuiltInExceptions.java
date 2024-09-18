package day23;

import java.io.File;
import java.io.FileReader;

public class BuiltInExceptions {

    public static void main(String[] args) {

        // ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException" + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException

        try {
            int[] arr = { 1, 2, 3, 4, 5 };
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException" + e.getMessage());
        }

        // ClassNotFoundException
        try {
            Class.forName("day24.BuiltInExceptions");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException" + e.getMessage());
        }

        // FileNotFoundException
        try {
            File file = new java.io.File("file.txt");
            FileReader fileReader = new FileReader(file);
        } catch (java.io.FileNotFoundException e) {
            System.out.println("FileNotFoundException" + e.getMessage());
        }

        // IOException
        try {
            File file = new java.io.File("file.txt");
            FileReader fileReader = new FileReader(file);
        } catch (java.io.IOException e) {
            System.out.println("IOException" + e.getMessage());
        }

        // InterruptedException
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException" + e.getMessage());
        }

        // NoSuchFieldException
        try {
            Class<?> clazz = Class.forName("day24.BuiltInExceptions");
            clazz.getDeclaredField("name");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException" + e.getMessage());
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException" + e.getMessage());
        }

        // NoSuchMethodException
        try {
            Class<?> clazz = Class.forName("day24.BuiltInExceptions");
            clazz.getDeclaredMethod("main", String[].class);
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException" + e.getMessage());
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException" + e.getMessage());
        }

        // NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException" + e.getMessage());
        }

        // NumberFormatException
        try {
            String str = "123abc";
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException" + e.getMessage());
        }

        // RuntimeException
        try {
            int[] arr = { 1, 2, 3, 4, 5 };
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException" + e.getMessage());
        }

        // IllegalArgumentException
        try {
            int num = -1;
            if (num < 0) {
                throw new IllegalArgumentException("Number must be positive");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException" + e.getMessage());
        }

        // IllegalStateException
        try {
            int num = 10;
            if (num % 2 == 0) {
                throw new IllegalStateException("Number must be odd");
            }
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException" + e.getMessage());
        }

        // UnsupportedOperationException

        try {
            int num = 10;
            if (num % 2 == 0) {
                throw new UnsupportedOperationException("Number must be odd");
            }
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException" + e.getMessage());
        }

    }

}
