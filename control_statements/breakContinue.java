package control_statements;

public class breakContinue {
    public static void main(String[] args) {
        //break statement - used to exit a loop or switch statement
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // exits the loop when i is 3
            }
            System.out.println("i: " + i);
        }

        //labelled break statement - used to exit a specific loop when there are nested loops
        outerLoop: // label for the outer loop
        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 3; y++) {
                if (x == 2 && y == 2) {
                    break outerLoop; // exits the outer loop when x is 2 and y is 2
                }
                System.out.println("x: " + x + ", y: " + y);
            }
        }

        //continue statement - used to skip the current iteration of a loop and continue with the next iteration
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                continue; // skips the rest of the code in the loop when j is 3 and continues with the next iteration
            }
            System.out.println("j: " + j);
        }
    }
}
