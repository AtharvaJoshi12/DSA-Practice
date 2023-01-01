// input - 412
// output - four one two


public class practice {
        public static void sayDigit(int n,String array[])
        {
            // base case
            if(n == 0)
                return;

            // processing
            int digit = n%10;
            n = n/10;

            // recursive call
            sayDigit(n,array);
            System.out.println(array[digit]);

        }

        public static void main(String[] args) {
            String array[] = {"Zero","one","two","three","four","five","six","seven","eight","nine"};
            sayDigit(412,array);
        }
    }

