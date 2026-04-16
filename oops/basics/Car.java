package oops.basics;

public class Car {
    //fields (attributes) of the Car class
    public String make;
    public String model;
    public int year;
    
    public Car() {
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("The engine is starting...");
    }
}
