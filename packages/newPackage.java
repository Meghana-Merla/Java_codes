package packages;

//Here we will import car.java file from oops.basics package to use the Car class in this newPackage.java file.
import oops.basics.Car; // importing the Car class from the oops.basics package
//import oops.basics.*; // importing all classes from the oops.basics package

public class newPackage {
    /*Packages in Java are a way to organize and group related classes and interfaces together. 
    They provide a namespace for classes, which helps to avoid name conflicts and makes it easier to manage large codebases. 
    Here are some key points about packages in Java:
        * 1. Organization: Packages help to organize your code into logical groups, making it easier to find and use classes that are related to each other.
        * 2. Name Conflicts: By using packages, you can avoid name conflicts between classes with the same name in different packages. 
        For example, you can have two classes named MyClass in different packages without any issues.
        * 3. Access Control: Packages also provide a level of access control. You can specify which classes are accessible from outside the package using access modifiers (public, protected, private).
    */
    public static void main(String[] args) {
        // Creating an object of the Car class from the oops.basics package
        Car myCar = new Car("Tesla", "Model S", 2022);
        
        // Accessing the attributes of the Car object
        System.out.println("Car Make: " + myCar.make);
        System.out.println("Car Model: " + myCar.model);
        System.out.println("Car Year: " + myCar.year);
        
        /*
        Here we have created a new package called 'packages' and imported the Car class from the 'oops.basics' package.
        We then created an object of the Car class and accessed its attributes to demonstrate how we can use classes from different packages in Java.
        This illustrates the concept of packages in Java, which helps to organize code and avoid name conflicts by grouping related classes together.
         */
        
    }
}
