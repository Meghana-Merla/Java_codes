package oops.Inheritance;

public class intro {
    public static void main(String[] args) {
        /*Inheritance is a fundamental object-oriented programming (OOP) concept that allows a new class (called a subclass or child class) to inherit properties and behaviors (fields and methods) from an existing class (called a superclass or parent class). 
        The subclass can also have its own additional fields and methods, and it can override the inherited methods to provide specific implementations.
        Inheritance promotes code reusability, as common functionality can be defined in the superclass and shared among multiple subclasses. It also establishes a natural hierarchical relationship between classes, making it easier to organize and manage code.
        In Java, inheritance is achieved using the 'extends' keyword. For example:
        public class Animal {
            public void eat() {
                System.out.println("This animal eats food.");
            }
        }
        public class Dog extends Animal {
            public void bark() {
                System.out.println("The dog barks.");
            }
        }
        In this example, the Dog class inherits the eat() method from the Animal class, allowing it to use that method without having to redefine it. The Dog class can also have its own method, bark(), which is specific to dogs.
        Inheritance also supports multiple levels of inheritance, where a subclass can itself be a superclass for
    another subclass. For example:
        public class Puppy extends Dog {
            public void weep() {
                System.out.println("The puppy weeps.");
            }
        }
        In this case, the Puppy class inherits from the Dog class, which in turn inherits from the Animal class. This means that the Puppy class has access to both the eat() method from the Animal class and the bark() method from the Dog class, in addition to its own weep() method.
        Inheritance is a powerful mechanism that allows for the creation of new classes based on existing ones, promoting code reuse and enabling a more organized and efficient code structure.
        */
    }
}
