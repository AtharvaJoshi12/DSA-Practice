
public class practice {
        public static int calculatePower(int x, int n)
        {
            // Base Case
            if (n == 0)
                return 1;
            if (x == 0)
                return 0;

            // Recursive relation
            if(n%2==0)
                return calculatePower(x,n/2) * calculatePower(x,n/2);
            else
                return calculatePower(x,n/2)*calculatePower(x,n/2)*x;
        }

        public static void main(String[] args) {
            System.out.println(calculatePower(2,5));
        }
    }

