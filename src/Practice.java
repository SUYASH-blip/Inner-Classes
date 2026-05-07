
    class University {

        // Static data member
        static String universityName = "IIT Delhi";

        // Outer class non-static member
        int students = 5000;

        // Static Nested Class
        static class Department {

            void display() {

                // Can directly access static members of outer class
                System.out.println("University Name: " + universityName);

                // Cannot directly access non-static members
                // System.out.println(students); ❌ ERROR
            }
        }
    }


    public class Practice {
        public static void main(String[] args) {

            // Creating object of static nested class
            University.Department d = new University.Department();

            d.display();
        }
    }

