
public class practice {
        public static int factorial(int n)
        {
            // Base Case
            if (n == 0)
                return 1;
            // Recursive relation
            return n*factorial(n-1);
        }

        public static void main(String[] args) {
            System.out.println(factorial(5));
        }
    }

