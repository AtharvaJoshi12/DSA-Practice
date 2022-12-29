// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume
//  that the majority element always exists in the array.

// Moore's Voting Algorithm

//Link - https://leetcode.com/problems/majority-element/submissions/867379770/




public class practice {

    public static void majorityElement(int[] array) {

        int ansIndex = 0;
        int count = 1;
        for(int i = 0; i< array.length;i++)
        {
            if (array[i]==array[ansIndex])
                count++;
            else
                count--;
            if (count==0){
                ansIndex = i;
                count = 1;
            }
        }
        int ansCount = 0;
        for(int i = 0; i < array.length;i++)
        {
            if (array[ansIndex] == array[i])
                ansCount++;
        }

        if (ansCount>(array.length/2))
            System.out.println(array[ansIndex]);
        else
            System.out.println("-1");
    }



    public static void main(String[] args) {
        int []array = {2,2,1,1,1,2,2};
        majorityElement(array);
    }
}

