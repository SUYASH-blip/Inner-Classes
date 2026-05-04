class UserSystem {

    static String platformName = "GARUD AI"; // static member

    // Static Nested Class
    static class User {
        String name;
        int id;

        // Constructor
        User(String name, int id) {
            this.name = name;
            this.id = id;
        }

        // Method to display user info
        void display() {
            // Accessing outer class static member directly
            System.out.println("Platform: " + platformName);
            System.out.println("User Name: " + name);
            System.out.println("User ID: " + id);
        }
    }
}





public class Static_Nested_Class {
    public static void main(String[] args) {

        // Creating object of static nested class
        UserSystem.User u1 = new UserSystem.User("Suyash", 101);
        u1.display();

        System.out.println("------------------");

        UserSystem.User u2 = new UserSystem.User("Rahul", 102);
        u2.display();
    }
}

