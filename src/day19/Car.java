package day19;

public class Car {
    private String model;
    private int year;

    // Constructor added for easier object creation
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Default constructor
    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.trim().isEmpty()) {
            this.model = model;
        } else {
            throw new IllegalArgumentException("Model cannot be null or empty");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1885 && year <= 2100) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Year must be between 1886 and 2100");
        }
    }

    @Override
    public String toString() {
        return "Car{model='" + model + "', year=" + year + "}";
    }

    public static void main(String[] args) {
        Car myDon = new Car("Tesla Model S", 2020);
        System.out.println(myDon);

        Car anotherCar = new Car();
        anotherCar.setModel("Ford Mustang");
        anotherCar.setYear(2022);
        System.out.println(anotherCar);
    }
}
