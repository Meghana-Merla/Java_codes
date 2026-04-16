package control_statements;

public class forLoop {
    public static void main(String[] args) {
        //for loop - executes the block of code a specified number of times
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
        }

        //enhanced for loop (for-each loop) - used to iterate through arrays or collections
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
