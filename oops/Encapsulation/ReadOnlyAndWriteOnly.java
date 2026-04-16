package oops.Encapsulation;

public class ReadOnlyAndWriteOnly {
    class College{
        private String collegeName; // This is a read-only field, it can only be accessed through a getter method

        public String getCollegeName() {
            return collegeName; // Getter method to access the value of collegeName
        }
    }
    class User{
        private String password; // This is a write-only field, it can only be modified through a setter method

        public void setPassword(String password) {
            this.password = password; // Setter method to modify the value of password
        }
    }
    public static void main(String[] args) {
        /*Read-Only and Write-Only are concepts related to encapsulation in object-oriented programming that define the accessibility of class members (fields and methods) to external code.

        Read-Only: A read-only member is a class member that can only be accessed (read) from outside the class, but cannot be modified (written to) directly. 
        This is typically achieved by declaring the member as private and providing only a getter method to access its value.
        For example, if you have a private field called 'name' in a class, you can create a getter method called 'getName()' that returns the value of 'name', but you would not provide a setter method to modify it. 
        This way, the 'name' field is read-only from the perspective of external code.
        Write-Only: A write-only member is a class member that can only be modified (written to) from outside the class, but cannot be accessed (read) directly. 
        This is typically achieved by declaring the member as private and providing only a setter method to modify its value.
        For example, if you have a private field called 'password' in a class, you can create a setter method called 'setPassword(String password)' that allows external code to set the value of 'password', but you would not provide a getter method to retrieve it. 
        This way, the 'password' field is write-only from the perspective of external code.
        By using read-only and write-only members, you can control the accessibility of class members and enforce encapsulation principles, ensuring that sensitive data is protected and that the internal state of an object is not exposed unnecessarily.
        */
        College college = new ReadOnlyAndWriteOnly().new College();
        // college.collegeName = "ABC College"; // This will cause a compilation error because collegeName is private and there is no setter method to modify it
        System.out.println("College Name: " + college.getCollegeName()); // This will work because there is a getter method to access the value of collegeName
        User user = new ReadOnlyAndWriteOnly().new User();
        user.setPassword("mySecretPassword"); // This will work because there is a setter method to modify the value of password
        // System.out.println("Password: " + user.getPassword()); // This will cause a compilation error because there is no getter method to access the value of password
    }

}
