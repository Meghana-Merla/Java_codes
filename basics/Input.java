package basics;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); // Read an integer input from the user
        scanner.nextLine(); // Consume the newline character left by nextInt()
        System.out.println("You entered: " + num);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine(); // Read a string input from the user
        scanner.nextLine(); // Consume the newline character left by nextLine()
        System.out.println("You entered: " + str);
        scanner.close(); // Close the scanner to prevent resource leaks

    }
}
