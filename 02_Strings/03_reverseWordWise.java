// Reverse String Word Wise

// Link - https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120294/offering/1403013


    public class practice {

        public static void reverseStringWordWise(String s)
        {
            String[] words = s.split(" ");
            int i = 0, j = words.length - 1;
            while (i < j) {
                String temp = words[i];
                words[i] = words[j];
                words[j] = temp;
                i++;
                j--;
            }
            String ans = "";
            for (i = 0; i < words.length; i++) {
                ans += (words[i] + " ");
            }

            System.out.println(ans);
        }



        public static void main(String[] args) {

            String s ="Atharva Joshi";
            reverseStringWordWise(s);

        }
    }

