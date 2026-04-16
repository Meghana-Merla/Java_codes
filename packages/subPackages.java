package packages;

//importing java.util package and its subpackage java.util.concurrent

import java.util.ArrayList; // importing the ArrayList class from the java.util package
import java.util.LinkedList; // importing the LinkedList class from the java.util package
//imported ArrayList and LinkedList classes from java.util package to demonstrate the use of subpackages in Java.

public class subPackages {
    public static void main(String[] args) {
        /*
        In Java, packages can also contain subpackages, which are simply packages nested within other packages. 
        Subpackages help to further organize your code and create a hierarchical structure for your classes. 
        For example, you might have a package called 'com.example' and within that package, 
        you could have subpackages like 'com.example.utils' and 'com.example.models'. 
        This allows you to group related classes together in a more organized way and makes it easier to manage larger codebases.
         */
            /*To create a subpackage, you simply need to create a directory structure that matches the package name.
        For example, if you want to create a subpackage called 'utils' within the 'com.example' package, you would create a directory structure like this:
        com/
            example/
                utils/
                    MyUtilityClass.java
                models/
                    MyModelClass.java
                MyMainClass.java
                In this example, we have a main package called 'com.example' and two subpackages called 'utils' and 'models'. 
                The MyUtilityClass.java file would be placed in the 'utils' subpackage, while the MyModelClass.java file would be placed in the 'models' subpackage. 
                The MyMainClass.java file would be placed directly in the 'com.example' package.
         */

        ArrayList list1 = new ArrayList();
        LinkedList list2 = new LinkedList();

        list1.add("Hi");
        list2.add("Java");

        System.out.println(list1);
        System.out.println(list2);


    }
}
