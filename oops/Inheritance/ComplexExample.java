package oops.Inheritance;

public class ComplexExample {
    class Vehicle {
        public void start() {
            System.out.println("The vehicle is starting.");
        }
        public void drive() {
            System.out.println("The vehicle is driving.");
        }
        public void charge() {
            System.out.println("The vehicle is charging.");
        }
    }
    class Car extends Vehicle {
        public void drive() {
            System.out.println("The car is driving.");
        }
        public void charge() {
            System.out.println("The car is charging.");
        }
    }
    class ElectricCar extends Car {
        public void charge() {
            System.out.println("The electric car is charging.");
        }
    }
    public static void main(String[] args) {
        Vehicle electricCar = new ComplexExample().new ElectricCar(); // Creating an instance of the ElectricCar class
        electricCar.start(); // Inherited from Vehicle class
        electricCar.drive(); // Overridden method in Car class, will call the drive() method defined in Car class instead of the one in Vehicle class
        electricCar.charge(); // Overridden method in ElectricCar class, will call the charge() method defined in ElectricCar class instead of the one in Car class
        /*
        Output:
        The vehicle is starting.
        The car is driving.
        The electric car is charging.
        */
    }
}
