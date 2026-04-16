package oops.Encapsulation;

public class intro {
    /* 
    class BankAccount{
        public double balance; // This is not encapsulated, anyone can access and modify it directly 
    }
    public class Hacker{
        public void hackAccount(BankAccount account){
            account.balance = 1000000; // Directly modifying the balance without any restrictions
        }
    }
        Problem: The balance is publicly accessible, which can lead to security issues and data integrity problems.
    */
    //Implementing Encapsulation
    class BankAccount{
        private double balance; // Encapsulated balance, not directly accessible from outside the class

        public void deposit(double amount) {
            if (amount > 0) { // Validation to prevent depositing a negative amount
                this.balance += amount;
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }
    }
    public static void main(String[] args) {
        /*Encapsulation is one of the fundamental principles of Object-Oriented Programming (OOP) that focuses on bundling data and methods that operate on that data within a single unit, typically a class. It helps to hide the internal state of an object and only expose a controlled interface to interact with that object.

        The main idea behind encapsulation is to protect the integrity of the data by preventing unauthorized access and modification. By using access modifiers (such as private, protected, and public) and getter/setter methods, you can control how the data is accessed and modified from outside the class.

        Encapsulation promotes code maintainability and flexibility by allowing changes to the internal implementation without affecting the external code that uses the class. It also enhances security by restricting direct access to sensitive data and providing controlled access through methods.

        In Java, encapsulation is achieved through the use of classes, access modifiers, and getter/setter methods. By following encapsulation principles, you can create more robust and maintainable code.
        */

        /*
        Imagine you have bank account where balance is publicly accessible. 
        Anyone can directly modify the balance without any restrictions, which can lead to security issues and data integrity problems. 
        However, if you encapsulate the balance by making it private and providing public getter and setter methods, you can control how the balance is accessed and modified. 
        For example, you can add validation in the setter method to ensure that the balance cannot be set to a negative value, thus protecting the integrity of the data.
        */
        BankAccount account = new intro().new BankAccount();
        account.deposit(500); // Valid deposit
        account.deposit(-100); // Invalid deposit, will print an error message

        /*
        Tightly Encapsulated Class: A class that has all its fields declared as private and provides public getter and setter methods to access and modify those fields is considered a tightly encapsulated class. 
        This means that the internal state of the class is well-protected and can only be accessed and modified through controlled methods, ensuring better data integrity and security.
        */

        /*
        Why Encapsulation is important?
        1. Data Protection: Encapsulation helps to protect the internal state of an object by hiding its data and only allowing access through controlled methods. 
        This prevents unauthorized access and modification of the data, ensuring that the integrity of the object is maintained.
        2. Modularity: Encapsulation promotes modularity by allowing you to group related data and methods together within a class. 
        This makes it easier to manage and maintain the code, as you can focus on specific parts of the class without worrying about the internal details.
        3. Code Reusability: Encapsulation allows you to create reusable code by defining classes that can be easily instantiated and used in different parts of the application. 
        This promotes code reuse and reduces redundancy, making your code more efficient and easier to maintain.
        4. Flexibility and Maintainability: Encapsulation allows you to change the internal implementation of a class without affecting the external code that uses it. 
        This means that you can modify the internal workings of a class without breaking the code that relies on it, making your code more flexible and easier to maintain.
        5. Improved Security: By encapsulating sensitive data and providing controlled access through methods, you can enhance the security of your application. 
        This is especially important when dealing with sensitive information such as passwords, financial data, or personal information, as it helps to prevent unauthorized access and protect the privacy of users.
         * Encapsulation is a fundamental principle of object-oriented programming that helps to create robust, maintainable, 
           and secure code by controlling access to the internal state of objects and providing a clear interface for interacting with them.
        */
    }
}
