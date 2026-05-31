public class recursion {


        static void printNumbers(int n) {
            if (n == 0) {
                return; // Base case
            }

            System.out.println(n);
            printNumbers(n - 1); // Recursive call
        }

        public static void main(String[] args) {
            printNumbers(5);
        }
    }

