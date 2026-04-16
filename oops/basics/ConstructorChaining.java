package oops.basics;

class Car {
    String make;
    String model;
    int year;
    
    public Car() {
        //Constructor chaining: calling one constructor from another constructor using this() keyword
        this("Unknown Make", "Unknown Model", 0); // Calling the parameterized constructor with default values

    }
    
    // Constructor overloading: multiple constructors with different parameters
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make) {
        this(make, "Unknown Model", 0); // Calling the constructor with three parameters and passing default values
    }

    public void startEngineHelper() {
        // This is a helper method to demonstrate constructor chaining
        System.out.println("Helper method: Preparing to start the engine...");
    }

    public void startEngine() {
        this.startEngineHelper(); // Calling a helper method to start the engine
        System.out.println("The engine is starting...");
    }

    /*
    Rules for constructor chaining
    1. Constructor chaining can only be done within the same class using this() keyword.
    2. The constructor that is being called must be defined before the constructor that is calling it.
    3. Constructor chaining cannot be done in a recursive manner, meaning a constructor cannot call itself directly or indirectly.
    */
}

public class ConstructorChaining {
    public static void main(String[] args) {
        // Creating an object of the Car class using the constructor with three parameters
        Car car1 = new Car("Toyota", "Camry", 2020);
        System.out.println("Car 1: " + car1.make + " " + car1.model + " " + car1.year);
        
        // Creating an object of the Car class using the constructor with two parameters
        Car car2 = new Car("Honda", "Civic");
        System.out.println("Car 2: " + car2.make + " " + car2.model + " " + car2.year);
        
        // Creating an object of the Car class using the constructor with one parameter
        Car car3 = new Car("Ford");
        System.out.println("Car 3: " + car3.make + " " + car3.model + " " + car3.year);

        car1.startEngine(); // Calling the startEngine method of the Car class using the car1 object
    }
}
