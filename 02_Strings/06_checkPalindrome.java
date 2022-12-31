// Given a string S, check if it is palindrome or not.
// A string is called a palindrome string if the reverse of that string is the same as the original string

// Link - https://practice.geeksforgeeks.org/problems/palindrome-string0817/1

    
    public class practice {  
        public static void checkPalindrome(String s )
        {
            int start = 0;
            int end = s.length()-1;
            int count = 0;

            while(start<end)
            {

                if ( s.charAt(start) == s.charAt(end)) {
                    start++;
                    end--;
                    count++;
                }
                else
                {
                    System.out.println("Not palindrome");
                    break;
                }
            }
            if (count>0)
                System.out.println("Palindrome");

        }

        public static void main(String[] args) {

            String s ="ababa";
            checkPalindrome(s);

        }
    }

