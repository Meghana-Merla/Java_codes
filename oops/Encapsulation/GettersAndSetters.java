package oops.Encapsulation;

public class GettersAndSetters {
    class BankAccount {
        private double balance; // Encapsulated balance, not directly accessible from outside the class

        public double getBalance() {
            return balance; // Getter method to retrieve the value of balance
        }

        public void setBalance(double balance) {
            if (balance >= 0) { // Validation to prevent setting a negative balance
                this.balance = balance; // Setter method to set the value of balance
            } else {
                System.out.println("Invalid balance amount.");
            }
        }
    }
    public static void main(String[] args) {
        /*Getters and Setters are methods used to access and modify the private fields of a class in an encapsulated manner. 
        They provide a controlled way to access and update the values of private variables, ensuring that any necessary validation or logic can be applied when getting or setting the values.

        A getter method is used to retrieve the value of a private field, while a setter method is used to set or update the value of a private field. 
        By using getters and setters, you can enforce encapsulation by keeping the internal state of an object hidden from outside code and providing a controlled interface for interacting with that state.

        For example, if you have a private field called 'age' in a class, you can create a getter method called 'getAge()' to retrieve the value of 'age' and a setter method called 'setAge(int age)' to set the value of 'age'. 
        In the setter method, you can include validation logic to ensure that the age being set is within a valid range (e.g., between 0 and 120), thus protecting the integrity of the data.
        Accesors and Mutators are other terms for Getters and Setters, respectively.

        What is Mutator and Accessor?
        Mutator and Accessor are terms used to describe methods that modify (mutate) or access (retrieve) the state of an object, respectively.
        
        An Accessor method, also known as a Getter, is a method that retrieves the value of a private field in a class. 
        It allows external code to access the value of the field without directly exposing it. 
        For example, if you have a private field called 'name' in a class, you can create an Accessor method called 'getName()' that returns the value of 'name'.
        
        A Mutator method, also known as a Setter, is a method that modifies the value of a private field in a class. 
        It allows external code to change the value of the field while still maintaining control over how the value is set. 
        For example, if you have a private field called 'age' in a class, you can create a Mutator method called 'setAge(int age)' that sets the value of 'age' while also including validation logic to ensure that the age being set is within a valid range (e.g., between 0 and 120).
        
        By using Accessor and Mutator methods, you can enforce encapsulation by keeping the internal state of an object hidden from outside code and providing a controlled interface for interacting with that state. 
        This promotes better code maintainability and helps to protect the integrity of the data.

        Syntax of Getters and Setters:
        DataType getFieldName() {
            // Logic to retrieve and return the value of the field
        }
        void setFieldName(DataType fieldValue) {
            // Validation or logic to set the value of the field
        }
        
        
        */
        BankAccount account = new GettersAndSetters().new BankAccount();
        account.setBalance(1000); // Setting a valid balance
        System.out.println("Current Balance: " + account.getBalance()); // Getting the current balance
        account.setBalance(-500); // Attempting to set an invalid balance, will print an error message
        System.out.println("Current Balance: " + account.getBalance()); // Getting the current balance again to show that it has not changed

        //Convention for boolean getters is to use 'is' instead of 'get' and setters remain the same. For example: isActive() for a boolean field named 'active'.

    }
}
