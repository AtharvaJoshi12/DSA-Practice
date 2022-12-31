// Print all the duplicates in the input string
// Link - https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/

import java.util.Arrays;

public class practice {
        
        public static void countDuplicate(String s )
        {
          char array[] =  s.toCharArray();
            Arrays.sort(array);

            for(int i = 0;i<array.length;i++)
            {
                System.out.print(array[i]);
            }
            System.out.println();
            int count = 1;
            for (int i = 1;i< array.length;i++)
            {
                if (array[i-1]==array[i])
                {
                    count++;
                }
                else {
                    System.out.print(array[i-1] + ":" + count);
                    count = 1;
                }
            }
        }



        public static void main(String[] args) {

            String s ="ababaz";
            calculateDuplicate(s);

        }
    }

