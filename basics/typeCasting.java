package basics;

public class typeCasting {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        // Explicit Casting (Narrowing)
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println(myDouble2);  // Outputs 9.78
        System.out.println(myInt2);     // Outputs 9

        byte myByte = 127;
        int myInt3 = myByte; // Implicit casting: byte to int
        System.out.println(myByte);     // Outputs 127
        System.out.println(myInt3);     // Outputs 127

        int myInt4 = 258;
        byte myByte2 = (byte) myInt4; // Explicit casting: int to byte
        System.out.println(myInt4);     // Outputs 258  
        System.out.println(myByte2);    // Outputs 2

    }
}
