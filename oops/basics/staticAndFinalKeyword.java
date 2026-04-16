package oops.basics;

class MyClass {
    // Static variable: belongs to the class and is shared among all instances
    static int staticVariable = 10;
    
    // Non-static variable: belongs to the instance of the class
    int nonStaticVariable = 20;
    
    // Static method: can be called without creating an instance of the class
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
    
    // Non-static method: can only be called through an instance of the class
    void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }
}

public class staticAndFinalKeyword {
    public static void main(String[] args) {
        // Static variable: belongs to the class and is shared among all instances
        System.out.println("Static variable: " + MyClass.staticVariable);
        
        // Static method: can be called without creating an instance of the class
        MyClass.staticMethod();
        
        // Creating an instance of MyClass to access non-static members
        MyClass myObject = new MyClass();
        System.out.println("Non-static variable: " + myObject.nonStaticVariable);
        myObject.nonStaticMethod();

        //final keyword is used to declare constants. 
        // A final variable can only be assigned once and cannot be changed after it has been initialized.
        final int finalVariable = 30;
        System.out.println("Final variable: " + finalVariable);
        //finalVariable = 40; 
        // This will cause a compile-time error because finalVariable cannot be reassigned
        // System.out.println("Final variable: " + finalVariable);
        /**
         * difference between final and static:
         * final: A final variable can only be assigned once and cannot be changed after it has been initialized. It is a constant.
         * static: A static variable belongs to the class and is shared among all instances. It can be changed and accessed without creating an instance of the class.
         */
        /*All possible combinations using static and final
        1. static final: A static final variable is a constant that belongs to the class and is shared among all instances. It can only be assigned once and cannot be changed after it has been initialized.
        2. static non-final: A static non-final variable belongs to the class and is shared among all instances. It can be changed and accessed without creating an instance of the class.
        3. non-static final: A non-static final variable is a constant that belongs to the instance of the class. It can only be assigned once and cannot be changed after it has been initialized.         
        4. non-static non-final: A non-static non-final variable belongs to the instance of the class. It can be changed and accessed through an instance of the class.
         
        */
    }
}
