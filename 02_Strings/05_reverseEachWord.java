
    public class practice {
        public static StringBuilder reverseString(StringBuilder s)
        {
            int start = 0;
            int end = s.length()-1;
            while (start<end)
            {
                char temp = s.charAt(start);
                s.setCharAt(start,s.charAt(end));
                s.setCharAt(end,temp);
                start++;
                end--;
            }
            return (s);
        }

        public static void removeAllOccurrencesOfChar(String s )
        {
            String[] words = s.split(" ");
            int i = 0, j = words.length - 1;
            for ( i = 0;i< words.length;i++)
            {
                StringBuilder str = new StringBuilder(words[i]);
                words[i]   = "".concat(""+ reverseString(str));
            }
            String ans = "";
            for (i = 0; i < words.length; i++) {
                ans += (words[i] + " ");
            }
            System.out.println(ans);

        }



        public static void main(String[] args) {

            String s ="Atharva joshi";
            removeAllOccurrencesOfChar(s);

        }
    }

