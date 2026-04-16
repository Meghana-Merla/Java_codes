package basics;

public class Arrays {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] myArray = {10, 20, 30, 40, 50};

        // Access and print elements of the array
        System.out.println("First element: " + myArray[0]); // Outputs 10
        System.out.println("Second element: " + myArray[1]); // Outputs 20
        System.out.println("Third element: " + myArray[2]); // Outputs 30
        System.out.println("Fourth element: " + myArray[3]); // Outputs 40
        System.out.println("Fifth element: " + myArray[4]); // Outputs 50

        // Modify an element in the array
        myArray[2] = 35; // Change the third element to 35
        System.out.println("Modified third element: " + myArray[2]); // Outputs 35

        // Get the length of the array
        System.out.println("Length of the array: " + myArray.length); // Outputs 5

        // Loop through the array and print all elements
        System.out.println("All elements in the array:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        //using new keyword to create an array of strings
        String[] myStringArray = new String[3];
        myStringArray[0] = "Hello";
        myStringArray[1] = "World";
        myStringArray[2] = "!";
        System.out.println("All elements in the string array:");
        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }
        
        //Anonymous array
        System.out.println("Anonymous array:");
        printArray(new int[]{1, 2, 3, 4, 5}); //printing an anonymous array without storing it in a variable

        //multidimensional array
        int[][] multiArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Multidimensional array:");
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
        /*
        Name stores as stack memory and values stored as heap memory. 
        When we create an array, it is stored in heap memory and the reference to that array is stored in stack memory. 
        When we pass an array to a method, we are passing the reference to that array, not a copy of the array. 
        This means that any changes made to the array inside the method will affect the original array outside the method, 
        because both the original reference and the parameter reference point to the same array in heap memory.
         */

        //Jagged array
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1, 2};
        jaggedArray[1] = new int[]{3, 4, 5};
        jaggedArray[2] = new int[]{6, 7};
        System.out.println("Jagged array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        /*utilizing the length property of the array to create a jagged array 
        where each row can have a different number of columns.*/
        /*
        Array Utility class: Java provides a utility class called Arrays in the java.util package that 
        contains various methods for manipulating arrays, such as sorting, searching, and comparing arrays.
        Arrays.sort() method to sort an array of integers.
        Arrays.toString() method to convert an array to a string representation for easy printing.
        Arrays.binarySearch() method to search for a specific element in a sorted array and return its index.
        Arrays.equals() method to compare two arrays for equality.
        Arrays.copyOf() method to create a copy of an array with a specified length.
        Arrays.fill() method to fill an array with a specific value.
        */
    }
    public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
}
