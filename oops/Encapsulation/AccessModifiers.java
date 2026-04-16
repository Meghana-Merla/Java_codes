package oops.Encapsulation;

public class AccessModifiers {
    class Example {
        public int publicField; // Accessible from anywhere
        private int privateField; // Accessible only within the same class
        protected int protectedField; // Accessible within the same package and by subclasses
        int defaultField=0; // Accessible only within the same package (default access)

        public void publicMethod() {
            // This method can be called from anywhere
        }
        private void privateMethod() {
            // This method can only be called within the same class
        }
        protected void protectedMethod() {
            // This method can be called within the same package and by subclasses
        }
        void defaultMethod() {
            // This method can only be called within the same package (default access)
        }
    }

    class person {
        private String name; // Private field, only accessible within the Person class

        public String getName() {
            return name; // Getter method to access the private field 'name'
        }

        public void setName(String name) {
            this.name = name; // Setter method to modify the private field 'name'
        }
    }

    public static void main(String[] args) {
        /*Access Modifiers are keywords in Java that determine the visibility and accessibility of classes, methods, and variables. 
        They control how other parts of the code can interact with these members, providing a way to enforce encapsulation and protect the internal state of an object.

        There are four access modifiers in Java:
        1. Public: Members declared as public are accessible from any other class in any package. They can be accessed and modified freely without any restrictions.
        2. Private: Members declared as private are only accessible within the same class. They cannot be accessed or modified from outside the class, providing a high level of encapsulation and data protection.
        3. Protected: Members declared as protected are accessible within the same package and also by subclasses (even if they are in different packages). This allows for a certain level of access while still maintaining some degree of encapsulation.
        4. Default (Package-Private): If no access modifier is specified, the member is considered to have default access, which means it is accessible only within the same package. It cannot be accessed from classes in different packages.

        By using access modifiers appropriately, you can control the visibility of your class members and ensure that sensitive data is protected while still allowing necessary interactions with other parts of your code.
        */

        /*
        Modifiers for classes:
        Modifiers can be applied to classes, methods, and variables to control their accessibility.
        For classes, the access modifiers can be public or default (package-private).
        A public class can be accessed from any other class in any package, while a default (package-private) class can only be accessed from classes within the same package.
        For example:
        public class MyClass {
            // This class can be accessed from anywhere
        }
        class MyPackageClass {
            // This class can only be accessed from classes within the same package
        }
        Modifiers for methods and variables:
        For methods and variables, all four access modifiers (public, private, protected, and default) can be used to control their accessibility.
        Example in AccessModifiersExample.java file.
        */
    }
}
