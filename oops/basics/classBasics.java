package oops.basics;

class Car {
    //fields (attributes) of the Car class
    String make;
    String model;
    int year;
    
    //default constructor (if no constructor is defined, Java provides a default constructor)
    public Car() {
    }
    /*
    this keyword is used to refer to the current object of the class. 
    It is commonly used in constructors and methods to distinguish between instance variables and parameters with the same name.
    */
    //parameterized Constructor to initialize the attributes of the Car class
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //methods (behaviors) of the Car class can be added here
    public void startEngine() {
        System.out.println("The engine is starting...");
    }
}

public class classBasics {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Camry", 2020);
        
        //Dot operator is used to access the attributes and methods of the Car class through the myCar object
        myCar.startEngine(); // Calling the startEngine method of the Car class using the myCar object
        /* myCar is null then myCar.startEngine() will throw NullPointerException 
        because we are trying to call a method on a null reference variable which does not point to any object in heap memory.*/

        // Accessing the attributes of the Car object
        System.out.println("Car Make: " + myCar.make);
        System.out.println("Car Model: " + myCar.model);
        System.out.println("Car Year: " + myCar.year);

        /*Visual representation of the Car class and its object
        Car class
        | make: String
        | model: String
        | year: int
        |
        | + startEngine(): void
        |
            Car object (myCar)
            | make: "Toyota"
            | model: "Camry"
            | year: 2020
            | + startEngine(): void

            Car class is a blueprint for creating objects. It defines the attributes (fields) and behaviors (methods) that the objects created from the class will have. 
            In this example, the Car class has three attributes: make, model, and year, and one method: startEngine(). 
            The main method creates an object of the Car class called myCar and initializes its attributes using the parameterized constructor. 
            Finally, it prints out the attributes of the myCar object.
            stored as stack memory and the reference variable (myCar) is stored in heap memory which points to the object created in heap memory.
            if mycar is null then it means that the reference variable is not pointing to any object in heap memory.
        */

        //Anonymous object of the Car class
        new Car("Honda", "Civic", 2019).startEngine(); 
        // This will create an object and call the startEngine method without storing the reference to the object.

        //Reference Assignment
        Car anotherCar = myCar; // anotherCar is now referencing the same object as myCar
        System.out.println("Another Car Make: " + anotherCar.make); // Outputs "Toyota"
        anotherCar.make = "Ford"; // Changing the make of the car through anotherCar reference
        System.out.println("Updated Car Make: " + myCar.make); // Outputs "Ford"
        /*This shows that both myCar and anotherCar are referencing the same object in heap memory, 
         so changes made through one reference will affect the other reference as well.
        */

    }
}