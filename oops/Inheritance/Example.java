package oops.Inheritance;

public class Example {
    class Animal {
        public void eat() {
            System.out.println("This animal eats food.");
        }
    }
    class Dog extends Animal {
        public void bark() {
            System.out.println("The dog barks.");
        }
    }
    class Puppy extends Dog {
        public void weep() {
            System.out.println("The puppy weeps.");
        }
    }
    public static void main(String[] args) {
        Puppy puppy = new Example().new Puppy(); // Creating an instance of the Puppy class
        puppy.eat(); // Inherited from Animal class
        puppy.bark(); // Inherited from Dog class
        puppy.weep(); // Defined in Puppy class
        puppy.eat(); // Inherited from Animal class
    }

}
