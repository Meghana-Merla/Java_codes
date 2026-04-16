package oops.Encapsulation;

import oops.Encapsulation.AccessModifiers.Example;

public class AccessModifiersExample {
    class Person {
        private String name; // Private field, only accessible within the Person class
        public String organization; // Public field, accessible from anywhere
        protected int age; // Protected field, accessible within the same package and by subclasses
        String defaultField; // Default (package-private) field, accessible only within the same package

        public String getName() {
            return name; // Getter method to access the private field 'name'
        }

        public void setName(String name) {
            this.name = name; // Setter method to modify the private field 'name'
        }
    }
    class Employee extends Person {
        private int employeeId; // Private field, only accessible within the Employee class
        //name not accessible here because it is private in the Person class, but organization, age, and defaultField are accessible because they are public, protected, and default (package-private) respectively.
        //accessing protected field 'age' from the superclass Person
        public void setEmployeeAge(int age) {
            this.age = age; // This is allowed because 'age' is protected and Employee is a subclass of Person
        }
        public int getEmployeeAge() {
            return age; // This is allowed because 'age' is protected and Employee is a subclass of Person
        }
        public String getEmployeeOrganization() {
            return organization; // This is allowed because 'organization' is public and accessible from anywhere
        }
        public void setEmployeeOrganization(String organization) {
            this.organization = organization; // This is allowed because 'organization' is public and accessible from anywhere
        }
        public String getEmployeeDefaultField() {
            return defaultField; // This is allowed because 'defaultField' is default (package-private) and Employee is in the same package as Person
        }
        public void setEmployeeDefaultField(String defaultField) {
            this.defaultField = defaultField; // This is allowed because 'defaultField' is default (package-private) and Employee is in the same package as Person
        }
        public int getEmployeeId() {
            return employeeId; // Getter method to access the private field 'employeeId'
        }
        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId; // Setter method to modify the private field 'employeeId'
        }
    }



    public static void main(String[] args) {
        //accesing default field from the same package accessmodifiers.java
        Example example = new AccessModifiersExample().new Example();
        example.defaultField = 10; // This is allowed because 'defaultField' is default (package-private) and example is in the same package as Example
        System.out.println("Default Field: " + example.defaultField); // This is allowed because 'defaultField' is default (package-private) and example is in the same package as Example
        Person person = new AccessModifiersExample().new Person();
        //accesing public field from anywhere
        person.organization = "Tech Company"; // This is allowed because 'organization' is public and accessible from anywhere
        System.out.println("Organization: " + person.organization); // This is allowed because 'organization' is public and accessible from anywhere
        //accesing protected field from the same package        person.age = 30; // This is allowed because 'age' is protected and person is in the same package as Person
        System.out.println("Age: " + person.age); // This is allowed because 'age' is protected and person is in the same package as Person
        //accesing private field using getter and setter methods
        person.setName("John Doe");
        System.out.println("Name: " + person.getName());
        //accesing protected field from a subclass
        Employee employee = new AccessModifiersExample().new Employee();

    }
}
