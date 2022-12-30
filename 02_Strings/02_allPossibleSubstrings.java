// Write a function to print all possible substrings
// Link - https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120294/offering/1403012?leftPanelTab=0

    public class practice {

        public static void printSubstrings(String s)
        {
            int i;
            for( i = 0;i<s.length();i++)
            {
                for(int j = i+1;j<=s.length();j++)
                {
                    System.out.println(s.substring(i,j));
                }
            }
        }


        public static void main(String[] args) {

            String s ="co";
            printSubstrings(s);

        }
    }

