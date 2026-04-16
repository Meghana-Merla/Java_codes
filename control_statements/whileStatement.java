package control_statements;

public class whileStatement {
    public static void main(String[] args) {
        int count = 1;

        //while loop - executes the block of code as long as the condition is true
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        //do-while loop - executes the block of code at least once, and then continues to execute as long as the condition is true
        int doCount = 1;
        do {
            System.out.println("Do Count: " + doCount);
            doCount++;
        } while (doCount <= 5);
    }
}
