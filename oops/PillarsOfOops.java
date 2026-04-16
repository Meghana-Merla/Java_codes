package oops;

public class PillarsOfOops {
    public static void main(String[] args) {
        /*The four pillars of Object-Oriented Programming (OOP) are:")

        1.Encapsulation: The bundling of data and methods that operate on that data within a single unit (class). It helps to hide the internal state of an object and only expose a controlled interface.
         * Encapsulation allows for better modularity and helps to protect the integrity of the data by preventing unauthorized access and modification.
         * It promotes code maintainability and flexibility by allowing changes to the internal implementation without affecting the external code that uses the class.
            * In Java, encapsulation is achieved through the use of access modifiers (private, protected, public) and getter/setter methods to control access to the class's fields.
        
        2.Inheritance: The mechanism by which one class can inherit properties and behaviors (fields and methods) from another class. It promotes code reusability and establishes a natural hierarchical relationship between classes.
         * The class that inherits is called the subclass (or child class), and the class being inherited from is called the superclass (or parent class). 
         * Inheritance allows for the creation of new classes based on existing classes, which can lead to a more organized and efficient code structure.
         * In Java, inheritance is implemented using the 'extends' keyword, allowing a subclass to inherit from a superclass and override its methods to provide specific implementations.
         * It also supports multiple levels of inheritance, where a subclass can itself be a superclass for another subclass.
        
        3.Polymorphism: The ability of a single interface to represent different underlying forms (data types). It allows objects of different classes to be treated as objects of a common superclass, typically through method overriding and method overloading.
            * Polymorphism promotes flexibility and extensibility in code by allowing the same method to behave differently based on the object that is calling it. 
            * In Java, polymorphism is achieved through method overriding (runtime polymorphism) and method overloading (compile-time polymorphism). 
            * Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass, while method overloading allows multiple methods with the same name but different parameters to coexist in the same class.
            * Polymorphism enables dynamic method dispatch, where the method that gets executed is determined at runtime based on the actual type of the object, rather than the reference type.
            * It enhances code readability and maintainability by allowing developers to write more generic and reusable code.
            * For example, you can have a superclass called 'Animal' with a method 'makeSound()', and subclasses like 'Dog' and 'Cat' that override this method to provide specific implementations. When you call 'makeSound()' on an object of type 'Animal', it will execute the appropriate method based on whether the object is a Dog or a Cat.
            * This allows for greater flexibility and extensibility in your code, as you can easily add new subclasses without modifying existing code that uses the superclass.
        
        4.Abstraction: The concept of hiding the complex implementation details and showing only the essential features of an object. It allows the programmer to focus on interactions at a higher level without needing to understand the intricate workings of the underlying code.
            * Abstraction helps to reduce complexity and increase efficiency by allowing the programmer to work with a simplified model of the object. 
            * In Java, abstraction is achieved through the use of abstract classes and interfaces. 
            * An abstract class can have both abstract methods (without implementation) and concrete methods (with implementation), while an interface can only have abstract methods (until Java 8, which introduced default methods). 
            * Abstraction allows for the creation of a clear separation between what an object does (its behavior) and how it does it (its implementation), which promotes code modularity and maintainability.
            * For example, you can have an abstract class called 'Shape' with an abstract method 'draw()', and concrete subclasses like 'Circle' and 'Rectangle' that provide specific implementations of the 'draw()' method. This way, you can work with shapes at a higher level of abstraction without needing to know the details of how each shape is drawn.
        */    
    }
}
