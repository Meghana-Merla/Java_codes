package oops.basics;

//final method example
class Parent {
    final void finalMethod() {
        System.out.println("This is a final method.");
    }
}
class Child extends Parent {
    // This will cause a compile-time error because finalMethod cannot be overridden
    // void finalMethod() {
    //     System.out.println("This is an attempt to override a final method.");
    // }
}
//final class example
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}
// This will cause a compile-time error because FinalClass cannot be subclassed
// class SubClass extends FinalClass {
// }

public class FinalKeyword {
    public static void main(String[] args) {
        /*The final keyword in Java is used to declare constants, prevent method overriding, and prevent inheritance. 
         * A final variable can only be assigned once and cannot be changed after it has been initialized. It is a constant.
          * A final method cannot be overridden by subclasses. This means that the implementation of the method in the superclass will be used by all subclasses.
          * A final class cannot be subclassed. This means that no other class can extend a final class.
          * The static keyword in Java is used to create variables and methods that belong to the class rather than to any specific instance of the class. 
          * A static variable belongs to the class and is shared among all instances. It can be changed and accessed without creating an instance of the class.
          * A static method belongs to the class and can be called without creating an instance of the class. 
          * It can only access static variables and other static methods. */

        //final variable example
        final int finalVariable = 30;
        System.out.println("Final variable: " + finalVariable);
        //finalVariable = 40;  
        // This will cause a compile-time error because finalVariable cannot be reassigned
        // System.out.println("Final variable: " + finalVariable);


        //final blank variable example
        final int blankFinalVariable;
        blankFinalVariable = 50; // This is allowed because we can assign a value to a blank final variable only once
        System.out.println("Blank final variable: " + blankFinalVariable);  
        //blankFinalVariable = 60; // This will cause a compile-time error because blankFinalVariable cannot be reassigned
        // System.out.println("Blank final variable: " + blankFinalVariable);

        //final reference variable example
        final StringBuilder finalReferenceVariable = new StringBuilder("Hello");
        System.out.println("Final reference variable: " + finalReferenceVariable);
        //finalReferenceVariable = new StringBuilder("World"); // This will cause a compile-time error because finalReferenceVariable cannot be reassigned
        // System.out.println("Final reference variable: " + finalReferenceVariable);
        finalReferenceVariable.append(" World"); 
        // This is allowed because we are modifying the object that finalReferenceVariable points to, not reassigning the reference variable itself
        System.out.println("Final reference variable after modification: " + finalReferenceVariable);

    }
}
