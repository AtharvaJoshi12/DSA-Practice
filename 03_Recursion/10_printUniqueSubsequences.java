import java.util.HashSet;

public class practice {
        public static void printUniqueSubsequences(String str, int index,String newString,HashSet<String> set)
        {
            if (index==str.length())
            {
                if (set.contains(newString))
                    return;

                else {
                    System.out.println(newString);
                    set.add(newString);
                    return;
                }
            }

            char currChar = str.charAt(index);
            // to be
            printUniqueSubsequences(str,index+1,newString+currChar,set);

            // not to be
            printUniqueSubsequences(str,index+1,newString,set);

        }

        public static void main(String[] args) {
            String s = "aaa";
            HashSet<String> set = new HashSet<>();
            printUniqueSubsequences(s,0,"",set);
        }
    }

