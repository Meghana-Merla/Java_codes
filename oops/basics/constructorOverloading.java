package oops.basics;

class Car {
    String make;
    String model;
    int year;
    
    public Car() {
    }
    
    // Constructor overloading: multiple constructors with different parameters
    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
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


public class constructorOverloading {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car("Ford");
        
        // Displaying the attributes of the cars
        System.out.println("Car 1: " + car1.make + " " + car1.model + " " + car1.year);
        System.out.println("Car 2: " + car2.make + " " + car2.model + " " + car2.year);
        System.out.println("Car 3: " + car3.make + " " + car3.model + " " + car3.year);
    }
}
