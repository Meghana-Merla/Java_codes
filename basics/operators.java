package basics;

public class operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        //Shorthand Operators
        a += 5; // a = a + 5
        System.out.println("a after a += 5: " + a);
        a -= 3; // a = a - 3
        System.out.println("a after a -= 3: " + a);

        //Increment and Decrement Operators
        b=a++; // Post Increment a by 1
        System.out.println("a after a++: " + a);
        System.out.println("b after a++: " + b);
        b=++a; // Pre Increment a by 1
        System.out.println("a after ++a: " + a);
        System.out.println("b after ++a: " + b);
        b=a--; // Post Decrement a by 1
        System.out.println("a after a--: " + a);
        System.out.println("b after a--: " + b);
        b=--a; // Pre Decrement a by 1
        System.out.println("a after --a: " + a);  
        System.out.println("b after --a: " + b); 

        // Relational Operators
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT

        //Operators Precedence
        int result = a + b * 2; // Multiplication has higher precedence than addition
        System.out.println("Result of a + b * 2: " + result);
        result = (a + b) * 2; // Parentheses change the precedence
        System.out.println("Result of (a + b) * 2: " + result);
        /*Multiplication and division have higher precedence than addition and subtraction, 
         and parentheses can be used to change the order of evaluation.*/
    }
}
