// Print Nth Fibonacci Number
// Link - https://leetcode.com/problems/fibonacci-number/description/


public class practice {
        public static int printNthFibonacciNumber(int n)
        {
            // base case
            if(n==0)
                return 0;
            if(n==1)
                return 1;

            return printNthFibonacciNumber(n-1)+printNthFibonacciNumber(n-2);
        }

        public static void main(String[] args) {
            System.out.println(printNthFibonacciNumber(4));
        }
    }

