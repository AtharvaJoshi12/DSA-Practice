// Remove All Occurrences Of Chararacter from string.

// Link - https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120294/offering/1403017?leftPanelTab=0


    public class practice {

        public static void removeAllOccurrencesOfChar(String s,char c )
        {
           StringBuilder ans = new StringBuilder(s);
           String answer = "";
           for (int i = 0;i<ans.length();i++)
           {
               if (ans.charAt(i)!=c) {
                   answer = answer + ans.charAt(i);
               }
           }

            System.out.println(answer);
        }



        public static void main(String[] args) {

            String s ="cxoxdxixnxgxnxixnxjxaxsx";
            removeAllOccurrencesOfChar(s,'x');

        }
    }

