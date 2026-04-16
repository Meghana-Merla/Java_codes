package oops.basics;

class MyClass {
    int value;

    MyClass(int value) {
        this.value = value;
    }
}

public class copyingObjects {
    public static void main(String[] args) {
        /*In Java, when you assign one object to another, you are actually copying the reference to the object, not the object itself. 
         * This means that both variables will point to the same object in memory. If you modify the object through one variable, the changes will be reflected when you access the object through the other variable as well. 
         * This is known as shallow copying. If you want to create a new object that is a copy of an existing object, you need to implement a deep copy mechanism, which involves creating a new instance of the object and copying all of its fields. */

        // Example of shallow copying
        MyClass original = new MyClass(10);
        MyClass copy = original; // This is a shallow copy, both variables point to the same object

        System.out.println("Original value: " + original.value); // Output: 10
        System.out.println("Copy value: " + copy.value); // Output: 10

        copy.value = 20; // Modifying the copy will affect the original

        System.out.println("Original value after modification: " + original.value); // Output: 20
        System.out.println("Copy value after modification: " + copy.value); // Output: 20

        // Example of deep copying
        MyClass originalDeep = new MyClass(30);
        MyClass copyDeep = new MyClass(originalDeep.value); // This is a deep copy, creating a new instance

        System.out.println("OriginalDeep value: " + originalDeep.value); // Output: 30
        System.out.println("CopyDeep value: " + copyDeep.value); // Output: 30

        copyDeep.value = 40; // Modifying the deep copy will not affect the original

        System.out.println("OriginalDeep value after modification: " + originalDeep.value); // Output: 30
        System.out.println("CopyDeep value after modification: " + copyDeep.value); // Output: 40

        //Deep copy using a copy constructor is a common way to create a new instance of an object that is a copy of an existing object.
        //Deep copy is done only through copy constructor, clone method, or serialization.

        //Copy Constructor example
        MyClass originalCopyConstructor = new MyClass(50);
        MyClass copyConstructor = new MyClass(originalCopyConstructor.value); // Using a copy constructor to create a new instance
        System.out.println("OriginalCopyConstructor value: " + originalCopyConstructor.value); // Output: 50
        System.out.println("CopyConstructor value: " + copyConstructor.value); // Output: 50
        copyConstructor.value = 60; // Modifying the copy constructor will not affect the original
        System.out.println("OriginalCopyConstructor value after modification: " + originalCopyConstructor.value); // Output: 50
        System.out.println("CopyConstructor value after modification: " + copyConstructor.value); // Output: 60
        System.out.println("OriginalCopyConstructor value after modification: " + originalCopyConstructor.value); // Output: 50

    }
}
