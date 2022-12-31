// Maximum Occuring Character

// Given a string str. The task is to find the maximum occurring character in the string str. If more than one character occurs the maximum number of time then print the lexicographically smaller character.

// Link - https://practice.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1

public class practice {
        public static void getMaxOccuringChar(String s )
        {
          int array[] = new int[26];

          for (int i = 0; i<s.length();i++)
          {
              char ch = s.charAt(i);
              int number = 0;
              number=ch-'a';
              array[number]++;
          }
          int max = -1,ans = 0;
          for(int i = 0;i<26;i++)
          {
              if (max<array[i]) {
                  ans = i;
                  max = array[i];
              }
          }

          char finalAns = (char)('a' + ans);
          System.out.println(finalAns);

        }
        
        public static void main(String[] args) {
            String s ="abababz";
            getMaxOccuringChar(s);

        }
    }

