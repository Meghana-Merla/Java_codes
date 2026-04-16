package oops.basics;

class MyClass {
    int value;

    MyClass(int value) {
        this.value = value;
    }
}

public class PassByValueDemo {
    // Method for primitive (pass by value)
    static void modifyPrimitive(int num) {
        num = num + 10;
        System.out.println("Inside method (primitive): " + num);
    }

    // Method for object (reference passed as value)
    static void modifyObject(MyClass obj) {
        obj.value = obj.value + 10;
        System.out.println("Inside method (object): " + obj.value);
    }
    //Difference between pass by value and pass by reference:
    /*In Java, all method arguments are passed by value. 
    * This means that when you pass a variable to a method, you are passing a copy of the variable's value. 
    * For primitive types (like int, double, etc.), this means that the method receives a copy of the value, 
    * and any changes made to the parameter inside the method do not affect the original variable outside the method.
    */

    public static void main(String[] args) {

        //Primitive Example
        int x = 10;
        System.out.println("Before method call (primitive): " + x);

        modifyPrimitive(x);

        System.out.println("After method call (primitive): " + x);

        //output:
        //Before method call (primitive): 10
        //Inside method (primitive): 20
        //After method call (primitive): 10

        //Object Example
        MyClass m = new MyClass(20);
        System.out.println("Before method call (object): " + m.value);

        modifyObject(m);

        System.out.println("After method call (object): " + m.value);
        //output:
        //Before method call (object): 20
        //Inside method (object): 30
        //After method call (object): 30
    }
}