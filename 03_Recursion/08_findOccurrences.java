
// Find first and last occurrence of given character in a String.

public class practice {

        public static int first = -1;
        public static int last = -1;
        public static void findOccurrences(String str, int index,char ch)
        {
            if (index==str.length())
            {
                System.out.println(first);
                System.out.println(last);
                return;
            }

            char currChar = str.charAt(index);
            if (currChar==ch){
                if (first==-1)
                    first = index;
                else
                    last = index;
            }

            findOccurrences(str,index+1,ch);
        }

        public static void main(String[] args) {
            String s = "abbabbabb";
            findOccurrences(s,0,'b');

        }
    }

