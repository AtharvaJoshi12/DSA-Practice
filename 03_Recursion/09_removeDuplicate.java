
// Remove duplicate characters from string

public class practice {

        public static boolean map[] = new boolean[26];

        public static void removeDuplicates(String str, int index,String newString)
        {
            if (index==str.length())
            {
                System.out.println(newString);
                return;
            }

            char currChar = str.charAt(index);

            if (map[currChar-'a'])
                removeDuplicates(str,index+1,newString);
            else {
                newString += currChar;
                map[currChar-'a'] = true;
                removeDuplicates(str,index+1,newString);
            }

        }

        public static void main(String[] args) {
            String s = "abbaccd";
            removeDuplicates(s,0,"");

        }
    }

