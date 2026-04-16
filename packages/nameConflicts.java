package packages;

import oops.basics.Car; // importing the Car class from the oops.basics package
//import vehicles.Car; // Uncommenting this line will cause a name conflict if there is another Car class in the vehicles package

import java.util.Date; // importing the Date class from the java.util package
import java.sql.*; // importing all classes from the java.sql package, which also contains a Date class, but we will use the fully qualified name to avoid conflict

public class nameConflicts {
    public static void main(String[] args) {
        /*
        Name conflicts can occur when two or more classes have the same name in different packages. 
        To resolve this issue, you can use the fully qualified name of the class, which includes the package name. 
        For example, if you have a class named Car in both the oops.basics package and another package, you can specify which Car class you want to use by using the fully qualified name like this:
        oops.basics.Car myCar = new oops.basics.Car("Tesla", "Model S", 2022);
        This way, you can avoid name conflicts and specify exactly which class you want to use in your code.
         */
            // Example of name conflict resolution using fully qualified names
        Car myCar1 = new Car("Tesla", "Model S", 2022);
        Car myCar2 = new Car("Honda", "Civic", 2020);   
        System.out.println("Car 1: " + myCar1.make + " " + myCar1.model + " " + myCar1.year);
        System.out.println("Car 2: " + myCar2.make + " " + myCar2.model + " " + myCar2.year);

        // Example of name conflict resolution using fully qualified names for Date class
        Date utilDate = new Date(); // Uses java.util.Date (Explicitly imported), so no conflict here
        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis()); // Using fully qualified name for java.sql.Date
        System.out.println("Current Date (java.util.Date): " + utilDate);
        System.out.println("Current Date (java.sql.Date): " + sqlDate);
        
    }
}
