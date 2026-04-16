package basics;

public class typePromotion {
    public static void main(String[] args) {
        byte myByte = 100;
        byte myByte2=100;
        byte a=(byte)(myByte*myByte2);
        System.out.println(a); 
        //100*100=10000 but byte can only store -128 to 127 so it will overflow and give us 16 as output
        //byte*byte->int*int->int so we need to cast it back to byte to store it in a byte variable
        
        /*All the smaller data types (byte, short, char) are promoted to int when they are used in an expression. 
        This is called type promotion. 
        In this case, myByte and myByte2 are promoted to int before the multiplication is performed. 
        The result of the multiplication is also an int, which is why we need to cast it back to byte to store it in the variable a.*/
    }
}
