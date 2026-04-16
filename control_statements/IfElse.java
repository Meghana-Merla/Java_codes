package control_statements;

public class IfElse {
    public static void main(String[] args) {
        int number = 10;
        //simple if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        //if-else statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }

        //if-else if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        //nested if statement
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("The number is positive and even.");
            } else {
                System.out.println("The number is positive and odd.");
            }
        } else {
            System.out.println("The number is not positive.");
        }  
    }
}
