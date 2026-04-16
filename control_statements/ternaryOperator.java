package control_statements;

public class ternaryOperator {
    public static void main(String[] args) {
        int number = 10;
        /*Terenary operator is a shorthand for if-else statement. 
        It takes three operands: a condition, a value if the condition is true, and a value if the condition is false.*/
        
        // Using the ternary operator to check if the number is positive, negative, or zero
        String result = (number > 0) ? "The number is positive." :
                        (number < 0) ? "The number is negative." : "The number is zero.";
        System.out.println(result);
    }
}
