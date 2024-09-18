package day16;

abstract class Vehicle {

    abstract void operate();

}

/**
 * Car
 */
public class Car extends Vehicle {

    @Override
    void operate() {
        System.out.println("driving safely");

    }

    public static void main(String[] args) {

        Vehicle myCar = new Car();

        myCar.operate();
    }

}